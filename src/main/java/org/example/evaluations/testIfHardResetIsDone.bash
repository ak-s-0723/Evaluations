if [ ! -d .git ]; then
    echo "Not a git repository."
    exit 1
fi

reflog=$(git reflog)

# Check for the reset command in the reflog
if echo "$reflog" | grep -q "reset: moving to HEAD~1"; then
    echo "The command 'git reset --hard HEAD~1' has been run."
else
    echo "Error : The command 'git reset --hard HEAD~1' has NOT been run."
    exit 1
fi
