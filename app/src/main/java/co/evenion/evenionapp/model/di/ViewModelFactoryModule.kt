package  co.evenion.evenionapp.model.di

import androidx.lifecycle.ViewModelProvider
import co.evenion.evenionapp.vmfactory.StudentViewModelFactory

abstract class ViewModelFactoryModule {


    internal abstract fun bindViewModelFactory(vMFactory : StudentViewModelFactory) : ViewModelProvider.Factory
}