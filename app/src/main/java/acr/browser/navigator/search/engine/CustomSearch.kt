package acr.browser.navigator.search.engine

import acr.browser.navigator.R

/**
 * A custom search engine.
 */
class CustomSearch(queryUrl: String) : BaseSearchEngine(
    "file:///android_asset/navigator.png",
    queryUrl,
    R.string.search_engine_custom
)
