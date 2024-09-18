#!/bin/bash

FILENAME="Main.java"

# Check if the file exists in the repository
if [ ! -f "$FILENAME" ]; then
    echo "The file '$FILENAME' does not exist in the repository."
    exit 1
fi

# Check the git status for the file
if git status --porcelain | grep -q "^A  $FILENAME\|^M  $FILENAME"; then
    echo "The file '$FILENAME' is still in the staging area."
elif git status --porcelain | grep -q "^?? $FILENAME"; then
    echo "The file '$FILENAME' is untracked and has never been staged."
else
    echo "The file '$FILENAME' has been restored from the staging area."
fi
