#!/bin/bash

COMMIT_MESSAGE="Modified Adder Logic"
SOURCE_BRANCH="main"
TARGET_BRANCH="changes2"

COMMIT_HASH=$(git log "$SOURCE_BRANCH" --grep="$COMMIT_MESSAGE" --format="%H" -n 1)

if [ -n "$COMMIT_HASH" ]; then
    echo "Commit with message '$COMMIT_MESSAGE' exists in branch '$SOURCE_BRANCH' (commit hash: $COMMIT_HASH)."
else
    echo "Error : No commit with message '$COMMIT_MESSAGE' found in branch '$SOURCE_BRANCH'."
    exit 1
fi

# Check if the commit is missing in the target branch
if git log "$TARGET_BRANCH" --grep="$COMMIT_MESSAGE" --format="%H" | grep -q "$COMMIT_HASH"; then
    echo "Error : Commit with message '$COMMIT_MESSAGE' exists in branch '$TARGET_BRANCH'."
    exit 1
else
    echo "Commit with message '$COMMIT_MESSAGE' is MISSING in branch '$TARGET_BRANCH'."
fi
