package acr.browser.navigator.di

import acr.browser.navigator.BrowserApp
import acr.browser.navigator.adblock.BloomFilterAdBlocker
import acr.browser.navigator.adblock.NoOpAdBlocker
import acr.browser.navigator.browser.SearchBoxModel
import acr.browser.navigator.browser.activity.BrowserActivity
import acr.browser.navigator.browser.activity.ThemableBrowserActivity
import acr.browser.navigator.browser.bookmarks.BookmarksDrawerView
import acr.browser.navigator.device.BuildInfo
import acr.browser.navigator.dialog.LightningDialogBuilder
import acr.browser.navigator.download.LightningDownloadListener
import acr.browser.navigator.reading.activity.ReadingActivity
import acr.browser.navigator.search.SuggestionsAdapter
import acr.browser.navigator.settings.activity.SettingsActivity
import acr.browser.navigator.settings.activity.ThemableSettingsActivity
import acr.browser.navigator.settings.fragment.*
import acr.browser.navigator.view.LightningChromeClient
import acr.browser.navigator.view.LightningView
import acr.browser.navigator.view.LightningWebClient
import android.app.Application
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(AppModule::class), (AppBindsModule::class)])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        @BindsInstance
        fun buildInfo(buildInfo: BuildInfo): Builder

        fun build(): AppComponent
    }

    fun inject(activity: BrowserActivity)

    fun inject(fragment: BookmarkSettingsFragment)

    fun inject(builder: LightningDialogBuilder)

    fun inject(lightningView: LightningView)

    fun inject(activity: ThemableBrowserActivity)

    fun inject(advancedSettingsFragment: AdvancedSettingsFragment)

    fun inject(app: BrowserApp)

    fun inject(activity: ReadingActivity)

    fun inject(webClient: LightningWebClient)

    fun inject(activity: SettingsActivity)

    fun inject(activity: ThemableSettingsActivity)

    fun inject(listener: LightningDownloadListener)

    fun inject(fragment: PrivacySettingsFragment)

    fun inject(fragment: DebugSettingsFragment)

    fun inject(suggestionsAdapter: SuggestionsAdapter)

    fun inject(chromeClient: LightningChromeClient)

    fun inject(searchBoxModel: SearchBoxModel)

    fun inject(generalSettingsFragment: GeneralSettingsFragment)

    fun inject(displaySettingsFragment: DisplaySettingsFragment)

    fun inject(adBlockSettingsFragment: AdBlockSettingsFragment)

    fun inject(bookmarksView: BookmarksDrawerView)

    fun provideBloomFilterAdBlocker(): BloomFilterAdBlocker

    fun provideNoOpAdBlocker(): NoOpAdBlocker

}
