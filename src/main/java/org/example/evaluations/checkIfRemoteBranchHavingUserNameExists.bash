REMOTE_NAME="origin"
USER=`whoami`
BRANCH_NAME="multiplier_$USER"
COMMIT_MESSAGE="Added1 Subtractor Functionality"

echo "Fetching latest remote references..."
git fetch "$REMOTE_NAME"

# Check if the remote branch exists
if git branch -r | grep -q "$REMOTE_NAME/$BRANCH_NAME"; then
    echo "Remote branch '$REMOTE_NAME/$BRANCH_NAME' exists."
else
    echo "Error : Remote branch '$REMOTE_NAME/$BRANCH_NAME' does not exist."
    exit 1
fi
