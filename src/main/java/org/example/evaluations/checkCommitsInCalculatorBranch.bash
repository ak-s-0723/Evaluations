COMMIT_MESSAGE1="Merge branch 'decrement' into calculator"
COMMIT_MESSAGE2="Added Decrementor"
COMMIT_MESSAGE3="Added Incrementor"
BRANCH="calculator"

COMMIT_HASH1=$(git log "$BRANCH" --grep="$COMMIT_MESSAGE1" --format="%H" -n 1)

if [ -n "$COMMIT_HASH1" ]; then
    echo "Commit with message '$COMMIT_MESSAGE1' exists in branch '$BRANCH' (commit hash: $COMMIT_HASH1)."
else
    echo "Error : No commit with message '$COMMIT_MESSAGE1' found in branch '$BRANCH'."
    exit 1
fi
echo
echo
COMMIT_HASH2=$(git log "$BRANCH" --grep="$COMMIT_MESSAGE2" --format="%H" -n 1)

if [ -n "$COMMIT_HASH2" ]; then
    echo "Commit with message '$COMMIT_MESSAGE2' exists in branch '$BRANCH' (commit hash: $COMMIT_HASH2)."
else
    echo "Error : No commit with message '$COMMIT_MESSAGE2' found in branch '$BRANCH'."
    exit 1
fi
echo
echo
COMMIT_HASH3=$(git log "$BRANCH" --grep="$COMMIT_MESSAGE3" --format="%H" -n 1)

if [ -n "$COMMIT_HASH3" ]; then
    echo "Commit with message '$COMMIT_MESSAGE3' exists in branch '$BRANCH' (commit hash: $COMMIT_HASH3)."
else
    echo "Error : No commit with message '$COMMIT_MESSAGE3' found in branch '$BRANCH'."
   exit 1 
fi


