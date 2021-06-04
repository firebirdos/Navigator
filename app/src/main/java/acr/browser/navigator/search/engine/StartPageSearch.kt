package acr.browser.navigator.search.engine

import acr.browser.navigator.R

/**
 * The StartPage search engine.
 */
class StartPageSearch : BaseSearchEngine(
    "file:///android_asset/startpage.png",
    "https://startpage.com/do/search?language=english&query=",
    R.string.search_engine_startpage
)
