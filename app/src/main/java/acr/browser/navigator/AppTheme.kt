package acr.browser.navigator

import acr.browser.navigator.preference.IntEnum

/**
 * The available app themes.
 */
enum class AppTheme(override val value: Int) : IntEnum {
    LIGHT(0),
    DARK(1),
    BLACK(2)
}
