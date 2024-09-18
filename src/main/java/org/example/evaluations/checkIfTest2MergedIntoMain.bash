source_branch="test2"
target_branch="main"

if [ ! -d .git ]; then
    echo "Not a git repository."
    exit 1
fi

# Fetch the latest changes (optional)
git fetch --all

# Check if the source branch is merged into the target branch
if git branch --merged "$target_branch" | grep -q "$source_branch"; then
    echo "The branch '$source_branch' has been merged into '$target_branch'."
else
    echo "Error : The branch '$source_branch' has not been merged into '$target_branch'."
    exit 1
fi
