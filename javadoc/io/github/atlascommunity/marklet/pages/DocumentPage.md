Class DocumentPage implements io.github.atlascommunity.marklet.pages.DocumentPageInterface
==========================================================================================
Common interface for all classes, representing markdown documents

io.github.atlascommunity.marklet.pages.DocumentPage Summary
-------
#### Constructors
| Visibility | Signature      |
| ---------- | -------------- |
| public     | DocumentPage() |
#### Methods
| Modifiers | Method signature                                                                                                                                                 | Return type |
| --------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------- |
|           | [write(String document, String fileName, Path resolvedOutputDir, Options options)](#writestring-document-string-filename-path-resolvedoutputdir-options-options) | void        |

Methods
=======
write(String document, String fileName, Path resolvedOutputDir, Options options)
--------------------------------------------------------------------------------
Build document and write it to the selected folder

### Throws

IOException: something went wrong during write operation

### Parameters

| Name              | Description               |
| ----------------- | ------------------------- |
| document          | *No description provided* |
| fileName          | *No description provided* |
| resolvedOutputDir | *No description provided* |
| options           | *No description provided* |

