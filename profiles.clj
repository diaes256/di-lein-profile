{:user {:plugins [[cider/cider-nrepl "0.15.0-SNAPSHOT"]
                  [refactor-nrepl "2.3.0-SNAPSHOT"] ; Refactoring
                  [lein-virgil "0.1.0"] ; Java reloading
                  [lein-ancient "0.6.10"] ; Check for outdated dependencies
                  [lein-cljsbuild "1.1.5"]
                  [lein-figwheel "0.5.8"]]
        :dependencies [[org.clojure/tools.nrepl "0.2.12"] ; Tools for reloading clojure
                       [org.clojure/clojurescript "1.9.293"]
                       [org.clojure/tools.namespace "0.2.11"]
                       [im.chit/vinyasa "0.4.7"] ; Java reloading tools
                       [com.cemerick/piggieback "0.2.1"] ; clojurescript repl
                       [figwheel-sidecar "0.5.8"]; figwheel in clojure repl
                       ]
        :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}}}
