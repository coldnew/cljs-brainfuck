(defproject cljs-brainfuck "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :plugins [[lein-cljsbuild "1.0.4"]]

  :cljsbuild {
              :builds [{
                        :source-paths ["src"]
                        :compiler {
                                   :output-to "target/brainfuck.js"
                                   :target :nodejs
                                   :optimizations :simple
                                   :pretty-print false}}]}
  :dependencies [[org.clojure/clojure "1.5.1"]])
