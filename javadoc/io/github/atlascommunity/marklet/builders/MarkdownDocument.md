# Class MarkdownDocument

* Package [io.github.atlascommunity.marklet.builders](Index.md)
*  > [MarkdownDocument](MarkdownDocumentmd)

This class aims to build Markdown document. It is built in a top of a 
 instance which will contains our document content.


## Summary
#### Constructors
| Visibility | Signature |
| --- | --- |
| `public` | [MarkdownDocument](#markdowndocument)() |

#### Methods
| Type and modifiers | Method signature |
| --- | --- |
| `public final` `void` | [bold](#boldstring)( text) |
| `public final` `void` | [breakingReturn](#breakingreturn)() |
| `public final`  | [build](#build)() |
| `public final` `void` | [cell](#cell)() |
| `public final` `void` | [character](#characterchar)(`char` character) |
| `public final` `void` | [code](#codestring)( text) |
| `public final` `void` | [endTableRow](#endtablerow)() |
| `public final` `void` | [header](#headerint)(`int` level) |
| `public final` `void` | [horizontalRule](#horizontalrule)() |
| `public final` `void` | [italic](#italicstring)( text) |
| `public final` `void` | [item](#item)() |
| `public final` `void` | [link](#linkstring-string)( label,  url) |
| `public final` `void` | [newLine](#newline)() |
| `public final` `void` | [quote](#quote)() |
| `public final` `void` | [rawLink](#rawlinkstring-string)( label,  url) |
| `public final` `void` | [startTableRow](#starttablerow)() |
| `public final` `void` | [tableHeader](#tableheaderstring)( headers) |
| `public final` `void` | [tableRow](#tablerowstring)( cells) |
| `public final` `void` | [text](#textstring)( text) |



# Constructors
## MarkdownDocument()





# Methods
## bold(String)
Appends the given ``text`` to the current document with a bold decoration.

### **Parameters**
* `text`: Text to append to the document with the bold decoration.



## breakingReturn()
Appends a horizontal rule sequence to the current document.



## build()
Builds and returns the document content.

### **Returns**
Built document content.



## cell()
Appends a table cell separator to the current document.



## character(char)
Appends the given ``character`` to the current document.

### **Parameters**
* `character`: Character to append to the document.



## code(String)
Appends this given `text` to the current document with a code decoration.

### **Parameters**
* `text`: code snippet to add to the document



## endTableRow()
Appends a table row end separator to the current document.



## header(int)
Starts a header text, in the current document using the given header ``level``

### **Parameters**
* `level`: Level of the header to start.



## horizontalRule()
Appends a horizontal rule sequence to the current document.



## italic(String)
Appends the given ``text`` to the current document with an italic decoration.

### **Parameters**
* `text`: Text to append to the document with the italic decoration.



## item()
Starts a list item in the current document.



## link(String, String)
Appends a link to the current document using the given ``label`` and the given ``url``.

### **Parameters**
* `label`: Label of the built link.
* `url`: Target URL of the built link.



## newLine()
Appends a new line to the current document.



## quote()
Starts a quote in the current document.



## rawLink(String, String)
Appends a raw HTML link to the current document using the given ``label`` and the given
 ``url``.

### **Parameters**
* `label`: Label of the built link.
* `url`: Target URL of the built link.



## startTableRow()
Appends a table row start separator to the current document.



## tableHeader(String...)
Appends the given ``headers`` in the current document as a table header row.

### **Parameters**
* `headers`: Headers to write.



## tableRow(String...)
Appends the given ``cell`` in the current document as a table row.

### **Parameters**
* `cells`: Cell to write.



## text(String)
Appends the given ``text`` to the current document.

### **Parameters**
* `text`: Text to append to the document.




