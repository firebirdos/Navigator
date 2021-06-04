package acr.browser.navigator.di

import acr.browser.navigator.adblock.allowlist.AllowListModel
import acr.browser.navigator.adblock.allowlist.SessionAllowListModel
import acr.browser.navigator.adblock.source.AssetsHostsDataSource
import acr.browser.navigator.adblock.source.HostsDataSource
import acr.browser.navigator.adblock.source.HostsDataSourceProvider
import acr.browser.navigator.adblock.source.PreferencesHostsDataSourceProvider
import acr.browser.navigator.browser.cleanup.DelegatingExitCleanup
import acr.browser.navigator.browser.cleanup.ExitCleanup
import acr.browser.navigator.database.adblock.HostsDatabase
import acr.browser.navigator.database.adblock.HostsRepository
import acr.browser.navigator.database.allowlist.AdBlockAllowListDatabase
import acr.browser.navigator.database.allowlist.AdBlockAllowListRepository
import acr.browser.navigator.database.bookmark.BookmarkDatabase
import acr.browser.navigator.database.bookmark.BookmarkRepository
import acr.browser.navigator.database.downloads.DownloadsDatabase
import acr.browser.navigator.database.downloads.DownloadsRepository
import acr.browser.navigator.database.history.HistoryDatabase
import acr.browser.navigator.database.history.HistoryRepository
import acr.browser.navigator.ssl.SessionSslWarningPreferences
import acr.browser.navigator.ssl.SslWarningPreferences
import dagger.Binds
import dagger.Module

/**
 * Dependency injection module used to bind implementations to interfaces.
 */
@Module
interface AppBindsModule {

    @Binds
    fun bindsExitCleanup(delegatingExitCleanup: DelegatingExitCleanup): ExitCleanup

    @Binds
    fun bindsBookmarkModel(bookmarkDatabase: BookmarkDatabase): BookmarkRepository

    @Binds
    fun bindsDownloadsModel(downloadsDatabase: DownloadsDatabase): DownloadsRepository

    @Binds
    fun bindsHistoryModel(historyDatabase: HistoryDatabase): HistoryRepository

    @Binds
    fun bindsAdBlockAllowListModel(adBlockAllowListDatabase: AdBlockAllowListDatabase): AdBlockAllowListRepository

    @Binds
    fun bindsAllowListModel(sessionAllowListModel: SessionAllowListModel): AllowListModel

    @Binds
    fun bindsSslWarningPreferences(sessionSslWarningPreferences: SessionSslWarningPreferences): SslWarningPreferences

    @Binds
    fun bindsHostsDataSource(assetsHostsDataSource: AssetsHostsDataSource): HostsDataSource

    @Binds
    fun bindsHostsRepository(hostsDatabase: HostsDatabase): HostsRepository

    @Binds
    fun bindsHostsDataSourceProvider(preferencesHostsDataSourceProvider: PreferencesHostsDataSourceProvider): HostsDataSourceProvider
}
