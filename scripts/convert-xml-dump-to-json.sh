
#!/usr/bin/env bash

EXPECTED_ARGS=3
E_BADARGS=65

source scripts/config.sh

if [ $# -ne $EXPECTED_ARGS ];
then
  echo "Usage: `basename $0` lang[en,it] xml-dump  json-dump "
  exit $E_BADARGS
fi

LANG=$1
WIKI_XML_DUMP=$2
WIKI_JSON_DUMP=$3

echo "Converting mediawiki xml dump to json dump ($WIKI_JSON_DUMP)"

$JAVA  $WIKI_XML_DUMP $WIKI_JSON_DUMP -l $LANG
