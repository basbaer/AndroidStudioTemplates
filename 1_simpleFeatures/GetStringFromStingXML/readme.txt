With context:
-> if it's not a activity (e.g array adapter) pass the context of the calling activity
context.getString(R.string.<string_id>);

Without context (mostly does not work):
Resources.getSystem().getString(R.string.<string_id>);
