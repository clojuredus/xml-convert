(defproject xml-convert "0.1.0"
  :description "FIXME: write description"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [clj-time "0.15.1"]
                 [hiccup "1.0.5"]]
  :uberjar-name "xml-convert.jar"
  :source-paths ["src"]
  :aot [xml-convert.core]
  :main xml-convert.core
  :repl-options {:init-ns xml-convert.core})
