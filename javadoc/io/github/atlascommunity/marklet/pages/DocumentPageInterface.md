Interface DocumentPageInterface
===============================
Common interface for all classes, representing markdown documents

io.github.atlascommunity.marklet.pages.DocumentPageInterface Summary
-------
#### Methods
| Modifiers           | Method signature | Return type |
| ------------------- | ---------------- | ----------- |
| **public abstract** | build()          | String      |
| **public abstract** | write()          | void        |

Methods
=======
build()
-------
Build document and write it to the selected folder

### Throws

IOException: something went wrong during write operation


write()
-------
Write document to the selected folder

### Throws

IOException: something went wrong during write operation


