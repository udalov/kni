
package org.jetbrains.kni.quickchecks

import com.pholser.junit.quickcheck.ForAll
import org.junit.contrib.theories.*
import org.junit.runner.RunWith

import org.hamcrest.Matchers.*
import org.junit.Assume.*
import org.junit.Assert.*
import com.pholser.junit.quickcheck.From
import com.pholser.junit.quickcheck.generator.Ctor
import com.pholser.junit.quickcheck.generator.Generator
import com.pholser.junit.quickcheck.random.SourceOfRandomness
import com.pholser.junit.quickcheck.generator.GenerationStatus

public class SimpleCHeader(
        public var baseName: String,
        public var guardName: String) {

    fun generate(): String = "$baseName - $guardName"
}

public class SimpleCHeaderGenerator : Generator<SimpleCHeader>(javaClass<SimpleCHeader>()) {
    override fun generate( random: SourceOfRandomness, status: GenerationStatus): SimpleCHeader {
        val gen = CGenGrammar({ (f,l) -> random.nextChar(f,l) }, { (f,l) -> random.nextInt(f,l) })
        var name = gen.generateValidId(random.nextInt(1,100))
        var guard = gen.generateValidId(random.nextInt(10,200))
        return SimpleCHeader(name, guard)
    }
}

RunWith(javaClass<Theories>())
public class SimpleCHeaderCheck {

    Theory public fun NameAndGuard(ForAll From(javaClass<SimpleCHeaderGenerator>()) header: SimpleCHeader) {
        assumeNotNull(header, header.baseName, header.guardName)
        println(header.generate())
        assertEquals(header.generate(), "${header.baseName} - ${header.guardName}")
    }
}

