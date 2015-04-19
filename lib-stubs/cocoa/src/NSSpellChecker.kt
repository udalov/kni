// generated from "/System/Library/Frameworks/AppKit.framework/Headers/NSSpellChecker.h"

[file: suppress("UNCHECKED_CAST")]

package objc

import kni.objc.*


public open class NSSpellChecker(pointer: Long) : NSObject(pointer), NSSpellChecker_NSDeprecated {
    public open fun checkSpellingOfString_startingAt_language_wrap_inSpellDocumentWithTag_wordCount(stringToCheck: NSString, startingOffset: Int, language: NSString, wrapFlag: Boolean, tag: Int, wordCount: Pointer<Int>): Any =
        Native.objc_msgSend("class objc.Any", this, "checkSpellingOfString:startingAt:language:wrap:inSpellDocumentWithTag:wordCount:", stringToCheck, startingOffset, language, wrapFlag, tag, wordCount)

    public open fun checkSpellingOfString_startingAt(stringToCheck: NSString, startingOffset: Int): Any =
        Native.objc_msgSend("class objc.Any", this, "checkSpellingOfString:startingAt:", stringToCheck, startingOffset)

    public open fun countWordsInString_language(stringToCount: NSString, language: NSString): Int =
        Native.objc_msgSend("int", this, "countWordsInString:language:", stringToCount, language) as Int

    public open fun checkGrammarOfString_startingAt_language_wrap_inSpellDocumentWithTag_details(stringToCheck: NSString, startingOffset: Int, language: NSString, wrapFlag: Boolean, tag: Int, details: Pointer<NSArray>): Any =
        Native.objc_msgSend("class objc.Any", this, "checkGrammarOfString:startingAt:language:wrap:inSpellDocumentWithTag:details:", stringToCheck, startingOffset, language, wrapFlag, tag, details)

