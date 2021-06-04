package acr.browser.navigator.browser

import acr.browser.navigator.database.Bookmark

interface BookmarksView {

    fun navigateBack()

    fun handleUpdatedUrl(url: String)

    fun handleBookmarkDeleted(bookmark: Bookmark)

}
