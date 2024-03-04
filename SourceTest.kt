package com.flying.xiaopo.poishuhui_kotlin.domain.network

import org.junit.Assert
import org.junit.Test

/**
 * @author wupanjie
 */
class SourceTest{
    @Test
    fun testCover(){
        var data = CoverSource().obtain("http://ishuhui.net/?PageIndex=1")
        Assert.assertFalse(data.size==0)
    }

    @Test
    fun testBook(){
        var data = BookSource().obtain("http://ishuhui.net/ComicBookList/")
        Assert.assertFalse(data.size==0)
    }

    @Test
    fun testComic(){
        var data = ComicSource().obtain("http://ishuhui.net/ReadComicBooks/4581.html")
        Assert.assertFalse(data.size==0)

    }

    @Test
    fun testBookDetail(){
        var data = BookDetailSource().obtain("http://ishuhui.net/ComicBookInfo/45")
        Assert.assertFalse(data.size()==0)
    }
}
