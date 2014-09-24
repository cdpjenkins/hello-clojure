(defproject hello-clojure "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.6"]
                 ;; Adding servlet-api to dependencies because
                 ;; lein with-profile production compile :all fails without
                 ;; it on my Linux box for reasons that I have yet to track
                 ;; down
                 [javax.servlet/servlet-api "2.5"]]
  :plugins [[lein-ring "0.8.11"]]
  :ring {:handler hello-clojure.handler/app}
  :profiles
  {:dev {:dependencies [[ring/ring-jetty-adapter "1.1.0"]
                        [ring-mock "0.1.5"]]}}
  :min-lein-version "2.0.0")

