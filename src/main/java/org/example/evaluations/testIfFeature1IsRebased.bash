feature_branch="feature1"
master_branch="main"

if [ ! -d .git ]; then
    echo "Not a git repository."
    exit 1
fi

# Fetch the latest changes (optional)
git fetch --all

# Check if the feature branch exists
if ! git show-ref --verify --quiet refs/heads/"$feature_branch"; then
    echo "Error : The feature branch '$feature_branch' does not exist."
    exit 1
fi

# Check if the feature branch is rebased on master
if git merge-base --is-ancestor "$master_branch" "$feature_branch"; then
    echo "The feature branch '$feature_branch' is based on the master branch."
else
    echo "Error : The feature branch '$feature_branch' is NOT based on the master branch."
    exit 1
fi
