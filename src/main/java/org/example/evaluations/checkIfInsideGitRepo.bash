if [ -d ".git" ]; then
  echo "The folder is a Git repository."
else
  echo "Error : The folder is not a Git repository." >&2
  exit 1
fi
