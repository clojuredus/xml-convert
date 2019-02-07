(ns xml-convert.core
  (:require [remus]
            [hiccup.core :as h]))

(def url "https://mediathek.hhu.de/rss/7/feed/")

(def data (remus/parse-url url))

(def sample-html
  (h/html [:div.entries
           [:div.entry
            [:img {:src "url/vom/thumbnail"}]
            [:h4 "Titel des Talks"]
            [:p "Author"]
            [:p "07.02.2019"]]]))
