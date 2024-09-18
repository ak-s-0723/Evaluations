message_pattern="Added Area Method in both Circle and Triangle"

matching_commits=$(git log --all --grep="$message_pattern" --pretty=format:"%H %s")

if [ -n "$matching_commits" ]; then
  echo "Found commits with the message pattern '$message_pattern':"
else
  echo "Error : No commits found with the message pattern '$message_pattern'."
  exit 1
fi
