(defproject liberator-service "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-ring "0.9.7"]]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [liberator "0.14.1"]
                 [compojure "1.5.0"]
                 [ring "1.4.0"]
                 [cheshire "5.5.0"]
                 [hiccup "1.0.5"]
                 [lib-noir "0.9.9"]]
  :ring {:handler liberator-service.core/app})
