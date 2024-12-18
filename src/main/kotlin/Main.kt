package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

const val URI_STRING = "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"

fun main() {
    val doc: Document = Jsoup.connect(URI_STRING).get()
    println(doc.title())
}