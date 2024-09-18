#!/bin/bash

# Load history from the history file
history -r

# Now you can check the history
count=$(history | grep "git push" | wc -l)

if [ "$count" -gt 0 ]; then
    echo "Found $count 'git push' commands in history."
else
    echo "Error : No 'git push' commands found in history."
    exit 1
fi
