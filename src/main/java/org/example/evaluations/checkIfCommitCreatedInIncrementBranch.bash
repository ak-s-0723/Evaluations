#!/bin/bash


COMMIT_MESSAGE="Added Incrementor"
BRANCH="increment"


# Check if the commit with the specific message exists in the branch
COMMIT_HASH=$(git log "$BRANCH" --grep="$COMMIT_MESSAGE" --format="%H" -n 1)

if [ -n "$COMMIT_HASH" ]; then
    echo "Commit with message '$COMMIT_MESSAGE' exists in branch '$BRANCH' (commit hash: $COMMIT_HASH)."
else
    echo "Error : No commit with message '$COMMIT_MESSAGE' found in branch '$BRANCH'."
    exit 1
fi
