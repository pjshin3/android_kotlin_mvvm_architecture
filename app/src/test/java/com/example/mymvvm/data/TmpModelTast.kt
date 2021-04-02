package com.example.mymvvm.data

import com.example.mymvvm.data.localdata.TmpDataModel
import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class TmpModelTast {
    private lateinit var tmpModel : TmpDataModel
    @Before fun setUp() {
        tmpModel = TmpDataModel("으으으하하하".hashCode().toLong(),"philip")
    }
    @Test fun `test default model id`() {
        assertEquals(1234L, TmpDataModel().id)
    }

    @Test fun `test model id`() {
        assertEquals("으으으하하하".hashCode().toLong(), tmpModel.id)
    }

    @Test fun `test model name`(){
        assertEquals("philip", tmpModel.name)
    }
}