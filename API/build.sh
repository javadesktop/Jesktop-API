#!/bin/sh

echo
echo " Jesktop API Build System"
echo "------------------------"


if [ "$AVALON_TOOLS" = "" ] ; then
    if [ -d ../tools ] ; then 
        AVALON_TOOLS=../tools
    elif [ -d tools ] ; then 
        AVALON_TOOLS=tools
    else
        echo "Unable to locate tools directory at "
        echo "../tools/ or tools/. "
        echo "Please read tools.txt"
        echo "Aborting."
        exit 1
    fi
fi

chmod u+x $AVALON_TOOLS/bin/antRun
chmod u+x $AVALON_TOOLS/bin/ant

$AVALON_TOOLS/bin/ant -logger org.apache.tools.ant.NoBannerLogger -emacs -Dtools.dir=$AVALON_TOOLS $@ 
