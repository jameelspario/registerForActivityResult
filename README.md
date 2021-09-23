ActivityResultContracts.CaptureVideo	
An ActivityResultContract to take a video saving it into the provided content-Uri.

ActivityResultContracts.CreateDocument	
An ActivityResultContract to prompt the user to select a path for creating a new document, returning the content:Uri of the item that was created.

ActivityResultContracts.GetContent	
An ActivityResultContract to prompt the user to pick a piece of content, receiving a content://Uri for that content that allows you to use android.content.ContentResolver.openInputStream to access the raw data.

ActivityResultContracts.GetMultipleContents	
An ActivityResultContract to prompt the user to pick one or more a pieces of content, receiving a content://Uri for each piece of content that allows you to use android.content.ContentResolver.openInputStream to access the raw data.

ActivityResultContracts.OpenDocument	
An ActivityResultContract to prompt the user to open a document, receiving its contents as a file:/http:/content:Uri.

ActivityResultContracts.OpenDocumentTree	
An ActivityResultContract to prompt the user to select a directory, returning the user selection as a Uri.

ActivityResultContracts.OpenMultipleDocuments	
An ActivityResultContract to prompt the user to open (possibly multiple) documents, receiving their contents as file:/http:/content:Uris.

ActivityResultContracts.PickContact	
An ActivityResultContract to request the user to pick a contact from the contacts app.

ActivityResultContracts.RequestMultiplePermissions	
An ActivityResultContract to request permissions

ActivityResultContracts.RequestPermission	
An ActivityResultContract to request a permission

ActivityResultContracts.StartActivityForResult	
An ActivityResultContract that doesn't do any type conversion, taking raw Intent as an input and ActivityResult as an output.

ActivityResultContracts.StartIntentSenderForResult	
An ActivityResultContract that calls Activity.startIntentSender.

ActivityResultContracts.TakePicture	
An ActivityResultContract to take a picture saving it into the provided content-Uri.

ActivityResultContracts.TakePicturePreview	
An ActivityResultContract to take small a picture preview, returning it as a Bitmap.

ActivityResultContracts.TakeVideo	
An ActivityResultContract to take a video saving it into the provided content-Uri.