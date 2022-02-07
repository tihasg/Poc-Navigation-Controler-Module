package tihasg.navigation.controler.catalog.ui

import android.content.Context
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.nhaarman.mockitokotlin2.whenever
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runBlockingTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner
import tihasg.navigation.controler.navigation.CarrinhoNavController

@RunWith(MockitoJUnitRunner.Silent::class)
@ExperimentalCoroutinesApi

class CatalogoViewModelTest {

    private val dispatcher: TestCoroutineDispatcher = TestCoroutineDispatcher()

    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var viewModel: CatalogoViewModel

    @Mock
    private lateinit var cartNavController: CarrinhoNavController

    @Mock
    private lateinit var context: Context


    @Before
    fun setup() {
        Dispatchers.setMain(dispatcher)
        MockitoAnnotations.initMocks(this)
        viewModel = CatalogoViewModel(cartNavController)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun goToCatalog() = TestCoroutineDispatcher().runBlockingTest {
        val expected = ""
        val actual =  viewModel.goToCatalog(context)

        viewModel.goToCatalog(context)


        assertEquals(expected, actual)
    }
}