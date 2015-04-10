
package swingHelloCocoa

import kni.objc.ObjCObject
import javax.swing.JFrame
import javax.swing.JScrollPane
import javax.swing.JTextArea
import kotlin.properties.Delegates
import kotlin.properties.ReadWriteProperty
import objc.*

class JTextAreaOutputStream(val textArea: JTextArea): java.io.OutputStream() {
    override fun write(b: Int) {
        textArea.append(b.toChar().toString())
        textArea.setCaretPosition(textArea.getDocument().getLength())
    }
}

fun main(args : Array<String>) {
    val w = JFrame("Title")
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
    w.setSize(600, 400)
    w.setVisible(true)
    val textArea = JTextArea(5, 10)
    val scrollPane = JScrollPane(textArea)
    val taStream = java.io.PrintStream(JTextAreaOutputStream(textArea))
    //System.setOut(taStream)
    //System.setErr(taStream)
    println("swing app started")
    val cocoaApp = NSApplication.sharedApplication() as NSApplication
    println("cocoa app taken")
    println("cocoa app is running == ${cocoaApp.isRunning()}")
    val iconImg = cocoaApp.applicationIconImage().copy() as NSImage
    iconImg.lockFocus()
    val rot = NSAffineTransform.transform()
    rot.rotateByDegrees(90.0)
    iconImg.unlockFocus()
    cocoaApp.setApplicationIconImage(iconImg)
    println("icon set")
}
