#!/bin/bash

# Check if we are in a git repository
if [ ! -d .git ]; then
    echo "Not a git repository."
    exit 1
fi

# Check the reflog for any reset actions
if git reflog show | grep -q "reset"; then
    echo "A git reset command has been executed."
else
    echo "No git reset command detected."
fi
