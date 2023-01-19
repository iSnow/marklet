Class ReadmePage extends io.github.atlascommunity.marklet.pages.DocumentPage
============================================================================
Index of project packages

io.github.atlascommunity.marklet.pages.ReadmePage Summary
-------
#### Constructors
| Visibility | Signature    |
| ---------- | ------------ |
| public     | ReadmePage() |
#### Fields
| Modifiers         | Field name                                                            | Type                                          |
| ----------------- | --------------------------------------------------------------------- | --------------------------------------------- |
| **private final** | [modules](#javautillistjavaxlangmodelelementmoduleelement-modules)    | List<javax.lang.model.element.ModuleElement>  |
| **private final** | [packages](#javautillistjavaxlangmodelelementpackageelement-packages) | List<javax.lang.model.element.PackageElement> |
| **private final** | [options](#iogithubatlascommunitymarkletoptions-options)              | io.github.atlascommunity.marklet.Options      |
| **private final** | [reporter](#jdkjavadocdocletreporter-reporter)                        | jdk.javadoc.doclet.Reporter                   |
#### Methods
| Modifiers          | Method signature                                                                                                                                                                     | Return type |
| ------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ----------- |
| **public**         | [build()](#build)                                                                                                                                                                    | String      |
| **private static** | [generateModuleInfo(List<javax.lang.model.element.ModuleElement> modules)](#generatemoduleinfolistjavaxlangmodelelementmoduleelement-modules)                                        | String      |
| **private static** | [generatePackageInfo(List<javax.lang.model.element.PackageElement> packages, Options options)](#generatepackageinfolistjavaxlangmodelelementpackageelement-packages-options-options) | String      |
| **public**         | [write()](#write)                                                                                                                                                                    | void        |

Fields
======
List<javax.lang.model.element.ModuleElement> modules
--------------------------------------------------------------
List of modules in the project


List<javax.lang.model.element.PackageElement> packages
----------------------------------------------------------------
List of project packages


io.github.atlascommunity.marklet.Options options
------------------------------------------------
Doclet options


jdk.javadoc.doclet.Reporter reporter
------------------------------------
*No description provided*


Methods
=======
build()
-------
Build document and write it to the selected folder

### Throws

IOException: something went wrong during write operation


generateModuleInfo(List<javax.lang.model.element.ModuleElement> modules)
------------------------------------------------------------------------
*No method description provided*

### Parameters

| Name    | Description               |
| ------- | ------------------------- |
| modules | *No description provided* |

generatePackageInfo(List<javax.lang.model.element.PackageElement> packages, Options options)
--------------------------------------------------------------------------------------------
*No method description provided*

### Parameters

| Name     | Description               |
| -------- | ------------------------- |
| packages | *No description provided* |
| options  | *No description provided* |

write()
-------
*No method description provided*


