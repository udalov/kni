// generated from "/System/Library/Frameworks/Foundation.framework/Headers/NSPathUtilities.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


trait NSString_NSStringPathExtensions : IObjCObject {
    public open fun pathComponents(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "pathComponents") as NSArray

    public open fun isAbsolutePath(): Boolean =
        Native.objc_msgSend("boolean", this, "isAbsolutePath") as Boolean

    public open fun lastPathComponent(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "lastPathComponent") as NSString

    public open fun stringByDeletingLastPathComponent(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringByDeletingLastPathComponent") as NSString

    public open fun stringByAppendingPathComponent(str: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringByAppendingPathComponent:", str) as NSString

    public open fun pathExtension(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "pathExtension") as NSString

    public open fun stringByDeletingPathExtension(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringByDeletingPathExtension") as NSString

    public open fun stringByAppendingPathExtension(str: NSString): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringByAppendingPathExtension:", str) as NSString

    public open fun stringByAbbreviatingWithTildeInPath(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringByAbbreviatingWithTildeInPath") as NSString

    public open fun stringByExpandingTildeInPath(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringByExpandingTildeInPath") as NSString

    public open fun stringByStandardizingPath(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringByStandardizingPath") as NSString

    public open fun stringByResolvingSymlinksInPath(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "stringByResolvingSymlinksInPath") as NSString

    public open fun stringsByAppendingPaths(paths: NSArray): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "stringsByAppendingPaths:", paths) as NSArray

    public open fun completePathIntoString_caseSensitive_matchesIntoArray_filterTypes(outputName: Pointer<NSString>, flag: Boolean, outputArray: Pointer<NSArray>, filterTypes: NSArray): Int =
        Native.objc_msgSend("int", this, "completePathIntoString:caseSensitive:matchesIntoArray:filterTypes:", outputName, flag, outputArray, filterTypes) as Int

    public open fun fileSystemRepresentation(): Pointer<Char> =
        Native.objc_msgSend("class kni.objc.Pointer", this, "fileSystemRepresentation") as Pointer<Char>

    public open fun getFileSystemRepresentation_maxLength(cname: Pointer<Char>, max: Int): Boolean =
        Native.objc_msgSend("boolean", this, "getFileSystemRepresentation:maxLength:", cname, max) as Boolean

    trait metaclass : IObjCObject {
        public open fun pathWithComponents(components: NSArray): NSString =
            Native.objc_msgSend("class objc.NSString", this, "pathWithComponents:", components) as NSString
    }
}

trait NSArray_NSArrayPathExtensions : IObjCObject {
    public open fun pathsMatchingExtensions(filterTypes: NSArray): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "pathsMatchingExtensions:", filterTypes) as NSArray

    trait metaclass : IObjCObject
}