    public open fun checkString_range_types_options_inSpellDocumentWithTag_orthography_wordCount(stringToCheck: NSString, range: Any, checkingTypes: Long, options: NSDictionary, tag: Int, orthography: Pointer<NSOrthography>, wordCount: Pointer<Int>): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "checkString:range:types:options:inSpellDocumentWithTag:orthography:wordCount:", stringToCheck, range, checkingTypes, options, tag, orthography, wordCount) as NSArray

    public open fun requestCheckingOfString_range_types_options_inSpellDocumentWithTag_completionHandler(stringToCheck: NSString, range: Any, checkingTypes: Long, options: NSDictionary, tag: Int, completionHandler: Any): Int =
        Native.objc_msgSend("int", this, "requestCheckingOfString:range:types:options:inSpellDocumentWithTag:completionHandler:", stringToCheck, range, checkingTypes, options, tag, completionHandler) as Int

    public open fun menuForResult_string_options_atLocation_inView(result: NSTextCheckingResult, checkedString: NSString, options: NSDictionary, location: Any, view: NSView): NSMenu =
        Native.objc_msgSend("class objc.NSMenu", this, "menuForResult:string:options:atLocation:inView:", result, checkedString, options, location, view) as NSMenu

    public open fun userQuotesArrayForLanguage(language: NSString): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "userQuotesArrayForLanguage:", language) as NSArray

    public open fun userReplacementsDictionary(): NSDictionary =
        Native.objc_msgSend("class objc.NSDictionary", this, "userReplacementsDictionary") as NSDictionary

    public open fun updateSpellingPanelWithMisspelledWord(word: NSString): Unit {
        Native.objc_msgSend("void", this, "updateSpellingPanelWithMisspelledWord:", word)
    }

    public open fun updateSpellingPanelWithGrammarString_detail(string: NSString, detail: NSDictionary): Unit {
        Native.objc_msgSend("void", this, "updateSpellingPanelWithGrammarString:detail:", string, detail)
    }

    public open fun spellingPanel(): NSPanel =
        Native.objc_msgSend("class objc.NSPanel", this, "spellingPanel") as NSPanel

    public open fun accessoryView(): NSView =
        Native.objc_msgSend("class objc.NSView", this, "accessoryView") as NSView

    public open fun setAccessoryView(accessoryView: NSView): Unit {
        Native.objc_msgSend("void", this, "setAccessoryView:", accessoryView)
    }

    public open fun substitutionsPanel(): NSPanel =
        Native.objc_msgSend("class objc.NSPanel", this, "substitutionsPanel") as NSPanel

    public open fun substitutionsPanelAccessoryViewController(): NSViewController =
        Native.objc_msgSend("class objc.NSViewController", this, "substitutionsPanelAccessoryViewController") as NSViewController

    public open fun setSubstitutionsPanelAccessoryViewController(substitutionsPanelAccessoryViewController: NSViewController): Unit {
        Native.objc_msgSend("void", this, "setSubstitutionsPanelAccessoryViewController:", substitutionsPanelAccessoryViewController)
    }

    public open fun updatePanels(): Unit {
        Native.objc_msgSend("void", this, "updatePanels")
    }

    public open fun ignoreWord_inSpellDocumentWithTag(wordToIgnore: NSString, tag: Int): Unit {
        Native.objc_msgSend("void", this, "ignoreWord:inSpellDocumentWithTag:", wordToIgnore, tag)
    }

    public open fun ignoredWordsInSpellDocumentWithTag(tag: Int): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "ignoredWordsInSpellDocumentWithTag:", tag) as NSArray

    public open fun setIgnoredWords_inSpellDocumentWithTag(words: NSArray, tag: Int): Unit {
        Native.objc_msgSend("void", this, "setIgnoredWords:inSpellDocumentWithTag:", words, tag)
    }

    public open fun guessesForWordRange_inString_language_inSpellDocumentWithTag(range: Any, string: NSString, language: NSString, tag: Int): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "guessesForWordRange:inString:language:inSpellDocumentWithTag:", range, string, language, tag) as NSArray

    public open fun correctionForWordRange_inString_language_inSpellDocumentWithTag(range: Any, string: NSString, language: NSString, tag: Int): NSString =
        Native.objc_msgSend("class objc.NSString", this, "correctionForWordRange:inString:language:inSpellDocumentWithTag:", range, string, language, tag) as NSString

    public open fun completionsForPartialWordRange_inString_language_inSpellDocumentWithTag(range: Any, string: NSString, language: NSString, tag: Int): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "completionsForPartialWordRange:inString:language:inSpellDocumentWithTag:", range, string, language, tag) as NSArray

    public open fun languageForWordRange_inString_orthography(range: Any, string: NSString, orthography: NSOrthography): NSString =
        Native.objc_msgSend("class objc.NSString", this, "languageForWordRange:inString:orthography:", range, string, orthography) as NSString

    public open fun closeSpellDocumentWithTag(tag: Int): Unit {
        Native.objc_msgSend("void", this, "closeSpellDocumentWithTag:", tag)
    }

    public open fun recordResponse_toCorrection_forWord_language_inSpellDocumentWithTag(response: Any, correction: NSString, word: NSString, language: NSString, tag: Int): Unit {
        Native.objc_msgSend("void", this, "recordResponse:toCorrection:forWord:language:inSpellDocumentWithTag:", response, correction, word, language, tag)
    }

    public open fun showCorrectionIndicatorOfType_primaryString_alternativeStrings_forStringInRect_view_completionHandler(type: Any, primaryString: NSString, alternativeStrings: NSArray, rectOfTypedString: Any, view: NSView, completionBlock: Any): Unit {
        Native.objc_msgSend("void", this, "showCorrectionIndicatorOfType:primaryString:alternativeStrings:forStringInRect:view:completionHandler:", type, primaryString, alternativeStrings, rectOfTypedString, view, completionBlock)
    }

    public open fun dismissCorrectionIndicatorForView(view: NSView): Unit {
        Native.objc_msgSend("void", this, "dismissCorrectionIndicatorForView:", view)
    }

    public open fun availableLanguages(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "availableLanguages") as NSArray

    public open fun userPreferredLanguages(): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "userPreferredLanguages") as NSArray

    public open fun automaticallyIdentifiesLanguages(): Boolean =
        Native.objc_msgSend("boolean", this, "automaticallyIdentifiesLanguages") as Boolean

    public open fun setAutomaticallyIdentifiesLanguages(automaticallyIdentifiesLanguages: Boolean): Unit {
        Native.objc_msgSend("void", this, "setAutomaticallyIdentifiesLanguages:", automaticallyIdentifiesLanguages)
    }

    public open fun setWordFieldStringValue(aString: NSString): Unit {
        Native.objc_msgSend("void", this, "setWordFieldStringValue:", aString)
    }

    public open fun learnWord(word: NSString): Unit {
        Native.objc_msgSend("void", this, "learnWord:", word)
    }

    public open fun hasLearnedWord(word: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "hasLearnedWord:", word) as Boolean

    public open fun unlearnWord(word: NSString): Unit {
        Native.objc_msgSend("void", this, "unlearnWord:", word)
    }

    public open fun language(): NSString =
        Native.objc_msgSend("class objc.NSString", this, "language") as NSString

    public open fun setLanguage(language: NSString): Boolean =
        Native.objc_msgSend("boolean", this, "setLanguage:", language) as Boolean

    override fun layoutSublayersOfLayer(layer: CALayer): Unit {
        Native.objc_msgSend("void", this, "layoutSublayersOfLayer:", layer)
    }

    trait metaclass : NSObject.metaclass, NSSpellChecker_NSDeprecated.metaclass {
        public open fun sharedSpellChecker(): NSSpellChecker =
            Native.objc_msgSend("class objc.NSSpellChecker", this, "sharedSpellChecker") as NSSpellChecker

        public open fun sharedSpellCheckerExists(): Boolean =
            Native.objc_msgSend("boolean", this, "sharedSpellCheckerExists") as Boolean

        public open fun uniqueSpellDocumentTag(): Int =
            Native.objc_msgSend("int", this, "uniqueSpellDocumentTag") as Int

        public open fun isAutomaticTextReplacementEnabled(): Boolean =
            Native.objc_msgSend("boolean", this, "isAutomaticTextReplacementEnabled") as Boolean

        public open fun isAutomaticSpellingCorrectionEnabled(): Boolean =
            Native.objc_msgSend("boolean", this, "isAutomaticSpellingCorrectionEnabled") as Boolean

        public open fun isAutomaticQuoteSubstitutionEnabled(): Boolean =
            Native.objc_msgSend("boolean", this, "isAutomaticQuoteSubstitutionEnabled") as Boolean

        public open fun isAutomaticDashSubstitutionEnabled(): Boolean =
            Native.objc_msgSend("boolean", this, "isAutomaticDashSubstitutionEnabled") as Boolean

    }

    companion object : NSObject(Native.objc_getClass("NSSpellChecker")), metaclass, ObjCClass {
        init { loadLibrary(interopConfig.nativeLibraryPath) }
    }
}

trait NSSpellChecker_NSDeprecated : IObjCObject {
    public open fun guessesForWord(word: NSString): NSArray =
        Native.objc_msgSend("class objc.NSArray", this, "guessesForWord:", word) as NSArray

    public open fun forgetWord(word: NSString): Unit {
        Native.objc_msgSend("void", this, "forgetWord:", word)
    }

    trait metaclass : IObjCObject
}
