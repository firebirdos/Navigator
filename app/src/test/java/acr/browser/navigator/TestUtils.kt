@file:Suppress("NOTHING_TO_INLINE")

package acr.browser.navigator

/**
 * Use to implement an unimplemented method.
 */
inline fun unimplemented(): Nothing {
    throw NotImplementedError("Not implemented")
}
