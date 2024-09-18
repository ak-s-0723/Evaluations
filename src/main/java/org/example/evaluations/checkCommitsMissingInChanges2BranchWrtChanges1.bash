SOURCE_BRANCH="changes2"  # The branch you want to check if it has been merged
TARGET_BRANCH="changes1"            # The branch you want to check if the source branch has been merged into
EXPECTED_EXTRA_COMMITS=1        # Number of extra commits expected in the target branch

# Ensure we are in a git repository
if [ ! -d .git ]; then
    echo "Error : This is not a git repository."
    exit 1
fi

# Fetch the latest changes from the remote
echo "Fetching the latest changes from the remote..."
git fetch --all

# Check if the branches exist
if ! git rev-parse --verify "$SOURCE_BRANCH" >/dev/null 2>&1; then
    echo "Error : Source branch '$SOURCE_BRANCH' does not exist."
    exit 1
fi

if ! git rev-parse --verify "$TARGET_BRANCH" >/dev/null 2>&1; then
    echo "Error : Target branch '$TARGET_BRANCH' does not exist."
    exit 1
fi

# Get the number of commits in target-branch not in source-branch
extra_commits_count=$(git log "$TARGET_BRANCH" --not "$SOURCE_BRANCH" --oneline | wc -l)

# Check if the number of extra commits matches the expected count
if [ "$extra_commits_count" -eq "$EXPECTED_EXTRA_COMMITS" ]; then
    echo "Branch '$TARGET_BRANCH' has exactly $EXPECTED_EXTRA_COMMITS extra commits."
else
    echo "Error : The number of extra commits is not as expected ($extra_commits_count extra commits found)."
fi
