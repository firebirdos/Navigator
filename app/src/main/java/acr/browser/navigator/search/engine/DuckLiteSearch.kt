package acr.browser.navigator.search.engine

import acr.browser.navigator.R

/**
 * The DuckDuckGo Lite search engine.
 *
 * See https://duckduckgo.com/assets/logo_homepage.normal.v101.png for the icon.
 */
class DuckLiteSearch : BaseSearchEngine(
    "file:///android_asset/duckduckgo.png",
    "https://duckduckgo.com/lite/?t=lightning&q=",
    R.string.search_engine_duckduckgo_lite
)
