REMOTE_NAME="origin"
USER=`whoami`
BRANCH_NAME="subtractor_$USER"
COMMIT_MESSAGE="Added1 Subtractor Functionality"

echo "Fetching latest remote references..."
git fetch "$REMOTE_NAME"

# Check if the remote branch exists
if git show-ref --quiet --heads "$BRANCH_NAME"; then
    echo "Remote branch '$REMOTE_NAME/$BRANCH_NAME' exists."
else
    echo "Error : Remote branch '$REMOTE_NAME/$BRANCH_NAME' does not exist."
fi
