package ch.tutteli.atrium.translations

import ch.tutteli.atrium.assertions.DescriptiveAssertion
import ch.tutteli.atrium.reporting.translating.StringBasedTranslatable

/**
 * Contains the [DescriptiveAssertion.description]s of the assertion functions which are applicable to [Map].
 */
enum class DescriptionMapAssertion(override val value: String) : StringBasedTranslatable {
    CANNOT_EVALUATE_KEY_DOES_NOT_EXIST("$COULD_NOT_EVALUATE_DEFINED_ASSERTIONS -- given key does not exist.\n$VISIT_COULD_NOT_EVALUATE_ASSERTIONS"),
    CONTAINS_IN_ANY_ORDER("contains, in any order"),
    CONTAINS_KEY("contains key"),
    CONTAINS_NOT_KEY("does not contain key"),
    ENTRY_WITH_KEY("entry %s"),
    KEY_DOES_NOT_EXIST("❗❗ key does not exist"),
    SIZE("size"),
}
