package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

const val URI_STRING = "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"

fun main() {
    val doc: Document = Jsoup.connect(URI_STRING).get()
    val quoteCssSelector = ".bzpNIu"
    val listQuote: Elements = doc.select(quoteCssSelector)
    var quotesText = ""
    for (quote: Element in listQuote) {
        quotesText += "${quote.text()}\n"
    }
    println(quotesText)
}