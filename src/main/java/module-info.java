module io.github.atlascommunity.marklet {
    requires jdk.javadoc;
    requires static  lombok;
    requires markdowngenerator;
    requires org.apache.commons.lang3;
    requires org.slf4j;

    exports io.github.atlascommunity.marklet;
    exports io.github.atlascommunity.marklet.util;
}