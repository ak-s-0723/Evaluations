if [ ! -d .git ]; then
    echo "Not a git repository."
    exit 1
fi

last_reset_commit=$(git reflog | grep "checkout:" | head -n 1 | awk '{print $1}')

if [ -z "$last_reset_commit" ]; then
    echo "No reset found in the reflog."
    exit 1
else
    echo "The commit hash of the last reset is: $last_reset_commit"
fi



# Check the reflog for checkout of the deleted commit hash
if git reflog | grep -q "checkout: moving"; then
    echo "The user has checked out the deleted commit: $last_reset_commit."
else
    echo "Error : The user has NOT checked out the deleted commit: $last_reset_commit."
    exit 1
fi
