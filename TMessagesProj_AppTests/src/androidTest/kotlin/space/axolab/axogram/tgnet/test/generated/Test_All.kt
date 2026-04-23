package space.axolab.axogram.tgnet.test.generated

import org.junit.Assume.assumeTrue
import org.junit.Test
import org.junit.experimental.runners.Enclosed
import org.junit.runner.RunWith
import space.axolab.axogram.tgnet.model.TlGen_Object
import space.axolab.axogram.tgnet.model.TlGen_Vector
import space.axolab.axogram.tgnet.test.BaseSchemeTest

@RunWith(Enclosed::class)
public class Test_All {
  public class Test_Actual : BaseSchemeTest() {
    @Test
    public fun test_Bool_TL_boolFalse() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Bool.TL_boolFalse::class,
          space.axolab.axogram.tgnet.TLRPC.Bool::TLdeserialize, null)

    }

    @Test
    public fun test_Bool_TL_boolTrue() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Bool.TL_boolTrue::class,
          space.axolab.axogram.tgnet.TLRPC.Bool::TLdeserialize, null)

    }

    @Test
    public fun test_Error_TL_error() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Error.TL_error::class,
          space.axolab.axogram.tgnet.TLRPC.TL_error::TLdeserialize, null)

    }

    @Test
    public fun test_Null_TL_null() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Null.TL_null::class,
          space.axolab.axogram.tgnet.TLRPC.TL_null::TLdeserialize, null)

    }

    @Test
    public fun test_InputPeer_TL_inputPeerEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPeer.TL_inputPeerEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.InputPeer::TLdeserialize, null)

    }

    @Test
    public fun test_InputPeer_TL_inputPeerSelf() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPeer.TL_inputPeerSelf::class,
          space.axolab.axogram.tgnet.TLRPC.InputPeer::TLdeserialize, null)

    }

    @Test
    public fun test_InputUser_TL_inputUserEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputUser.TL_inputUserEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.InputUser::TLdeserialize, null)

    }

    @Test
    public fun test_InputUser_TL_inputUserSelf() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputUser.TL_inputUserSelf::class,
          space.axolab.axogram.tgnet.TLRPC.InputUser::TLdeserialize, null)

    }

    @Test
    public fun test_InputFile_TL_inputFile() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputFile.TL_inputFile::class,
          space.axolab.axogram.tgnet.TLRPC.InputFile::TLdeserialize, null)

    }

    @Test
    public fun test_InputMedia_TL_inputMediaEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputMedia.TL_inputMediaEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.InputMedia::TLdeserialize, null)

    }

    @Test
    public fun test_InputMedia_TL_inputMediaGeoPoint() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputMedia.TL_inputMediaGeoPoint::class,
          space.axolab.axogram.tgnet.TLRPC.InputMedia::TLdeserialize, null)

    }

    @Test
    public fun test_InputChatPhoto_TL_inputChatPhotoEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputChatPhoto.TL_inputChatPhotoEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.InputChatPhoto::TLdeserialize, null)

    }

    @Test
    public fun test_InputGeoPoint_TL_inputGeoPointEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputGeoPoint.TL_inputGeoPointEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.InputGeoPoint::TLdeserialize, null)

    }

    @Test
    public fun test_InputPhoto_TL_inputPhotoEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPhoto.TL_inputPhotoEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.InputPhoto::TLdeserialize, null)

    }

    @Test
    public fun test_storage_FileType_TL_storage_fileUnknown() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_storage_FileType.TL_storage_fileUnknown::class,
          space.axolab.axogram.tgnet.TLRPC.storage_FileType::TLdeserialize, null)

    }

    @Test
    public fun test_storage_FileType_TL_storage_filePartial() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_storage_FileType.TL_storage_filePartial::class,
          space.axolab.axogram.tgnet.TLRPC.storage_FileType::TLdeserialize, null)

    }

    @Test
    public fun test_storage_FileType_TL_storage_fileJpeg() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_storage_FileType.TL_storage_fileJpeg::class,
          space.axolab.axogram.tgnet.TLRPC.storage_FileType::TLdeserialize, null)

    }

    @Test
    public fun test_storage_FileType_TL_storage_fileGif() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_storage_FileType.TL_storage_fileGif::class,
          space.axolab.axogram.tgnet.TLRPC.storage_FileType::TLdeserialize, null)

    }

    @Test
    public fun test_storage_FileType_TL_storage_filePng() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_storage_FileType.TL_storage_filePng::class,
          space.axolab.axogram.tgnet.TLRPC.storage_FileType::TLdeserialize, null)

    }

    @Test
    public fun test_storage_FileType_TL_storage_filePdf() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_storage_FileType.TL_storage_filePdf::class,
          space.axolab.axogram.tgnet.TLRPC.storage_FileType::TLdeserialize, null)

    }

    @Test
    public fun test_storage_FileType_TL_storage_fileMp3() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_storage_FileType.TL_storage_fileMp3::class,
          space.axolab.axogram.tgnet.TLRPC.storage_FileType::TLdeserialize, null)

    }

    @Test
    public fun test_storage_FileType_TL_storage_fileMov() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_storage_FileType.TL_storage_fileMov::class,
          space.axolab.axogram.tgnet.TLRPC.storage_FileType::TLdeserialize, null)

    }

    @Test
    public fun test_storage_FileType_TL_storage_fileMp4() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_storage_FileType.TL_storage_fileMp4::class,
          space.axolab.axogram.tgnet.TLRPC.storage_FileType::TLdeserialize, null)

    }

    @Test
    public fun test_storage_FileType_TL_storage_fileWebp() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_storage_FileType.TL_storage_fileWebp::class,
          space.axolab.axogram.tgnet.TLRPC.storage_FileType::TLdeserialize, null)

    }

    @Test
    public fun test_UserProfilePhoto_TL_userProfilePhotoEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserProfilePhoto.TL_userProfilePhotoEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.UserProfilePhoto::TLdeserialize, null)

    }

    @Test
    public fun test_UserStatus_TL_userStatusEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserStatus.TL_userStatusEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.UserStatus::TLdeserialize, null)

    }

    @Test
    public fun test_UserStatus_TL_userStatusOnline() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserStatus.TL_userStatusOnline::class,
          space.axolab.axogram.tgnet.TLRPC.UserStatus::TLdeserialize, null)

    }

    @Test
    public fun test_UserStatus_TL_userStatusOffline() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserStatus.TL_userStatusOffline::class,
          space.axolab.axogram.tgnet.TLRPC.UserStatus::TLdeserialize, null)

    }

    @Test
    public fun test_ChatPhoto_TL_chatPhotoEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatPhoto.TL_chatPhotoEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.ChatPhoto::TLdeserialize, null)

    }

    @Test
    public fun test_MessageMedia_TL_messageMediaEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_MessageMedia_TL_messageMediaGeo() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaGeo::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionChatEditTitle() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionChatEditTitle::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionChatEditPhoto() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionChatEditPhoto::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_Photo_TL_photoEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Photo.TL_photoEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.Photo::TLdeserialize, null)

    }

    @Test
    public fun test_PhotoSize_TL_photoSizeEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PhotoSize.TL_photoSizeEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.PhotoSize::TLdeserialize, null)

    }

    @Test
    public fun test_GeoPoint_TL_geoPointEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_GeoPoint.TL_geoPointEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.GeoPoint::TLdeserialize, null)

    }

    @Test
    public fun test_InputNotifyPeer_TL_inputNotifyPeer() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputNotifyPeer.TL_inputNotifyPeer::class,
          space.axolab.axogram.tgnet.TLRPC.InputNotifyPeer::TLdeserialize, null)

    }

    @Test
    public fun test_InputNotifyPeer_TL_inputNotifyUsers() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputNotifyPeer.TL_inputNotifyUsers::class,
          space.axolab.axogram.tgnet.TLRPC.InputNotifyPeer::TLdeserialize, null)

    }

    @Test
    public fun test_InputNotifyPeer_TL_inputNotifyChats() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputNotifyPeer.TL_inputNotifyChats::class,
          space.axolab.axogram.tgnet.TLRPC.InputNotifyPeer::TLdeserialize, null)

    }

    @Test
    public fun test_ReportReason_TL_inputReportReasonSpam() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ReportReason.TL_inputReportReasonSpam::class,
          space.axolab.axogram.tgnet.TLRPC.ReportReason::TLdeserialize, null)

    }

    @Test
    public fun test_ReportReason_TL_inputReportReasonViolence() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ReportReason.TL_inputReportReasonViolence::class,
          space.axolab.axogram.tgnet.TLRPC.ReportReason::TLdeserialize, null)

    }

    @Test
    public fun test_ReportReason_TL_inputReportReasonPornography() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ReportReason.TL_inputReportReasonPornography::class,
          space.axolab.axogram.tgnet.TLRPC.ReportReason::TLdeserialize, null)

    }

    @Test
    public fun test_ReportReason_TL_inputReportReasonChildAbuse() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ReportReason.TL_inputReportReasonChildAbuse::class,
          space.axolab.axogram.tgnet.TLRPC.ReportReason::TLdeserialize, null)

    }

    @Test
    public fun test_contacts_Contacts_TL_contacts_contactsNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_contacts_Contacts.TL_contacts_contactsNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.contacts_Contacts::TLdeserialize, null)

    }

    @Test
    public fun test_messages_Dialogs_TL_messages_dialogs() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_Dialogs.TL_messages_dialogs::class,
          space.axolab.axogram.tgnet.TLRPC.messages_Dialogs::TLdeserialize, null)

    }

    @Test
    public fun test_messages_Dialogs_TL_messages_dialogsSlice() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_Dialogs.TL_messages_dialogsSlice::class,
          space.axolab.axogram.tgnet.TLRPC.messages_Dialogs::TLdeserialize, null)

    }

    @Test
    public fun test_messages_ChatFull_TL_messages_chatFull() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_ChatFull.TL_messages_chatFull::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_chatFull::TLdeserialize, null)

    }

    @Test
    public fun test_MessagesFilter_TL_inputMessagesFilterEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessagesFilter.TL_inputMessagesFilterEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.MessagesFilter::TLdeserialize, null)

    }

    @Test
    public fun test_MessagesFilter_TL_inputMessagesFilterPhotos() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessagesFilter.TL_inputMessagesFilterPhotos::class,
          space.axolab.axogram.tgnet.TLRPC.MessagesFilter::TLdeserialize, null)

    }

    @Test
    public fun test_MessagesFilter_TL_inputMessagesFilterVideo() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessagesFilter.TL_inputMessagesFilterVideo::class,
          space.axolab.axogram.tgnet.TLRPC.MessagesFilter::TLdeserialize, null)

    }

    @Test
    public fun test_MessagesFilter_TL_inputMessagesFilterPhotoVideo() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessagesFilter.TL_inputMessagesFilterPhotoVideo::class,
          space.axolab.axogram.tgnet.TLRPC.MessagesFilter::TLdeserialize, null)

    }

    @Test
    public fun test_MessagesFilter_TL_inputMessagesFilterDocument() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessagesFilter.TL_inputMessagesFilterDocument::class,
          space.axolab.axogram.tgnet.TLRPC.MessagesFilter::TLdeserialize, null)

    }

    @Test
    public fun test_MessagesFilter_TL_inputMessagesFilterUrl() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessagesFilter.TL_inputMessagesFilterUrl::class,
          space.axolab.axogram.tgnet.TLRPC.MessagesFilter::TLdeserialize, null)

    }

    @Test
    public fun test_MessagesFilter_TL_inputMessagesFilterGif() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessagesFilter.TL_inputMessagesFilterGif::class,
          space.axolab.axogram.tgnet.TLRPC.MessagesFilter::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateMessageID() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateMessageID::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateChatParticipants() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateChatParticipants::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_updates_Difference_TL_updates_differenceEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_updates_Difference.TL_updates_differenceEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.updates_Difference::TLdeserialize, null)

    }

    @Test
    public fun test_Updates_TL_updatesTooLong() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Updates.TL_updatesTooLong::class,
          space.axolab.axogram.tgnet.TLRPC.Updates::TLdeserialize, null)

    }

    @Test
    public fun test_Updates_TL_updateShort() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Updates.TL_updateShort::class,
          space.axolab.axogram.tgnet.TLRPC.Updates::TLdeserialize, null)

    }

    @Test
    public fun test_Updates_TL_updatesCombined() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Updates.TL_updatesCombined::class,
          space.axolab.axogram.tgnet.TLRPC.Updates::TLdeserialize, null)

    }

    @Test
    public fun test_Updates_TL_updates() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Updates.TL_updates::class,
          space.axolab.axogram.tgnet.TLRPC.Updates::TLdeserialize, null)

    }

    @Test
    public fun test_photos_Photos_TL_photos_photos() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_photos_Photos.TL_photos_photos::class,
          space.axolab.axogram.tgnet.TLRPC.photos_Photos::TLdeserialize, null)

    }

    @Test
    public fun test_photos_Photos_TL_photos_photosSlice() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_photos_Photos.TL_photos_photosSlice::class,
          space.axolab.axogram.tgnet.TLRPC.photos_Photos::TLdeserialize, null)

    }

    @Test
    public fun test_photos_Photo_TL_photos_photo() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_photos_Photo.TL_photos_photo::class,
          space.axolab.axogram.tgnet.TLRPC.TL_photos_photo::TLdeserialize, null)

    }

    @Test
    public fun test_upload_File_TL_upload_file() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_upload_File.TL_upload_file::class,
          space.axolab.axogram.tgnet.TLRPC.upload_File::TLdeserialize, null)

    }

    @Test
    public fun test_NearestDc_TL_nearestDc() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_NearestDc.TL_nearestDc::class,
          space.axolab.axogram.tgnet.TLRPC.TL_nearestDc::TLdeserialize, null)

    }

    @Test
    public fun test_help_AppUpdate_TL_help_noAppUpdate() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_help_AppUpdate.TL_help_noAppUpdate::class,
          space.axolab.axogram.tgnet.TLRPC.help_AppUpdate::TLdeserialize, null)

    }

    @Test
    public fun test_help_InviteText_TL_help_inviteText() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_help_InviteText.TL_help_inviteText::class,
          space.axolab.axogram.tgnet.TLRPC.TL_help_inviteText::TLdeserialize, null)

    }

    @Test
    public fun test_updates_State_TL_updates_state() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_updates_State.TL_updates_state::class,
          space.axolab.axogram.tgnet.TLRPC.TL_updates_state::TLdeserialize, null)

    }

    @Test
    public fun test_updates_Difference_TL_updates_difference() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_updates_Difference.TL_updates_difference::class,
          space.axolab.axogram.tgnet.TLRPC.updates_Difference::TLdeserialize, null)

    }

    @Test
    public fun test_updates_Difference_TL_updates_differenceSlice() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_updates_Difference.TL_updates_differenceSlice::class,
          space.axolab.axogram.tgnet.TLRPC.updates_Difference::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateNewEncryptedMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateNewEncryptedMessage::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateEncryptedChatTyping() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateEncryptedChatTyping::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateEncryption() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateEncryption::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateEncryptedMessagesRead() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateEncryptedMessagesRead::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_EncryptedChat_TL_encryptedChatEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_EncryptedChat.TL_encryptedChatEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.EncryptedChat::TLdeserialize, null)

    }

    @Test
    public fun test_InputEncryptedChat_TL_inputEncryptedChat() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputEncryptedChat.TL_inputEncryptedChat::class,
          space.axolab.axogram.tgnet.TLRPC.TL_inputEncryptedChat::TLdeserialize, null)

    }

    @Test
    public fun test_EncryptedFile_TL_encryptedFileEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_EncryptedFile.TL_encryptedFileEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.EncryptedFile::TLdeserialize, null)

    }

    @Test
    public fun test_InputEncryptedFile_TL_inputEncryptedFileEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputEncryptedFile.TL_inputEncryptedFileEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.InputEncryptedFile::TLdeserialize, null)

    }

    @Test
    public fun test_InputEncryptedFile_TL_inputEncryptedFileUploaded() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputEncryptedFile.TL_inputEncryptedFileUploaded::class,
          space.axolab.axogram.tgnet.TLRPC.InputEncryptedFile::TLdeserialize, null)

    }

    @Test
    public fun test_InputEncryptedFile_TL_inputEncryptedFile() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputEncryptedFile.TL_inputEncryptedFile::class,
          space.axolab.axogram.tgnet.TLRPC.InputEncryptedFile::TLdeserialize, null)

    }

    @Test
    public fun test_InputFileLocation_TL_inputEncryptedFileLocation() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputFileLocation.TL_inputEncryptedFileLocation::class,
          space.axolab.axogram.tgnet.TLRPC.InputFileLocation::TLdeserialize, null)

    }

    @Test
    public fun test_EncryptedMessage_TL_encryptedMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_EncryptedMessage.TL_encryptedMessage::class,
          space.axolab.axogram.tgnet.TLRPC.EncryptedMessage::TLdeserialize, null)

    }

    @Test
    public fun test_EncryptedMessage_TL_encryptedMessageService() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_EncryptedMessage.TL_encryptedMessageService::class,
          space.axolab.axogram.tgnet.TLRPC.EncryptedMessage::TLdeserialize, null)

    }

    @Test
    public fun test_messages_DhConfig_TL_messages_dhConfigNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_DhConfig.TL_messages_dhConfigNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.messages_DhConfig::TLdeserialize, null)

    }

    @Test
    public fun test_messages_DhConfig_TL_messages_dhConfig() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_DhConfig.TL_messages_dhConfig::class,
          space.axolab.axogram.tgnet.TLRPC.messages_DhConfig::TLdeserialize, null)

    }

    @Test
    public fun test_messages_SentEncryptedMessage_TL_messages_sentEncryptedMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_SentEncryptedMessage.TL_messages_sentEncryptedMessage::class,
          space.axolab.axogram.tgnet.TLRPC.messages_SentEncryptedMessage::TLdeserialize, null)

    }

    @Test
    public fun test_messages_SentEncryptedMessage_TL_messages_sentEncryptedFile() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_SentEncryptedMessage.TL_messages_sentEncryptedFile::class,
          space.axolab.axogram.tgnet.TLRPC.messages_SentEncryptedMessage::TLdeserialize, null)

    }

    @Test
    public fun test_InputFile_TL_inputFileBig() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputFile.TL_inputFileBig::class,
          space.axolab.axogram.tgnet.TLRPC.InputFile::TLdeserialize, null)

    }

    @Test
    public fun test_InputEncryptedFile_TL_inputEncryptedFileBigUploaded() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputEncryptedFile.TL_inputEncryptedFileBigUploaded::class,
          space.axolab.axogram.tgnet.TLRPC.InputEncryptedFile::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateDcOptions() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateDcOptions::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_InputDocument_TL_inputDocumentEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputDocument.TL_inputDocumentEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.InputDocument::TLdeserialize, null)

    }

    @Test
    public fun test_Document_TL_documentEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Document.TL_documentEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.Document::TLdeserialize, null)

    }

    @Test
    public fun test_help_Support_TL_help_support() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_help_Support.TL_help_support::class,
          space.axolab.axogram.tgnet.TLRPC.TL_help_support::TLdeserialize, null)

    }

    @Test
    public fun test_NotifyPeer_TL_notifyPeer() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_NotifyPeer.TL_notifyPeer::class,
          space.axolab.axogram.tgnet.TLRPC.NotifyPeer::TLdeserialize, null)

    }

    @Test
    public fun test_NotifyPeer_TL_notifyUsers() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_NotifyPeer.TL_notifyUsers::class,
          space.axolab.axogram.tgnet.TLRPC.NotifyPeer::TLdeserialize, null)

    }

    @Test
    public fun test_NotifyPeer_TL_notifyChats() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_NotifyPeer.TL_notifyChats::class,
          space.axolab.axogram.tgnet.TLRPC.NotifyPeer::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateNotifySettings() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateNotifySettings::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_SendMessageAction_TL_sendMessageTypingAction() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SendMessageAction.TL_sendMessageTypingAction::class,
          space.axolab.axogram.tgnet.TLRPC.SendMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_SendMessageAction_TL_sendMessageCancelAction() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SendMessageAction.TL_sendMessageCancelAction::class,
          space.axolab.axogram.tgnet.TLRPC.SendMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_SendMessageAction_TL_sendMessageRecordVideoAction() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SendMessageAction.TL_sendMessageRecordVideoAction::class,
          space.axolab.axogram.tgnet.TLRPC.SendMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_SendMessageAction_TL_sendMessageRecordAudioAction() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SendMessageAction.TL_sendMessageRecordAudioAction::class,
          space.axolab.axogram.tgnet.TLRPC.SendMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_SendMessageAction_TL_sendMessageGeoLocationAction() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SendMessageAction.TL_sendMessageGeoLocationAction::class,
          space.axolab.axogram.tgnet.TLRPC.SendMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_SendMessageAction_TL_sendMessageChooseContactAction() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SendMessageAction.TL_sendMessageChooseContactAction::class,
          space.axolab.axogram.tgnet.TLRPC.SendMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updatePrivacy() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updatePrivacy::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_InputPrivacyKey_TL_inputPrivacyKeyStatusTimestamp() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPrivacyKey.TL_inputPrivacyKeyStatusTimestamp::class,
          space.axolab.axogram.tgnet.TLRPC.InputPrivacyKey::TLdeserialize, null)

    }

    @Test
    public fun test_InputPrivacyRule_TL_inputPrivacyValueAllowContacts() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPrivacyRule.TL_inputPrivacyValueAllowContacts::class,
          space.axolab.axogram.tgnet.TLRPC.InputPrivacyRule::TLdeserialize, null)

    }

    @Test
    public fun test_InputPrivacyRule_TL_inputPrivacyValueAllowAll() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPrivacyRule.TL_inputPrivacyValueAllowAll::class,
          space.axolab.axogram.tgnet.TLRPC.InputPrivacyRule::TLdeserialize, null)

    }

    @Test
    public fun test_InputPrivacyRule_TL_inputPrivacyValueAllowUsers() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPrivacyRule.TL_inputPrivacyValueAllowUsers::class,
          space.axolab.axogram.tgnet.TLRPC.InputPrivacyRule::TLdeserialize, null)

    }

    @Test
    public fun test_InputPrivacyRule_TL_inputPrivacyValueDisallowContacts() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPrivacyRule.TL_inputPrivacyValueDisallowContacts::class,
          space.axolab.axogram.tgnet.TLRPC.InputPrivacyRule::TLdeserialize, null)

    }

    @Test
    public fun test_InputPrivacyRule_TL_inputPrivacyValueDisallowAll() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPrivacyRule.TL_inputPrivacyValueDisallowAll::class,
          space.axolab.axogram.tgnet.TLRPC.InputPrivacyRule::TLdeserialize, null)

    }

    @Test
    public fun test_InputPrivacyRule_TL_inputPrivacyValueDisallowUsers() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPrivacyRule.TL_inputPrivacyValueDisallowUsers::class,
          space.axolab.axogram.tgnet.TLRPC.InputPrivacyRule::TLdeserialize, null)

    }

    @Test
    public fun test_PrivacyRule_TL_privacyValueAllowContacts() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PrivacyRule.TL_privacyValueAllowContacts::class,
          space.axolab.axogram.tgnet.TLRPC.PrivacyRule::TLdeserialize, null)

    }

    @Test
    public fun test_PrivacyRule_TL_privacyValueAllowAll() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PrivacyRule.TL_privacyValueAllowAll::class,
          space.axolab.axogram.tgnet.TLRPC.PrivacyRule::TLdeserialize, null)

    }

    @Test
    public fun test_PrivacyRule_TL_privacyValueDisallowContacts() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PrivacyRule.TL_privacyValueDisallowContacts::class,
          space.axolab.axogram.tgnet.TLRPC.PrivacyRule::TLdeserialize, null)

    }

    @Test
    public fun test_PrivacyRule_TL_privacyValueDisallowAll() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PrivacyRule.TL_privacyValueDisallowAll::class,
          space.axolab.axogram.tgnet.TLRPC.PrivacyRule::TLdeserialize, null)

    }

    @Test
    public fun test_AccountDaysTTL_TL_accountDaysTTL() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_AccountDaysTTL.TL_accountDaysTTL::class,
          space.axolab.axogram.tgnet.TLRPC.TL_accountDaysTTL::TLdeserialize, null)

    }

    @Test
    public fun test_DocumentAttribute_TL_documentAttributeImageSize() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DocumentAttribute.TL_documentAttributeImageSize::class,
          space.axolab.axogram.tgnet.TLRPC.DocumentAttribute::TLdeserialize, null)

    }

    @Test
    public fun test_DocumentAttribute_TL_documentAttributeAnimated() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DocumentAttribute.TL_documentAttributeAnimated::class,
          space.axolab.axogram.tgnet.TLRPC.DocumentAttribute::TLdeserialize, null)

    }

    @Test
    public fun test_DocumentAttribute_TL_documentAttributeFilename() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DocumentAttribute.TL_documentAttributeFilename::class,
          space.axolab.axogram.tgnet.TLRPC.DocumentAttribute::TLdeserialize, null)

    }

    @Test
    public fun test_messages_Stickers_TL_messages_stickersNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_Stickers.TL_messages_stickersNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.messages_Stickers::TLdeserialize, null)

    }

    @Test
    public fun test_StickerPack_TL_stickerPack() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StickerPack.TL_stickerPack::class,
          space.axolab.axogram.tgnet.TLRPC.TL_stickerPack::TLdeserialize, null)

    }

    @Test
    public fun test_messages_AllStickers_TL_messages_allStickersNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_AllStickers.TL_messages_allStickersNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.messages_AllStickers::TLdeserialize, null)

    }

    @Test
    public fun test_MessageMedia_TL_messageMediaUnsupported() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaUnsupported::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_messages_Chats_TL_messages_chats() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_Chats.TL_messages_chats::class,
          space.axolab.axogram.tgnet.TLRPC.messages_Chats::TLdeserialize, null)

    }

    @Test
    public fun test_messages_AffectedHistory_TL_messages_affectedHistory() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_AffectedHistory.TL_messages_affectedHistory::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_affectedHistory::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateNewMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateNewMessage::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateDeleteMessages() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateDeleteMessages::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateReadHistoryOutbox() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateReadHistoryOutbox::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_messages_AffectedMessages_TL_messages_affectedMessages() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_AffectedMessages.TL_messages_affectedMessages::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_affectedMessages::TLdeserialize, null)

    }

    @Test
    public fun test_auth_PasswordRecovery_TL_auth_passwordRecovery() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_auth_PasswordRecovery.TL_auth_passwordRecovery::class,
          space.axolab.axogram.tgnet.TLRPC.TL_auth_passwordRecovery::TLdeserialize, null)

    }

    @Test
    public fun test_SendMessageAction_TL_sendMessageUploadVideoAction() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SendMessageAction.TL_sendMessageUploadVideoAction::class,
          space.axolab.axogram.tgnet.TLRPC.SendMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_SendMessageAction_TL_sendMessageUploadAudioAction() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SendMessageAction.TL_sendMessageUploadAudioAction::class,
          space.axolab.axogram.tgnet.TLRPC.SendMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_SendMessageAction_TL_sendMessageUploadPhotoAction() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SendMessageAction.TL_sendMessageUploadPhotoAction::class,
          space.axolab.axogram.tgnet.TLRPC.SendMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_SendMessageAction_TL_sendMessageUploadDocumentAction() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SendMessageAction.TL_sendMessageUploadDocumentAction::class,
          space.axolab.axogram.tgnet.TLRPC.SendMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_ReceivedNotifyMessage_TL_receivedNotifyMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ReceivedNotifyMessage.TL_receivedNotifyMessage::class,
          space.axolab.axogram.tgnet.TLRPC.TL_receivedNotifyMessage::TLdeserialize, null)

    }

    @Test
    public fun test_ChatInvite_TL_chatInviteAlready() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatInvite.TL_chatInviteAlready::class,
          space.axolab.axogram.tgnet.TLRPC.ChatInvite::TLdeserialize, null)

    }

    @Test
    public fun test_InputStickerSet_TL_inputStickerSetEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputStickerSet.TL_inputStickerSetEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.InputStickerSet::TLdeserialize, null)

    }

    @Test
    public fun test_InputStickerSet_TL_inputStickerSetID() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputStickerSet.TL_inputStickerSetID::class,
          space.axolab.axogram.tgnet.TLRPC.InputStickerSet::TLdeserialize, null)

    }

    @Test
    public fun test_InputStickerSet_TL_inputStickerSetShortName() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputStickerSet.TL_inputStickerSetShortName::class,
          space.axolab.axogram.tgnet.TLRPC.InputStickerSet::TLdeserialize, null)

    }

    @Test
    public fun test_BotCommand_TL_botCommand() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BotCommand.TL_botCommand::class,
          space.axolab.axogram.tgnet.TLRPC.TL_botCommand::TLdeserialize, null)

    }

    @Test
    public fun test_KeyboardButtonRow_TL_keyboardButtonRow() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButtonRow.TL_keyboardButtonRow::class,
          space.axolab.axogram.tgnet.TLRPC.TL_keyboardButtonRow::TLdeserialize, null)

    }

    @Test
    public fun test_ReplyMarkup_TL_replyKeyboardHide() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ReplyMarkup.TL_replyKeyboardHide::class,
          space.axolab.axogram.tgnet.TLRPC.ReplyMarkup::TLdeserialize, null)

    }

    @Test
    public fun test_MessageEntity_TL_messageEntityUnknown() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageEntity.TL_messageEntityUnknown::class,
          space.axolab.axogram.tgnet.TLRPC.MessageEntity::TLdeserialize, null)

    }

    @Test
    public fun test_MessageEntity_TL_messageEntityMention() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageEntity.TL_messageEntityMention::class,
          space.axolab.axogram.tgnet.TLRPC.MessageEntity::TLdeserialize, null)

    }

    @Test
    public fun test_MessageEntity_TL_messageEntityHashtag() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageEntity.TL_messageEntityHashtag::class,
          space.axolab.axogram.tgnet.TLRPC.MessageEntity::TLdeserialize, null)

    }

    @Test
    public fun test_MessageEntity_TL_messageEntityBotCommand() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageEntity.TL_messageEntityBotCommand::class,
          space.axolab.axogram.tgnet.TLRPC.MessageEntity::TLdeserialize, null)

    }

    @Test
    public fun test_MessageEntity_TL_messageEntityUrl() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageEntity.TL_messageEntityUrl::class,
          space.axolab.axogram.tgnet.TLRPC.MessageEntity::TLdeserialize, null)

    }

    @Test
    public fun test_MessageEntity_TL_messageEntityEmail() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageEntity.TL_messageEntityEmail::class,
          space.axolab.axogram.tgnet.TLRPC.MessageEntity::TLdeserialize, null)

    }

    @Test
    public fun test_MessageEntity_TL_messageEntityBold() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageEntity.TL_messageEntityBold::class,
          space.axolab.axogram.tgnet.TLRPC.MessageEntity::TLdeserialize, null)

    }

    @Test
    public fun test_MessageEntity_TL_messageEntityItalic() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageEntity.TL_messageEntityItalic::class,
          space.axolab.axogram.tgnet.TLRPC.MessageEntity::TLdeserialize, null)

    }

    @Test
    public fun test_MessageEntity_TL_messageEntityCode() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageEntity.TL_messageEntityCode::class,
          space.axolab.axogram.tgnet.TLRPC.MessageEntity::TLdeserialize, null)

    }

    @Test
    public fun test_MessageEntity_TL_messageEntityPre() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageEntity.TL_messageEntityPre::class,
          space.axolab.axogram.tgnet.TLRPC.MessageEntity::TLdeserialize, null)

    }

    @Test
    public fun test_MessageEntity_TL_messageEntityTextUrl() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageEntity.TL_messageEntityTextUrl::class,
          space.axolab.axogram.tgnet.TLRPC.MessageEntity::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateWebPage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateWebPage::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_InputChannel_TL_inputChannelEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputChannel.TL_inputChannelEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.InputChannel::TLdeserialize, null)

    }

    @Test
    public fun test_contacts_ResolvedPeer_TL_contacts_resolvedPeer() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_contacts_ResolvedPeer.TL_contacts_resolvedPeer::class,
          space.axolab.axogram.tgnet.TLRPC.TL_contacts_resolvedPeer::TLdeserialize, null)

    }

    @Test
    public fun test_MessageRange_TL_messageRange() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageRange.TL_messageRange::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messageRange::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionChannelCreate() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionChannelCreate::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateNewChannelMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateNewChannelMessage::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_updates_ChannelDifference_TL_updates_channelDifferenceEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_updates_ChannelDifference.TL_updates_channelDifferenceEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.updates_ChannelDifference::TLdeserialize, null)

    }

    @Test
    public fun test_updates_ChannelDifference_TL_updates_channelDifference() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_updates_ChannelDifference.TL_updates_channelDifference::class,
          space.axolab.axogram.tgnet.TLRPC.updates_ChannelDifference::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelMessagesFilter_TL_channelMessagesFilterEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelMessagesFilter.TL_channelMessagesFilterEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelMessagesFilter::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelMessagesFilter_TL_channelMessagesFilter() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelMessagesFilter.TL_channelMessagesFilter::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelMessagesFilter::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelParticipantsFilter_TL_channelParticipantsRecent() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelParticipantsFilter.TL_channelParticipantsRecent::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelParticipantsFilter::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelParticipantsFilter_TL_channelParticipantsAdmins() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelParticipantsFilter.TL_channelParticipantsAdmins::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelParticipantsFilter::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelParticipantsFilter_TL_channelParticipantsBots() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelParticipantsFilter.TL_channelParticipantsBots::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelParticipantsFilter::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateNewStickerSet() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateNewStickerSet::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_messages_SavedGifs_TL_messages_savedGifsNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_SavedGifs.TL_messages_savedGifsNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.messages_SavedGifs::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateSavedGifs() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateSavedGifs::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_DocumentAttribute_TL_documentAttributeAudio() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DocumentAttribute.TL_documentAttributeAudio::class,
          space.axolab.axogram.tgnet.TLRPC.DocumentAttribute::TLdeserialize, null)

    }

    @Test
    public fun test_MessagesFilter_TL_inputMessagesFilterVoice() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessagesFilter.TL_inputMessagesFilterVoice::class,
          space.axolab.axogram.tgnet.TLRPC.MessagesFilter::TLdeserialize, null)

    }

    @Test
    public fun test_MessagesFilter_TL_inputMessagesFilterMusic() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessagesFilter.TL_inputMessagesFilterMusic::class,
          space.axolab.axogram.tgnet.TLRPC.MessagesFilter::TLdeserialize, null)

    }

    @Test
    public fun test_InputPrivacyKey_TL_inputPrivacyKeyChatInvite() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPrivacyKey.TL_inputPrivacyKeyChatInvite::class,
          space.axolab.axogram.tgnet.TLRPC.InputPrivacyKey::TLdeserialize, null)

    }

    @Test
    public fun test_PrivacyKey_TL_privacyKeyChatInvite() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PrivacyKey.TL_privacyKeyChatInvite::class,
          space.axolab.axogram.tgnet.TLRPC.PrivacyKey::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateEditChannelMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateEditChannelMessage::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionPinMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionPinMessage::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_auth_SentCode_TL_auth_sentCode() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_auth_SentCode.TL_auth_sentCode::class,
          space.axolab.axogram.tgnet.TLRPC.auth_SentCode::TLdeserialize, null)

    }

    @Test
    public fun test_auth_CodeType_TL_auth_codeTypeSms() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_auth_CodeType.TL_auth_codeTypeSms::class,
          space.axolab.axogram.tgnet.TLRPC.auth_CodeType::TLdeserialize, null)

    }

    @Test
    public fun test_auth_CodeType_TL_auth_codeTypeCall() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_auth_CodeType.TL_auth_codeTypeCall::class,
          space.axolab.axogram.tgnet.TLRPC.auth_CodeType::TLdeserialize, null)

    }

    @Test
    public fun test_auth_CodeType_TL_auth_codeTypeFlashCall() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_auth_CodeType.TL_auth_codeTypeFlashCall::class,
          space.axolab.axogram.tgnet.TLRPC.auth_CodeType::TLdeserialize, null)

    }

    @Test
    public fun test_auth_SentCodeType_TL_auth_sentCodeTypeApp() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_auth_SentCodeType.TL_auth_sentCodeTypeApp::class,
          space.axolab.axogram.tgnet.TLRPC.auth_SentCodeType::TLdeserialize, null)

    }

    @Test
    public fun test_auth_SentCodeType_TL_auth_sentCodeTypeSms() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_auth_SentCodeType.TL_auth_sentCodeTypeSms::class,
          space.axolab.axogram.tgnet.TLRPC.auth_SentCodeType::TLdeserialize, null)

    }

    @Test
    public fun test_auth_SentCodeType_TL_auth_sentCodeTypeCall() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_auth_SentCodeType.TL_auth_sentCodeTypeCall::class,
          space.axolab.axogram.tgnet.TLRPC.auth_SentCodeType::TLdeserialize, null)

    }

    @Test
    public fun test_auth_SentCodeType_TL_auth_sentCodeTypeFlashCall() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_auth_SentCodeType.TL_auth_sentCodeTypeFlashCall::class,
          space.axolab.axogram.tgnet.TLRPC.auth_SentCodeType::TLdeserialize, null)

    }

    @Test
    public fun test_BotInlineMessage_TL_botInlineMessageText() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BotInlineMessage.TL_botInlineMessageText::class,
          space.axolab.axogram.tgnet.TLRPC.BotInlineMessage::TLdeserialize, null)

    }

    @Test
    public fun test_ReplyMarkup_TL_replyInlineMarkup() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ReplyMarkup.TL_replyInlineMarkup::class,
          space.axolab.axogram.tgnet.TLRPC.ReplyMarkup::TLdeserialize, null)

    }

    @Test
    public fun test_messages_MessageEditData_TL_messages_messageEditData() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_MessageEditData.TL_messages_messageEditData::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_messageEditData::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateEditMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateEditMessage::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_BotInlineResult_TL_botInlineMediaResult() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BotInlineResult.TL_botInlineMediaResult::class,
          space.axolab.axogram.tgnet.TLRPC.BotInlineResult::TLdeserialize, null)

    }

    @Test
    public fun test_InputBotInlineMessageID_TL_inputBotInlineMessageID() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputBotInlineMessageID.TL_inputBotInlineMessageID::class,
          space.axolab.axogram.tgnet.TLRPC.TL_inputBotInlineMessageID::TLdeserialize, null)

    }

    @Test
    public fun test_InlineBotSwitchPM_TL_inlineBotSwitchPM() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InlineBotSwitchPM.TL_inlineBotSwitchPM::class,
          space.axolab.axogram.tgnet.TLRPC.TL_inlineBotSwitchPM::TLdeserialize, null)

    }

    @Test
    public fun test_messages_PeerDialogs_TL_messages_peerDialogs() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_PeerDialogs.TL_messages_peerDialogs::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_peerDialogs::TLdeserialize, null)

    }

    @Test
    public fun test_TopPeer_TL_topPeer() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_TopPeer.TL_topPeer::class,
          space.axolab.axogram.tgnet.TLRPC.TL_topPeer::TLdeserialize, null)

    }

    @Test
    public fun test_TopPeerCategory_TL_topPeerCategoryBotsPM() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_TopPeerCategory.TL_topPeerCategoryBotsPM::class,
          space.axolab.axogram.tgnet.TLRPC.TopPeerCategory::TLdeserialize, null)

    }

    @Test
    public fun test_TopPeerCategory_TL_topPeerCategoryBotsInline() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_TopPeerCategory.TL_topPeerCategoryBotsInline::class,
          space.axolab.axogram.tgnet.TLRPC.TopPeerCategory::TLdeserialize, null)

    }

    @Test
    public fun test_TopPeerCategory_TL_topPeerCategoryCorrespondents() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_TopPeerCategory.TL_topPeerCategoryCorrespondents::class,
          space.axolab.axogram.tgnet.TLRPC.TopPeerCategory::TLdeserialize, null)

    }

    @Test
    public fun test_TopPeerCategory_TL_topPeerCategoryGroups() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_TopPeerCategory.TL_topPeerCategoryGroups::class,
          space.axolab.axogram.tgnet.TLRPC.TopPeerCategory::TLdeserialize, null)

    }

    @Test
    public fun test_TopPeerCategory_TL_topPeerCategoryChannels() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_TopPeerCategory.TL_topPeerCategoryChannels::class,
          space.axolab.axogram.tgnet.TLRPC.TopPeerCategory::TLdeserialize, null)

    }

    @Test
    public fun test_TopPeerCategoryPeers_TL_topPeerCategoryPeers() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_TopPeerCategoryPeers.TL_topPeerCategoryPeers::class,
          space.axolab.axogram.tgnet.TLRPC.TL_topPeerCategoryPeers::TLdeserialize, null)

    }

    @Test
    public fun test_contacts_TopPeers_TL_contacts_topPeersNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_contacts_TopPeers.TL_contacts_topPeersNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.contacts_TopPeers::TLdeserialize, null)

    }

    @Test
    public fun test_contacts_TopPeers_TL_contacts_topPeers() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_contacts_TopPeers.TL_contacts_topPeers::class,
          space.axolab.axogram.tgnet.TLRPC.contacts_TopPeers::TLdeserialize, null)

    }

    @Test
    public fun test_MessageEntity_TL_inputMessageEntityMentionName() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageEntity.TL_inputMessageEntityMentionName::class,
          space.axolab.axogram.tgnet.TLRPC.MessageEntity::TLdeserialize, null)

    }

    @Test
    public fun test_MessagesFilter_TL_inputMessagesFilterChatPhotos() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessagesFilter.TL_inputMessagesFilterChatPhotos::class,
          space.axolab.axogram.tgnet.TLRPC.MessagesFilter::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionHistoryClear() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionHistoryClear::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateReadFeaturedStickers() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateReadFeaturedStickers::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_messages_RecentStickers_TL_messages_recentStickersNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_RecentStickers.TL_messages_recentStickersNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.messages_RecentStickers::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateRecentStickers() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateRecentStickers::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_messages_ArchivedStickers_TL_messages_archivedStickers() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_ArchivedStickers.TL_messages_archivedStickers::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_archivedStickers::TLdeserialize, null)

    }

    @Test
    public fun test_messages_StickerSetInstallResult_TL_messages_stickerSetInstallResultSuccess() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_StickerSetInstallResult.TL_messages_stickerSetInstallResultSuccess::class,
          space.axolab.axogram.tgnet.TLRPC.messages_StickerSetInstallResult::TLdeserialize, null)

    }

    @Test
    public fun test_messages_StickerSetInstallResult_TL_messages_stickerSetInstallResultArchive() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_StickerSetInstallResult.TL_messages_stickerSetInstallResultArchive::class,
          space.axolab.axogram.tgnet.TLRPC.messages_StickerSetInstallResult::TLdeserialize, null)

    }

    @Test
    public fun test_StickerSetCovered_TL_stickerSetCovered() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StickerSetCovered.TL_stickerSetCovered::class,
          space.axolab.axogram.tgnet.TLRPC.StickerSetCovered::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateConfig() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateConfig::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_InputChatPhoto_TL_inputChatPhoto() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputChatPhoto.TL_inputChatPhoto::class,
          space.axolab.axogram.tgnet.TLRPC.InputChatPhoto::TLdeserialize, null)

    }

    @Test
    public fun test_DocumentAttribute_TL_documentAttributeSticker() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DocumentAttribute.TL_documentAttributeSticker::class,
          space.axolab.axogram.tgnet.TLRPC.DocumentAttribute::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateStickerSetsOrder() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateStickerSetsOrder::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_StickerSetCovered_TL_stickerSetMultiCovered() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StickerSetCovered.TL_stickerSetMultiCovered::class,
          space.axolab.axogram.tgnet.TLRPC.StickerSetCovered::TLdeserialize, null)

    }

    @Test
    public fun test_MaskCoords_TL_maskCoords() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MaskCoords.TL_maskCoords::class,
          space.axolab.axogram.tgnet.TLRPC.TL_maskCoords::TLdeserialize, null)

    }

    @Test
    public fun test_DocumentAttribute_TL_documentAttributeHasStickers() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DocumentAttribute.TL_documentAttributeHasStickers::class,
          space.axolab.axogram.tgnet.TLRPC.DocumentAttribute::TLdeserialize, null)

    }

    @Test
    public fun test_InputStickeredMedia_TL_inputStickeredMediaPhoto() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputStickeredMedia.TL_inputStickeredMediaPhoto::class,
          space.axolab.axogram.tgnet.TLRPC.InputStickeredMedia::TLdeserialize, null)

    }

    @Test
    public fun test_InputStickeredMedia_TL_inputStickeredMediaDocument() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputStickeredMedia.TL_inputStickeredMediaDocument::class,
          space.axolab.axogram.tgnet.TLRPC.InputStickeredMedia::TLdeserialize, null)

    }

    @Test
    public fun test_Game_TL_game() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Game.TL_game::class,
          space.axolab.axogram.tgnet.TLRPC.TL_game::TLdeserialize, null)

    }

    @Test
    public fun test_MessageMedia_TL_messageMediaGame() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaGame::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_InputMedia_TL_inputMediaGame() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputMedia.TL_inputMediaGame::class,
          space.axolab.axogram.tgnet.TLRPC.InputMedia::TLdeserialize, null)

    }

    @Test
    public fun test_InputGame_TL_inputGameID() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputGame.TL_inputGameID::class,
          space.axolab.axogram.tgnet.TLRPC.InputGame::TLdeserialize, null)

    }

    @Test
    public fun test_InputGame_TL_inputGameShortName() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputGame.TL_inputGameShortName::class,
          space.axolab.axogram.tgnet.TLRPC.InputGame::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionGameScore() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionGameScore::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_messages_HighScores_TL_messages_highScores() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_HighScores.TL_messages_highScores::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_highScores::TLdeserialize, null)

    }

    @Test
    public fun test_messages_BotCallbackAnswer_TL_messages_botCallbackAnswer() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_BotCallbackAnswer.TL_messages_botCallbackAnswer::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_botCallbackAnswer::TLdeserialize, null)

    }

    @Test
    public fun test_updates_Difference_TL_updates_differenceTooLong() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_updates_Difference.TL_updates_differenceTooLong::class,
          space.axolab.axogram.tgnet.TLRPC.updates_Difference::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateServiceNotification() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateServiceNotification::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_messages_Chats_TL_messages_chatsSlice() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_Chats.TL_messages_chatsSlice::class,
          space.axolab.axogram.tgnet.TLRPC.messages_Chats::TLdeserialize, null)

    }

    @Test
    public fun test_RichText_TL_textEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_RichText.TL_textEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.RichText::TLdeserialize, null)

    }

    @Test
    public fun test_RichText_TL_textPlain() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_RichText.TL_textPlain::class,
          space.axolab.axogram.tgnet.TLRPC.RichText::TLdeserialize, null)

    }

    @Test
    public fun test_RichText_TL_textBold() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_RichText.TL_textBold::class,
          space.axolab.axogram.tgnet.TLRPC.RichText::TLdeserialize, null)

    }

    @Test
    public fun test_RichText_TL_textItalic() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_RichText.TL_textItalic::class,
          space.axolab.axogram.tgnet.TLRPC.RichText::TLdeserialize, null)

    }

    @Test
    public fun test_RichText_TL_textUnderline() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_RichText.TL_textUnderline::class,
          space.axolab.axogram.tgnet.TLRPC.RichText::TLdeserialize, null)

    }

    @Test
    public fun test_RichText_TL_textStrike() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_RichText.TL_textStrike::class,
          space.axolab.axogram.tgnet.TLRPC.RichText::TLdeserialize, null)

    }

    @Test
    public fun test_RichText_TL_textFixed() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_RichText.TL_textFixed::class,
          space.axolab.axogram.tgnet.TLRPC.RichText::TLdeserialize, null)

    }

    @Test
    public fun test_RichText_TL_textUrl() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_RichText.TL_textUrl::class,
          space.axolab.axogram.tgnet.TLRPC.RichText::TLdeserialize, null)

    }

    @Test
    public fun test_RichText_TL_textEmail() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_RichText.TL_textEmail::class,
          space.axolab.axogram.tgnet.TLRPC.RichText::TLdeserialize, null)

    }

    @Test
    public fun test_RichText_TL_textConcat() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_RichText.TL_textConcat::class,
          space.axolab.axogram.tgnet.TLRPC.RichText::TLdeserialize, null)

    }

    @Test
    public fun test_PageBlock_TL_pageBlockUnsupported() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockUnsupported::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, null)

    }

    @Test
    public fun test_PageBlock_TL_pageBlockTitle() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockTitle::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, null)

    }

    @Test
    public fun test_PageBlock_TL_pageBlockSubtitle() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockSubtitle::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, null)

    }

    @Test
    public fun test_PageBlock_TL_pageBlockHeader() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockHeader::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, null)

    }

    @Test
    public fun test_PageBlock_TL_pageBlockSubheader() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockSubheader::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, null)

    }

    @Test
    public fun test_PageBlock_TL_pageBlockParagraph() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockParagraph::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, null)

    }

    @Test
    public fun test_PageBlock_TL_pageBlockPreformatted() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockPreformatted::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, null)

    }

    @Test
    public fun test_PageBlock_TL_pageBlockFooter() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockFooter::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, null)

    }

    @Test
    public fun test_PageBlock_TL_pageBlockDivider() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockDivider::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, null)

    }

    @Test
    public fun test_PageBlock_TL_pageBlockAnchor() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockAnchor::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, null)

    }

    @Test
    public fun test_PageBlock_TL_pageBlockBlockquote() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockBlockquote::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, null)

    }

    @Test
    public fun test_PageBlock_TL_pageBlockPullquote() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockPullquote::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, null)

    }

    @Test
    public fun test_PageBlock_TL_pageBlockCover() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockCover::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, null)

    }

    @Test
    public fun test_InputPrivacyKey_TL_inputPrivacyKeyPhoneCall() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPrivacyKey.TL_inputPrivacyKeyPhoneCall::class,
          space.axolab.axogram.tgnet.TLRPC.InputPrivacyKey::TLdeserialize, null)

    }

    @Test
    public fun test_PrivacyKey_TL_privacyKeyPhoneCall() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PrivacyKey.TL_privacyKeyPhoneCall::class,
          space.axolab.axogram.tgnet.TLRPC.PrivacyKey::TLdeserialize, null)

    }

    @Test
    public fun test_SendMessageAction_TL_sendMessageGamePlayAction() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SendMessageAction.TL_sendMessageGamePlayAction::class,
          space.axolab.axogram.tgnet.TLRPC.SendMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_PageBlock_TL_pageBlockAuthorDate() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockAuthorDate::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, null)

    }

    @Test
    public fun test_PhoneCallDiscardReason_TL_phoneCallDiscardReasonMissed() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PhoneCallDiscardReason.TL_phoneCallDiscardReasonMissed::class,
          space.axolab.axogram.tgnet.TLRPC.PhoneCallDiscardReason::TLdeserialize, null)

    }

    @Test
    public fun test_PhoneCallDiscardReason_TL_phoneCallDiscardReasonDisconnect() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PhoneCallDiscardReason.TL_phoneCallDiscardReasonDisconnect::class,
          space.axolab.axogram.tgnet.TLRPC.PhoneCallDiscardReason::TLdeserialize, null)

    }

    @Test
    public fun test_PhoneCallDiscardReason_TL_phoneCallDiscardReasonHangup() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PhoneCallDiscardReason.TL_phoneCallDiscardReasonHangup::class,
          space.axolab.axogram.tgnet.TLRPC.PhoneCallDiscardReason::TLdeserialize, null)

    }

    @Test
    public fun test_PhoneCallDiscardReason_TL_phoneCallDiscardReasonBusy() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PhoneCallDiscardReason.TL_phoneCallDiscardReasonBusy::class,
          space.axolab.axogram.tgnet.TLRPC.PhoneCallDiscardReason::TLdeserialize, null)

    }

    @Test
    public fun test_DataJSON_TL_dataJSON() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DataJSON.TL_dataJSON::class,
          space.axolab.axogram.tgnet.TLRPC.TL_dataJSON::TLdeserialize, null)

    }

    @Test
    public fun test_LabeledPrice_TL_labeledPrice() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_LabeledPrice.TL_labeledPrice::class,
          space.axolab.axogram.tgnet.TLRPC.TL_labeledPrice::TLdeserialize, null)

    }

    @Test
    public fun test_PaymentCharge_TL_paymentCharge() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PaymentCharge.TL_paymentCharge::class,
          space.axolab.axogram.tgnet.TLRPC.TL_paymentCharge::TLdeserialize, null)

    }

    @Test
    public fun test_PostAddress_TL_postAddress() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PostAddress.TL_postAddress::class,
          space.axolab.axogram.tgnet.TLRPC.TL_postAddress::TLdeserialize, null)

    }

    @Test
    public fun test_PaymentRequestedInfo_TL_paymentRequestedInfo() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PaymentRequestedInfo.TL_paymentRequestedInfo::class,
          space.axolab.axogram.tgnet.TLRPC.TL_paymentRequestedInfo::TLdeserialize, null)

    }

    @Test
    public fun test_PaymentSavedCredentials_TL_paymentSavedCredentialsCard() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PaymentSavedCredentials.TL_paymentSavedCredentialsCard::class,
          space.axolab.axogram.tgnet.TLRPC.TL_paymentSavedCredentialsCard::TLdeserialize, null)

    }

    @Test
    public fun test_InputWebDocument_TL_inputWebDocument() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputWebDocument.TL_inputWebDocument::class,
          space.axolab.axogram.tgnet.TLRPC.TL_inputWebDocument::TLdeserialize, null)

    }

    @Test
    public fun test_InputWebFileLocation_TL_inputWebFileLocation() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputWebFileLocation.TL_inputWebFileLocation::class,
          space.axolab.axogram.tgnet.TLRPC.InputWebFileLocation::TLdeserialize, null)

    }

    @Test
    public fun test_upload_WebFile_TL_upload_webFile() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_upload_WebFile.TL_upload_webFile::class,
          space.axolab.axogram.tgnet.TLRPC.TL_upload_webFile::TLdeserialize, null)

    }

    @Test
    public fun test_payments_ValidatedRequestedInfo_TL_payments_validatedRequestedInfo() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_ValidatedRequestedInfo.TL_payments_validatedRequestedInfo::class,
          space.axolab.axogram.tgnet.TLRPC.TL_payments_validatedRequestedInfo::TLdeserialize, null)

    }

    @Test
    public fun test_payments_PaymentResult_TL_payments_paymentResult() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_PaymentResult.TL_payments_paymentResult::class,
          space.axolab.axogram.tgnet.TLRPC.payments_PaymentResult::TLdeserialize, null)

    }

    @Test
    public fun test_payments_SavedInfo_TL_payments_savedInfo() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_SavedInfo.TL_payments_savedInfo::class,
          space.axolab.axogram.tgnet.TLRPC.TL_payments_savedInfo::TLdeserialize, null)

    }

    @Test
    public fun test_InputPaymentCredentials_TL_inputPaymentCredentialsSaved() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPaymentCredentials.TL_inputPaymentCredentialsSaved::class,
          space.axolab.axogram.tgnet.TLRPC.InputPaymentCredentials::TLdeserialize, null)

    }

    @Test
    public fun test_InputPaymentCredentials_TL_inputPaymentCredentials() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPaymentCredentials.TL_inputPaymentCredentials::class,
          space.axolab.axogram.tgnet.TLRPC.InputPaymentCredentials::TLdeserialize, null)

    }

    @Test
    public fun test_account_TmpPassword_TL_account_tmpPassword() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_TmpPassword.TL_account_tmpPassword::class,
          space.axolab.axogram.tgnet.tl.TL_account.tmpPassword::TLdeserialize, null)

    }

    @Test
    public fun test_ShippingOption_TL_shippingOption() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ShippingOption.TL_shippingOption::class,
          space.axolab.axogram.tgnet.TLRPC.TL_shippingOption::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updatePhoneCall() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updatePhoneCall::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_InputPhoneCall_TL_inputPhoneCall() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPhoneCall.TL_inputPhoneCall::class,
          space.axolab.axogram.tgnet.TLRPC.TL_inputPhoneCall::TLdeserialize, null)

    }

    @Test
    public fun test_PhoneCall_TL_phoneCallEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PhoneCall.TL_phoneCallEmpty::class,
          space.axolab.axogram.tgnet.tl.TL_phone.PhoneCall::TLdeserialize, null)

    }

    @Test
    public fun test_PhoneCall_TL_phoneCallDiscarded() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PhoneCall.TL_phoneCallDiscarded::class,
          space.axolab.axogram.tgnet.tl.TL_phone.PhoneCall::TLdeserialize, null)

    }

    @Test
    public fun test_phone_PhoneCall_TL_phone_phoneCall() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_phone_PhoneCall.TL_phone_phoneCall::class,
          space.axolab.axogram.tgnet.tl.TL_phone.TL_phone_phoneCall::TLdeserialize, null)

    }

    @Test
    public fun test_MessagesFilter_TL_inputMessagesFilterPhoneCalls() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessagesFilter.TL_inputMessagesFilterPhoneCalls::class,
          space.axolab.axogram.tgnet.TLRPC.MessagesFilter::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionPhoneCall() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionPhoneCall::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_MessagesFilter_TL_inputMessagesFilterRoundVoice() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessagesFilter.TL_inputMessagesFilterRoundVoice::class,
          space.axolab.axogram.tgnet.TLRPC.MessagesFilter::TLdeserialize, null)

    }

    @Test
    public fun test_MessagesFilter_TL_inputMessagesFilterRoundVideo() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessagesFilter.TL_inputMessagesFilterRoundVideo::class,
          space.axolab.axogram.tgnet.TLRPC.MessagesFilter::TLdeserialize, null)

    }

    @Test
    public fun test_SendMessageAction_TL_sendMessageRecordRoundAction() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SendMessageAction.TL_sendMessageRecordRoundAction::class,
          space.axolab.axogram.tgnet.TLRPC.SendMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_SendMessageAction_TL_sendMessageUploadRoundAction() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SendMessageAction.TL_sendMessageUploadRoundAction::class,
          space.axolab.axogram.tgnet.TLRPC.SendMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_upload_CdnFile_TL_upload_cdnFileReuploadNeeded() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_upload_CdnFile.TL_upload_cdnFileReuploadNeeded::class,
          space.axolab.axogram.tgnet.TLRPC.upload_CdnFile::TLdeserialize, null)

    }

    @Test
    public fun test_upload_CdnFile_TL_upload_cdnFile() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_upload_CdnFile.TL_upload_cdnFile::class,
          space.axolab.axogram.tgnet.TLRPC.upload_CdnFile::TLdeserialize, null)

    }

    @Test
    public fun test_PageBlock_TL_pageBlockChannel() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockChannel::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, null)

    }

    @Test
    public fun test_LangPackString_TL_langPackString() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_LangPackString.TL_langPackString::class,
          space.axolab.axogram.tgnet.TLRPC.LangPackString::TLdeserialize, null)

    }

    @Test
    public fun test_LangPackString_TL_langPackStringPluralized() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_LangPackString.TL_langPackStringPluralized::class,
          space.axolab.axogram.tgnet.TLRPC.LangPackString::TLdeserialize, null)

    }

    @Test
    public fun test_LangPackString_TL_langPackStringDeleted() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_LangPackString.TL_langPackStringDeleted::class,
          space.axolab.axogram.tgnet.TLRPC.LangPackString::TLdeserialize, null)

    }

    @Test
    public fun test_LangPackDifference_TL_langPackDifference() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_LangPackDifference.TL_langPackDifference::class,
          space.axolab.axogram.tgnet.TLRPC.TL_langPackDifference::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateLangPack() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateLangPack::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelParticipantsFilter_TL_channelParticipantsKicked() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelParticipantsFilter.TL_channelParticipantsKicked::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelParticipantsFilter::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelParticipantsFilter_TL_channelParticipantsBanned() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelParticipantsFilter.TL_channelParticipantsBanned::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelParticipantsFilter::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelParticipantsFilter_TL_channelParticipantsSearch() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelParticipantsFilter.TL_channelParticipantsSearch::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelParticipantsFilter::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionChangeTitle() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionChangeTitle::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionChangeAbout() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionChangeAbout::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionChangeUsername() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionChangeUsername::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionToggleInvites() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionToggleInvites::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionToggleSignatures() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionToggleSignatures::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionUpdatePinned() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionUpdatePinned::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionEditMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionEditMessage::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionDeleteMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionDeleteMessage::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionParticipantJoin() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionParticipantJoin::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionParticipantLeave() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionParticipantLeave::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionParticipantInvite() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionParticipantInvite::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public
        fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionParticipantToggleAdmin() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionParticipantToggleAdmin::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_channels_AdminLogResults_TL_channels_adminLogResults() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_channels_AdminLogResults.TL_channels_adminLogResults::class,
          space.axolab.axogram.tgnet.TLRPC.TL_channels_adminLogResults::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventsFilter_TL_channelAdminLogEventsFilter() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventsFilter.TL_channelAdminLogEventsFilter::class,
          space.axolab.axogram.tgnet.TLRPC.TL_channelAdminLogEventsFilter::TLdeserialize, null)

    }

    @Test
    public fun test_TopPeerCategory_TL_topPeerCategoryPhoneCalls() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_TopPeerCategory.TL_topPeerCategoryPhoneCalls::class,
          space.axolab.axogram.tgnet.TLRPC.TopPeerCategory::TLdeserialize, null)

    }

    @Test
    public fun test_contacts_ImportedContacts_TL_contacts_importedContacts() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_contacts_ImportedContacts.TL_contacts_importedContacts::class,
          space.axolab.axogram.tgnet.TLRPC.TL_contacts_importedContacts::TLdeserialize, null)

    }

    @Test
    public fun test_PopularContact_TL_popularContact() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PopularContact.TL_popularContact::class,
          space.axolab.axogram.tgnet.TLRPC.TL_popularContact::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionScreenshotTaken() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionScreenshotTaken::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_contacts_Contacts_TL_contacts_contacts() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_contacts_Contacts.TL_contacts_contacts::class,
          space.axolab.axogram.tgnet.TLRPC.contacts_Contacts::TLdeserialize, null)

    }

    @Test
    public fun test_messages_FavedStickers_TL_messages_favedStickersNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_FavedStickers.TL_messages_favedStickersNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.messages_FavedStickers::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateFavedStickers() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateFavedStickers::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_MessagesFilter_TL_inputMessagesFilterMyMentions() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessagesFilter.TL_inputMessagesFilterMyMentions::class,
          space.axolab.axogram.tgnet.TLRPC.MessagesFilter::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateContactsReset() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateContactsReset::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionChangeStickerSet() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionChangeStickerSet::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_InputMedia_TL_inputMediaVenue() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputMedia.TL_inputMediaVenue::class,
          space.axolab.axogram.tgnet.TLRPC.InputMedia::TLdeserialize, null)

    }

    @Test
    public fun test_MessageMedia_TL_messageMediaVenue() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaVenue::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionCustomAction() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionCustomAction::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_MessagesFilter_TL_inputMessagesFilterGeo() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessagesFilter.TL_inputMessagesFilterGeo::class,
          space.axolab.axogram.tgnet.TLRPC.MessagesFilter::TLdeserialize, null)

    }

    @Test
    public fun test_MessagesFilter_TL_inputMessagesFilterContacts() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessagesFilter.TL_inputMessagesFilterContacts::class,
          space.axolab.axogram.tgnet.TLRPC.MessagesFilter::TLdeserialize, null)

    }

    @Test
    public
        fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionTogglePreHistoryHidden() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionTogglePreHistoryHidden::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_RecentMeUrl_TL_recentMeUrlUnknown() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_RecentMeUrl.TL_recentMeUrlUnknown::class,
          space.axolab.axogram.tgnet.TLRPC.RecentMeUrl::TLdeserialize, null)

    }

    @Test
    public fun test_RecentMeUrl_TL_recentMeUrlChatInvite() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_RecentMeUrl.TL_recentMeUrlChatInvite::class,
          space.axolab.axogram.tgnet.TLRPC.RecentMeUrl::TLdeserialize, null)

    }

    @Test
    public fun test_RecentMeUrl_TL_recentMeUrlStickerSet() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_RecentMeUrl.TL_recentMeUrlStickerSet::class,
          space.axolab.axogram.tgnet.TLRPC.RecentMeUrl::TLdeserialize, null)

    }

    @Test
    public fun test_help_RecentMeUrls_TL_help_recentMeUrls() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_help_RecentMeUrls.TL_help_recentMeUrls::class,
          space.axolab.axogram.tgnet.TLRPC.TL_help_recentMeUrls::TLdeserialize, null)

    }

    @Test
    public fun test_channels_ChannelParticipants_TL_channels_channelParticipantsNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_channels_ChannelParticipants.TL_channels_channelParticipantsNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.channels_ChannelParticipants::TLdeserialize, null)

    }

    @Test
    public fun test_messages_Messages_TL_messages_messagesNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_Messages.TL_messages_messagesNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.messages_Messages::TLdeserialize, null)

    }

    @Test
    public fun test_contacts_Found_TL_contacts_found() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_contacts_Found.TL_contacts_found::class,
          space.axolab.axogram.tgnet.TLRPC.TL_contacts_found::TLdeserialize, null)

    }

    @Test
    public fun test_ExportedMessageLink_TL_exportedMessageLink() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ExportedMessageLink.TL_exportedMessageLink::class,
          space.axolab.axogram.tgnet.TLRPC.TL_exportedMessageLink::TLdeserialize, null)

    }

    @Test
    public fun test_BotInlineMessage_TL_botInlineMessageMediaAuto() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BotInlineMessage.TL_botInlineMessageMediaAuto::class,
          space.axolab.axogram.tgnet.TLRPC.BotInlineMessage::TLdeserialize, null)

    }

    @Test
    public fun test_InputMedia_TL_inputMediaPhotoExternal() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputMedia.TL_inputMediaPhotoExternal::class,
          space.axolab.axogram.tgnet.TLRPC.InputMedia::TLdeserialize, null)

    }

    @Test
    public fun test_account_WebAuthorizations_TL_account_webAuthorizations() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_WebAuthorizations.TL_account_webAuthorizations::class,
          space.axolab.axogram.tgnet.tl.TL_account.webAuthorizations::TLdeserialize, null)

    }

    @Test
    public fun test_BotInlineResult_TL_botInlineResult() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BotInlineResult.TL_botInlineResult::class,
          space.axolab.axogram.tgnet.TLRPC.BotInlineResult::TLdeserialize, null)

    }

    @Test
    public fun test_upload_File_TL_upload_fileCdnRedirect() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_upload_File.TL_upload_fileCdnRedirect::class,
          space.axolab.axogram.tgnet.TLRPC.upload_File::TLdeserialize, null)

    }

    @Test
    public fun test_InputSingleMedia_TL_inputSingleMedia() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputSingleMedia.TL_inputSingleMedia::class,
          space.axolab.axogram.tgnet.TLRPC.TL_inputSingleMedia::TLdeserialize, null)

    }

    @Test
    public fun test_MessageEntity_TL_messageEntityPhone() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageEntity.TL_messageEntityPhone::class,
          space.axolab.axogram.tgnet.TLRPC.MessageEntity::TLdeserialize, null)

    }

    @Test
    public fun test_MessageEntity_TL_messageEntityCashtag() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageEntity.TL_messageEntityCashtag::class,
          space.axolab.axogram.tgnet.TLRPC.MessageEntity::TLdeserialize, null)

    }

    @Test
    public fun test_InputDialogPeer_TL_inputDialogPeer() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputDialogPeer.TL_inputDialogPeer::class,
          space.axolab.axogram.tgnet.TLRPC.InputDialogPeer::TLdeserialize, null)

    }

    @Test
    public fun test_DialogPeer_TL_dialogPeer() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DialogPeer.TL_dialogPeer::class,
          space.axolab.axogram.tgnet.TLRPC.DialogPeer::TLdeserialize, null)

    }

    @Test
    public fun test_messages_FoundStickerSets_TL_messages_foundStickerSetsNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_FoundStickerSets.TL_messages_foundStickerSetsNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.messages_FoundStickerSets::TLdeserialize, null)

    }

    @Test
    public fun test_WebDocument_TL_webDocumentNoProxy() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_WebDocument.TL_webDocumentNoProxy::class,
          space.axolab.axogram.tgnet.TLRPC.WebDocument::TLdeserialize, null)

    }

    @Test
    public fun test_DcOption_TL_dcOption() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DcOption.TL_dcOption::class,
          space.axolab.axogram.tgnet.TLRPC.TL_dcOption::TLdeserialize, null)

    }

    @Test
    public fun test_BotInlineMessage_TL_botInlineMessageMediaVenue() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BotInlineMessage.TL_botInlineMessageMediaVenue::class,
          space.axolab.axogram.tgnet.TLRPC.BotInlineMessage::TLdeserialize, null)

    }

    @Test
    public fun test_help_TermsOfServiceUpdate_TL_help_termsOfServiceUpdateEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_help_TermsOfServiceUpdate.TL_help_termsOfServiceUpdateEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.help_TermsOfServiceUpdate::TLdeserialize, null)

    }

    @Test
    public fun test_help_TermsOfServiceUpdate_TL_help_termsOfServiceUpdate() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_help_TermsOfServiceUpdate.TL_help_termsOfServiceUpdate::class,
          space.axolab.axogram.tgnet.TLRPC.help_TermsOfServiceUpdate::TLdeserialize, null)

    }

    @Test
    public fun test_InputSecureFile_TL_inputSecureFileUploaded() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputSecureFile.TL_inputSecureFileUploaded::class,
          space.axolab.axogram.tgnet.TLRPC.InputSecureFile::TLdeserialize, null)

    }

    @Test
    public fun test_InputSecureFile_TL_inputSecureFile() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputSecureFile.TL_inputSecureFile::class,
          space.axolab.axogram.tgnet.TLRPC.InputSecureFile::TLdeserialize, null)

    }

    @Test
    public fun test_InputFileLocation_TL_inputSecureFileLocation() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputFileLocation.TL_inputSecureFileLocation::class,
          space.axolab.axogram.tgnet.TLRPC.InputFileLocation::TLdeserialize, null)

    }

    @Test
    public fun test_SecureFile_TL_secureFileEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureFile.TL_secureFileEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.SecureFile::TLdeserialize, null)

    }

    @Test
    public fun test_SecureData_TL_secureData() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureData.TL_secureData::class,
          space.axolab.axogram.tgnet.TLRPC.TL_secureData::TLdeserialize, null)

    }

    @Test
    public fun test_SecurePlainData_TL_securePlainPhone() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecurePlainData.TL_securePlainPhone::class,
          space.axolab.axogram.tgnet.TLRPC.SecurePlainData::TLdeserialize, null)

    }

    @Test
    public fun test_SecurePlainData_TL_securePlainEmail() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecurePlainData.TL_securePlainEmail::class,
          space.axolab.axogram.tgnet.TLRPC.SecurePlainData::TLdeserialize, null)

    }

    @Test
    public fun test_SecureValueType_TL_secureValueTypePersonalDetails() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureValueType.TL_secureValueTypePersonalDetails::class,
          space.axolab.axogram.tgnet.TLRPC.SecureValueType::TLdeserialize, null)

    }

    @Test
    public fun test_SecureValueType_TL_secureValueTypePassport() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureValueType.TL_secureValueTypePassport::class,
          space.axolab.axogram.tgnet.TLRPC.SecureValueType::TLdeserialize, null)

    }

    @Test
    public fun test_SecureValueType_TL_secureValueTypeDriverLicense() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureValueType.TL_secureValueTypeDriverLicense::class,
          space.axolab.axogram.tgnet.TLRPC.SecureValueType::TLdeserialize, null)

    }

    @Test
    public fun test_SecureValueType_TL_secureValueTypeIdentityCard() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureValueType.TL_secureValueTypeIdentityCard::class,
          space.axolab.axogram.tgnet.TLRPC.SecureValueType::TLdeserialize, null)

    }

    @Test
    public fun test_SecureValueType_TL_secureValueTypeInternalPassport() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureValueType.TL_secureValueTypeInternalPassport::class,
          space.axolab.axogram.tgnet.TLRPC.SecureValueType::TLdeserialize, null)

    }

    @Test
    public fun test_SecureValueType_TL_secureValueTypeAddress() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureValueType.TL_secureValueTypeAddress::class,
          space.axolab.axogram.tgnet.TLRPC.SecureValueType::TLdeserialize, null)

    }

    @Test
    public fun test_SecureValueType_TL_secureValueTypeUtilityBill() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureValueType.TL_secureValueTypeUtilityBill::class,
          space.axolab.axogram.tgnet.TLRPC.SecureValueType::TLdeserialize, null)

    }

    @Test
    public fun test_SecureValueType_TL_secureValueTypeBankStatement() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureValueType.TL_secureValueTypeBankStatement::class,
          space.axolab.axogram.tgnet.TLRPC.SecureValueType::TLdeserialize, null)

    }

    @Test
    public fun test_SecureValueType_TL_secureValueTypeRentalAgreement() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureValueType.TL_secureValueTypeRentalAgreement::class,
          space.axolab.axogram.tgnet.TLRPC.SecureValueType::TLdeserialize, null)

    }

    @Test
    public fun test_SecureValueType_TL_secureValueTypePassportRegistration() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureValueType.TL_secureValueTypePassportRegistration::class,
          space.axolab.axogram.tgnet.TLRPC.SecureValueType::TLdeserialize, null)

    }

    @Test
    public fun test_SecureValueType_TL_secureValueTypeTemporaryRegistration() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureValueType.TL_secureValueTypeTemporaryRegistration::class,
          space.axolab.axogram.tgnet.TLRPC.SecureValueType::TLdeserialize, null)

    }

    @Test
    public fun test_SecureValueType_TL_secureValueTypePhone() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureValueType.TL_secureValueTypePhone::class,
          space.axolab.axogram.tgnet.TLRPC.SecureValueType::TLdeserialize, null)

    }

    @Test
    public fun test_SecureValueType_TL_secureValueTypeEmail() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureValueType.TL_secureValueTypeEmail::class,
          space.axolab.axogram.tgnet.TLRPC.SecureValueType::TLdeserialize, null)

    }

    @Test
    public fun test_SecureValueHash_TL_secureValueHash() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureValueHash.TL_secureValueHash::class,
          space.axolab.axogram.tgnet.TLRPC.TL_secureValueHash::TLdeserialize, null)

    }

    @Test
    public fun test_SecureValueError_TL_secureValueErrorData() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureValueError.TL_secureValueErrorData::class,
          space.axolab.axogram.tgnet.TLRPC.SecureValueError::TLdeserialize, null)

    }

    @Test
    public fun test_SecureValueError_TL_secureValueErrorFrontSide() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureValueError.TL_secureValueErrorFrontSide::class,
          space.axolab.axogram.tgnet.TLRPC.SecureValueError::TLdeserialize, null)

    }

    @Test
    public fun test_SecureValueError_TL_secureValueErrorReverseSide() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureValueError.TL_secureValueErrorReverseSide::class,
          space.axolab.axogram.tgnet.TLRPC.SecureValueError::TLdeserialize, null)

    }

    @Test
    public fun test_SecureValueError_TL_secureValueErrorSelfie() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureValueError.TL_secureValueErrorSelfie::class,
          space.axolab.axogram.tgnet.TLRPC.SecureValueError::TLdeserialize, null)

    }

    @Test
    public fun test_SecureValueError_TL_secureValueErrorFile() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureValueError.TL_secureValueErrorFile::class,
          space.axolab.axogram.tgnet.TLRPC.SecureValueError::TLdeserialize, null)

    }

    @Test
    public fun test_SecureValueError_TL_secureValueErrorFiles() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureValueError.TL_secureValueErrorFiles::class,
          space.axolab.axogram.tgnet.TLRPC.SecureValueError::TLdeserialize, null)

    }

    @Test
    public fun test_SecureCredentialsEncrypted_TL_secureCredentialsEncrypted() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureCredentialsEncrypted.TL_secureCredentialsEncrypted::class,
          space.axolab.axogram.tgnet.TLRPC.TL_secureCredentialsEncrypted::TLdeserialize, null)

    }

    @Test
    public fun test_account_SentEmailCode_TL_account_sentEmailCode() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_SentEmailCode.TL_account_sentEmailCode::class,
          space.axolab.axogram.tgnet.tl.TL_account.sentEmailCode::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionSecureValuesSent() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionSecureValuesSent::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_help_DeepLinkInfo_TL_help_deepLinkInfoEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_help_DeepLinkInfo.TL_help_deepLinkInfoEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.help_DeepLinkInfo::TLdeserialize, null)

    }

    @Test
    public fun test_help_DeepLinkInfo_TL_help_deepLinkInfo() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_help_DeepLinkInfo.TL_help_deepLinkInfo::class,
          space.axolab.axogram.tgnet.TLRPC.help_DeepLinkInfo::TLdeserialize, null)

    }

    @Test
    public fun test_InputMedia_TL_inputMediaContact() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputMedia.TL_inputMediaContact::class,
          space.axolab.axogram.tgnet.TLRPC.InputMedia::TLdeserialize, null)

    }

    @Test
    public fun test_BotInlineMessage_TL_botInlineMessageMediaContact() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BotInlineMessage.TL_botInlineMessageMediaContact::class,
          space.axolab.axogram.tgnet.TLRPC.BotInlineMessage::TLdeserialize, null)

    }

    @Test
    public fun test_DraftMessage_TL_draftMessageEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DraftMessage.TL_draftMessageEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.DraftMessage::TLdeserialize, null)

    }

    @Test
    public fun test_WebDocument_TL_webDocument() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_WebDocument.TL_webDocument::class,
          space.axolab.axogram.tgnet.TLRPC.WebDocument::TLdeserialize, null)

    }

    @Test
    public fun test_messages_Dialogs_TL_messages_dialogsNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_Dialogs.TL_messages_dialogsNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.messages_Dialogs::TLdeserialize, null)

    }

    @Test
    public fun test_InputWebFileLocation_TL_inputWebFileGeoPointLocation() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputWebFileLocation.TL_inputWebFileGeoPointLocation::class,
          space.axolab.axogram.tgnet.TLRPC.InputWebFileLocation::TLdeserialize, null)

    }

    @Test
    public fun test_contacts_TopPeers_TL_contacts_topPeersDisabled() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_contacts_TopPeers.TL_contacts_topPeersDisabled::class,
          space.axolab.axogram.tgnet.TLRPC.contacts_TopPeers::TLdeserialize, null)

    }

    @Test
    public fun test_ReportReason_TL_inputReportReasonCopyright() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ReportReason.TL_inputReportReasonCopyright::class,
          space.axolab.axogram.tgnet.TLRPC.ReportReason::TLdeserialize, null)

    }

    @Test
    public fun test_account_PasswordSettings_TL_account_passwordSettings() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_PasswordSettings.TL_account_passwordSettings::class,
          space.axolab.axogram.tgnet.tl.TL_account.passwordSettings::TLdeserialize, null)

    }

    @Test
    public fun test_account_PasswordInputSettings_TL_account_passwordInputSettings() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_PasswordInputSettings.TL_account_passwordInputSettings::class,
          space.axolab.axogram.tgnet.tl.TL_account.passwordInputSettings::TLdeserialize, null)

    }

    @Test
    public fun test_PasswordKdfAlgo_TL_passwordKdfAlgoUnknown() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PasswordKdfAlgo.TL_passwordKdfAlgoUnknown::class,
          space.axolab.axogram.tgnet.TLRPC.PasswordKdfAlgo::TLdeserialize, null)

    }

    @Test
    public fun test_SecurePasswordKdfAlgo_TL_securePasswordKdfAlgoUnknown() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecurePasswordKdfAlgo.TL_securePasswordKdfAlgoUnknown::class,
          space.axolab.axogram.tgnet.TLRPC.SecurePasswordKdfAlgo::TLdeserialize, null)

    }

    @Test
    public fun test_SecurePasswordKdfAlgo_TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecurePasswordKdfAlgo.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000::class,
          space.axolab.axogram.tgnet.TLRPC.SecurePasswordKdfAlgo::TLdeserialize, null)

    }

    @Test
    public fun test_SecurePasswordKdfAlgo_TL_securePasswordKdfAlgoSHA512() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecurePasswordKdfAlgo.TL_securePasswordKdfAlgoSHA512::class,
          space.axolab.axogram.tgnet.TLRPC.SecurePasswordKdfAlgo::TLdeserialize, null)

    }

    @Test
    public fun test_SecureSecretSettings_TL_secureSecretSettings() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureSecretSettings.TL_secureSecretSettings::class,
          space.axolab.axogram.tgnet.TLRPC.TL_secureSecretSettings::TLdeserialize, null)

    }

    @Test
    public
        fun test_PasswordKdfAlgo_TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PasswordKdfAlgo.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow::class,
          space.axolab.axogram.tgnet.TLRPC.PasswordKdfAlgo::TLdeserialize, null)

    }

    @Test
    public fun test_InputCheckPasswordSRP_TL_inputCheckPasswordEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputCheckPasswordSRP.TL_inputCheckPasswordEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.InputCheckPasswordSRP::TLdeserialize, null)

    }

    @Test
    public fun test_InputCheckPasswordSRP_TL_inputCheckPasswordSRP() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputCheckPasswordSRP.TL_inputCheckPasswordSRP::class,
          space.axolab.axogram.tgnet.TLRPC.InputCheckPasswordSRP::TLdeserialize, null)

    }

    @Test
    public fun test_SecureValue_TL_secureValue() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureValue.TL_secureValue::class,
          space.axolab.axogram.tgnet.TLRPC.TL_secureValue::TLdeserialize, null)

    }

    @Test
    public fun test_InputSecureValue_TL_inputSecureValue() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputSecureValue.TL_inputSecureValue::class,
          space.axolab.axogram.tgnet.TLRPC.TL_inputSecureValue::TLdeserialize, null)

    }

    @Test
    public fun test_account_AuthorizationForm_TL_account_authorizationForm() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_AuthorizationForm.TL_account_authorizationForm::class,
          space.axolab.axogram.tgnet.tl.TL_account.authorizationForm::TLdeserialize, null)

    }

    @Test
    public fun test_SecureValueError_TL_secureValueError() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureValueError.TL_secureValueError::class,
          space.axolab.axogram.tgnet.TLRPC.SecureValueError::TLdeserialize, null)

    }

    @Test
    public fun test_SecureValueError_TL_secureValueErrorTranslationFile() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureValueError.TL_secureValueErrorTranslationFile::class,
          space.axolab.axogram.tgnet.TLRPC.SecureValueError::TLdeserialize, null)

    }

    @Test
    public fun test_SecureValueError_TL_secureValueErrorTranslationFiles() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureValueError.TL_secureValueErrorTranslationFiles::class,
          space.axolab.axogram.tgnet.TLRPC.SecureValueError::TLdeserialize, null)

    }

    @Test
    public fun test_SecureRequiredType_TL_secureRequiredType() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureRequiredType.TL_secureRequiredType::class,
          space.axolab.axogram.tgnet.TLRPC.SecureRequiredType::TLdeserialize, null)

    }

    @Test
    public fun test_SecureRequiredType_TL_secureRequiredTypeOneOf() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureRequiredType.TL_secureRequiredTypeOneOf::class,
          space.axolab.axogram.tgnet.TLRPC.SecureRequiredType::TLdeserialize, null)

    }

    @Test
    public fun test_help_PassportConfig_TL_help_passportConfigNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_help_PassportConfig.TL_help_passportConfigNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.help_PassportConfig::TLdeserialize, null)

    }

    @Test
    public fun test_help_PassportConfig_TL_help_passportConfig() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_help_PassportConfig.TL_help_passportConfig::class,
          space.axolab.axogram.tgnet.TLRPC.help_PassportConfig::TLdeserialize, null)

    }

    @Test
    public fun test_InputAppEvent_TL_inputAppEvent() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputAppEvent.TL_inputAppEvent::class,
          space.axolab.axogram.tgnet.TLRPC.TL_inputAppEvent::TLdeserialize, null)

    }

    @Test
    public fun test_JSONObjectValue_TL_jsonObjectValue() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_JSONObjectValue.TL_jsonObjectValue::class,
          space.axolab.axogram.tgnet.TLRPC.TL_jsonObjectValue::TLdeserialize, null)

    }

    @Test
    public fun test_JSONValue_TL_jsonNull() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_JSONValue.TL_jsonNull::class,
          space.axolab.axogram.tgnet.TLRPC.JSONValue::TLdeserialize, null)

    }

    @Test
    public fun test_JSONValue_TL_jsonBool() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_JSONValue.TL_jsonBool::class,
          space.axolab.axogram.tgnet.TLRPC.JSONValue::TLdeserialize, null)

    }

    @Test
    public fun test_JSONValue_TL_jsonNumber() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_JSONValue.TL_jsonNumber::class,
          space.axolab.axogram.tgnet.TLRPC.JSONValue::TLdeserialize, null)

    }

    @Test
    public fun test_JSONValue_TL_jsonString() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_JSONValue.TL_jsonString::class,
          space.axolab.axogram.tgnet.TLRPC.JSONValue::TLdeserialize, null)

    }

    @Test
    public fun test_JSONValue_TL_jsonArray() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_JSONValue.TL_jsonArray::class,
          space.axolab.axogram.tgnet.TLRPC.JSONValue::TLdeserialize, null)

    }

    @Test
    public fun test_JSONValue_TL_jsonObject() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_JSONValue.TL_jsonObject::class,
          space.axolab.axogram.tgnet.TLRPC.JSONValue::TLdeserialize, null)

    }

    @Test
    public fun test_InputPhoto_TL_inputPhoto() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPhoto.TL_inputPhoto::class,
          space.axolab.axogram.tgnet.TLRPC.InputPhoto::TLdeserialize, null)

    }

    @Test
    public fun test_InputFileLocation_TL_inputFileLocation() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputFileLocation.TL_inputFileLocation::class,
          space.axolab.axogram.tgnet.TLRPC.InputFileLocation::TLdeserialize, null)

    }

    @Test
    public fun test_InputDocument_TL_inputDocument() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputDocument.TL_inputDocument::class,
          space.axolab.axogram.tgnet.TLRPC.InputDocument::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateLangPackTooLong() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateLangPackTooLong::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_InputNotifyPeer_TL_inputNotifyBroadcasts() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputNotifyPeer.TL_inputNotifyBroadcasts::class,
          space.axolab.axogram.tgnet.TLRPC.InputNotifyPeer::TLdeserialize, null)

    }

    @Test
    public fun test_NotifyPeer_TL_notifyBroadcasts() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_NotifyPeer.TL_notifyBroadcasts::class,
          space.axolab.axogram.tgnet.TLRPC.NotifyPeer::TLdeserialize, null)

    }

    @Test
    public fun test_Authorization_TL_authorization() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Authorization.TL_authorization::class,
          space.axolab.axogram.tgnet.TLRPC.TL_authorization::TLdeserialize, null)

    }

    @Test
    public fun test_PageBlock_TL_pageBlockList() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockList::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, null)

    }

    @Test
    public fun test_PageBlock_TL_pageBlockPhoto() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockPhoto::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, null)

    }

    @Test
    public fun test_PageBlock_TL_pageBlockVideo() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockVideo::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, null)

    }

    @Test
    public fun test_PageBlock_TL_pageBlockEmbed() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockEmbed::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, null)

    }

    @Test
    public fun test_PageBlock_TL_pageBlockEmbedPost() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockEmbedPost::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, null)

    }

    @Test
    public fun test_PageBlock_TL_pageBlockCollage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockCollage::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, null)

    }

    @Test
    public fun test_PageBlock_TL_pageBlockSlideshow() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockSlideshow::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, null)

    }

    @Test
    public fun test_PageBlock_TL_pageBlockAudio() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockAudio::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, null)

    }

    @Test
    public fun test_RichText_TL_textSubscript() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_RichText.TL_textSubscript::class,
          space.axolab.axogram.tgnet.TLRPC.RichText::TLdeserialize, null)

    }

    @Test
    public fun test_RichText_TL_textSuperscript() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_RichText.TL_textSuperscript::class,
          space.axolab.axogram.tgnet.TLRPC.RichText::TLdeserialize, null)

    }

    @Test
    public fun test_RichText_TL_textMarked() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_RichText.TL_textMarked::class,
          space.axolab.axogram.tgnet.TLRPC.RichText::TLdeserialize, null)

    }

    @Test
    public fun test_RichText_TL_textPhone() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_RichText.TL_textPhone::class,
          space.axolab.axogram.tgnet.TLRPC.RichText::TLdeserialize, null)

    }

    @Test
    public fun test_RichText_TL_textImage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_RichText.TL_textImage::class,
          space.axolab.axogram.tgnet.TLRPC.RichText::TLdeserialize, null)

    }

    @Test
    public fun test_PageBlock_TL_pageBlockKicker() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockKicker::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, null)

    }

    @Test
    public fun test_PageTableCell_TL_pageTableCell() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageTableCell.TL_pageTableCell::class,
          space.axolab.axogram.tgnet.TLRPC.TL_pageTableCell::TLdeserialize, null)

    }

    @Test
    public fun test_PageTableRow_TL_pageTableRow() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageTableRow.TL_pageTableRow::class,
          space.axolab.axogram.tgnet.TLRPC.TL_pageTableRow::TLdeserialize, null)

    }

    @Test
    public fun test_PageBlock_TL_pageBlockTable() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockTable::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, null)

    }

    @Test
    public fun test_PageCaption_TL_pageCaption() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageCaption.TL_pageCaption::class,
          space.axolab.axogram.tgnet.TLRPC.TL_pageCaption::TLdeserialize, null)

    }

    @Test
    public fun test_PageListItem_TL_pageListItemText() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageListItem.TL_pageListItemText::class,
          space.axolab.axogram.tgnet.TLRPC.PageListItem::TLdeserialize, null)

    }

    @Test
    public fun test_PageListItem_TL_pageListItemBlocks() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageListItem.TL_pageListItemBlocks::class,
          space.axolab.axogram.tgnet.TLRPC.PageListItem::TLdeserialize, null)

    }

    @Test
    public fun test_PageListOrderedItem_TL_pageListOrderedItemText() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageListOrderedItem.TL_pageListOrderedItemText::class,
          space.axolab.axogram.tgnet.TLRPC.PageListOrderedItem::TLdeserialize, null)

    }

    @Test
    public fun test_PageListOrderedItem_TL_pageListOrderedItemBlocks() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageListOrderedItem.TL_pageListOrderedItemBlocks::class,
          space.axolab.axogram.tgnet.TLRPC.PageListOrderedItem::TLdeserialize, null)

    }

    @Test
    public fun test_PageBlock_TL_pageBlockOrderedList() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockOrderedList::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, null)

    }

    @Test
    public fun test_PageBlock_TL_pageBlockDetails() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockDetails::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, null)

    }

    @Test
    public fun test_PageBlock_TL_pageBlockRelatedArticles() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockRelatedArticles::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, null)

    }

    @Test
    public fun test_PageBlock_TL_pageBlockMap() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockMap::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, null)

    }

    @Test
    public fun test_InputPrivacyKey_TL_inputPrivacyKeyPhoneP2P() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPrivacyKey.TL_inputPrivacyKeyPhoneP2P::class,
          space.axolab.axogram.tgnet.TLRPC.InputPrivacyKey::TLdeserialize, null)

    }

    @Test
    public fun test_PrivacyKey_TL_privacyKeyPhoneP2P() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PrivacyKey.TL_privacyKeyPhoneP2P::class,
          space.axolab.axogram.tgnet.TLRPC.PrivacyKey::TLdeserialize, null)

    }

    @Test
    public fun test_LangPackLanguage_TL_langPackLanguage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_LangPackLanguage.TL_langPackLanguage::class,
          space.axolab.axogram.tgnet.TLRPC.TL_langPackLanguage::TLdeserialize, null)

    }

    @Test
    public fun test_PageRelatedArticle_TL_pageRelatedArticle() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageRelatedArticle.TL_pageRelatedArticle::class,
          space.axolab.axogram.tgnet.TLRPC.TL_pageRelatedArticle::TLdeserialize, null)

    }

    @Test
    public fun test_RichText_TL_textAnchor() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_RichText.TL_textAnchor::class,
          space.axolab.axogram.tgnet.TLRPC.RichText::TLdeserialize, null)

    }

    @Test
    public fun test_help_SupportName_TL_help_supportName() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_help_SupportName.TL_help_supportName::class,
          space.axolab.axogram.tgnet.TLRPC.TL_help_supportName::TLdeserialize, null)

    }

    @Test
    public fun test_help_UserInfo_TL_help_userInfoEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_help_UserInfo.TL_help_userInfoEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.help_UserInfo::TLdeserialize, null)

    }

    @Test
    public fun test_help_UserInfo_TL_help_userInfo() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_help_UserInfo.TL_help_userInfo::class,
          space.axolab.axogram.tgnet.TLRPC.help_UserInfo::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionContactSignUp() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionContactSignUp::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_ChatOnlines_TL_chatOnlines() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatOnlines.TL_chatOnlines::class,
          space.axolab.axogram.tgnet.TLRPC.TL_chatOnlines::TLdeserialize, null)

    }

    @Test
    public fun test_StatsURL_TL_statsURL() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StatsURL.TL_statsURL::class,
          space.axolab.axogram.tgnet.TLRPC.TL_statsURL::TLdeserialize, null)

    }

    @Test
    public fun test_PhotoSize_TL_photoStrippedSize() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PhotoSize.TL_photoStrippedSize::class,
          space.axolab.axogram.tgnet.TLRPC.PhotoSize::TLdeserialize, null)

    }

    @Test
    public fun test_ChatAdminRights_TL_chatAdminRights() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatAdminRights.TL_chatAdminRights::class,
          space.axolab.axogram.tgnet.TLRPC.TL_chatAdminRights::TLdeserialize, null)

    }

    @Test
    public fun test_ChatBannedRights_TL_chatBannedRights() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatBannedRights.TL_chatBannedRights::class,
          space.axolab.axogram.tgnet.TLRPC.TL_chatBannedRights::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateChatDefaultBannedRights() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateChatDefaultBannedRights::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_InputWallPaper_TL_inputWallPaper() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputWallPaper.TL_inputWallPaper::class,
          space.axolab.axogram.tgnet.TLRPC.InputWallPaper::TLdeserialize, null)

    }

    @Test
    public fun test_InputWallPaper_TL_inputWallPaperSlug() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputWallPaper.TL_inputWallPaperSlug::class,
          space.axolab.axogram.tgnet.TLRPC.InputWallPaper::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelParticipantsFilter_TL_channelParticipantsContacts() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelParticipantsFilter.TL_channelParticipantsContacts::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelParticipantsFilter::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionDefaultBannedRights() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionDefaultBannedRights::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionStopPoll() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionStopPoll::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_account_WallPapers_TL_account_wallPapersNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_WallPapers.TL_account_wallPapersNotModified::class,
          space.axolab.axogram.tgnet.tl.TL_account.WallPapers::TLdeserialize, null)

    }

    @Test
    public fun test_WallPaper_TL_wallPaper() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_WallPaper.TL_wallPaper::class,
          space.axolab.axogram.tgnet.TLRPC.WallPaper::TLdeserialize, null)

    }

    @Test
    public fun test_account_AutoDownloadSettings_TL_account_autoDownloadSettings() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_AutoDownloadSettings.TL_account_autoDownloadSettings::class,
          space.axolab.axogram.tgnet.tl.TL_account.autoDownloadSettings::TLdeserialize, null)

    }

    @Test
    public fun test_EmojiKeyword_TL_emojiKeyword() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_EmojiKeyword.TL_emojiKeyword::class,
          space.axolab.axogram.tgnet.TLRPC.EmojiKeyword::TLdeserialize, null)

    }

    @Test
    public fun test_EmojiKeyword_TL_emojiKeywordDeleted() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_EmojiKeyword.TL_emojiKeywordDeleted::class,
          space.axolab.axogram.tgnet.TLRPC.EmojiKeyword::TLdeserialize, null)

    }

    @Test
    public fun test_EmojiKeywordsDifference_TL_emojiKeywordsDifference() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_EmojiKeywordsDifference.TL_emojiKeywordsDifference::class,
          space.axolab.axogram.tgnet.TLRPC.TL_emojiKeywordsDifference::TLdeserialize, null)

    }

    @Test
    public fun test_EmojiURL_TL_emojiURL() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_EmojiURL.TL_emojiURL::class,
          space.axolab.axogram.tgnet.TLRPC.TL_emojiURL::TLdeserialize, null)

    }

    @Test
    public fun test_EmojiLanguage_TL_emojiLanguage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_EmojiLanguage.TL_emojiLanguage::class,
          space.axolab.axogram.tgnet.TLRPC.TL_emojiLanguage::TLdeserialize, null)

    }

    @Test
    public fun test_InputPrivacyKey_TL_inputPrivacyKeyForwards() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPrivacyKey.TL_inputPrivacyKeyForwards::class,
          space.axolab.axogram.tgnet.TLRPC.InputPrivacyKey::TLdeserialize, null)

    }

    @Test
    public fun test_PrivacyKey_TL_privacyKeyForwards() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PrivacyKey.TL_privacyKeyForwards::class,
          space.axolab.axogram.tgnet.TLRPC.PrivacyKey::TLdeserialize, null)

    }

    @Test
    public fun test_InputPrivacyKey_TL_inputPrivacyKeyProfilePhoto() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPrivacyKey.TL_inputPrivacyKeyProfilePhoto::class,
          space.axolab.axogram.tgnet.TLRPC.InputPrivacyKey::TLdeserialize, null)

    }

    @Test
    public fun test_PrivacyKey_TL_privacyKeyProfilePhoto() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PrivacyKey.TL_privacyKeyProfilePhoto::class,
          space.axolab.axogram.tgnet.TLRPC.PrivacyKey::TLdeserialize, null)

    }

    @Test
    public fun test_InputFileLocation_TL_inputDocumentFileLocation() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputFileLocation.TL_inputDocumentFileLocation::class,
          space.axolab.axogram.tgnet.TLRPC.InputFileLocation::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionChangePhoto() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionChangePhoto::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_InputFileLocation_TL_inputPhotoFileLocation() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputFileLocation.TL_inputPhotoFileLocation::class,
          space.axolab.axogram.tgnet.TLRPC.InputFileLocation::TLdeserialize, null)

    }

    @Test
    public fun test_updates_ChannelDifference_TL_updates_channelDifferenceTooLong() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_updates_ChannelDifference.TL_updates_channelDifferenceTooLong::class,
          space.axolab.axogram.tgnet.TLRPC.updates_ChannelDifference::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateDialogPinned() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateDialogPinned::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updatePinnedDialogs() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updatePinnedDialogs::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Folder_TL_folder() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Folder.TL_folder::class,
          space.axolab.axogram.tgnet.TLRPC.TL_folder::TLdeserialize, null)

    }

    @Test
    public fun test_Dialog_TL_dialogFolder() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Dialog.TL_dialogFolder::class,
          space.axolab.axogram.tgnet.TLRPC.Dialog::TLdeserialize, null)

    }

    @Test
    public fun test_InputDialogPeer_TL_inputDialogPeerFolder() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputDialogPeer.TL_inputDialogPeerFolder::class,
          space.axolab.axogram.tgnet.TLRPC.InputDialogPeer::TLdeserialize, null)

    }

    @Test
    public fun test_DialogPeer_TL_dialogPeerFolder() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DialogPeer.TL_dialogPeerFolder::class,
          space.axolab.axogram.tgnet.TLRPC.DialogPeer::TLdeserialize, null)

    }

    @Test
    public fun test_InputFolderPeer_TL_inputFolderPeer() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputFolderPeer.TL_inputFolderPeer::class,
          space.axolab.axogram.tgnet.TLRPC.TL_inputFolderPeer::TLdeserialize, null)

    }

    @Test
    public fun test_FolderPeer_TL_folderPeer() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_FolderPeer.TL_folderPeer::class,
          space.axolab.axogram.tgnet.TLRPC.TL_folderPeer::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateFolderPeers() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateFolderPeers::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_account_PrivacyRules_TL_account_privacyRules() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_PrivacyRules.TL_account_privacyRules::class,
          space.axolab.axogram.tgnet.tl.TL_account.privacyRules::TLdeserialize, null)

    }

    @Test
    public fun test_InputPrivacyKey_TL_inputPrivacyKeyPhoneNumber() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPrivacyKey.TL_inputPrivacyKeyPhoneNumber::class,
          space.axolab.axogram.tgnet.TLRPC.InputPrivacyKey::TLdeserialize, null)

    }

    @Test
    public fun test_PrivacyKey_TL_privacyKeyPhoneNumber() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PrivacyKey.TL_privacyKeyPhoneNumber::class,
          space.axolab.axogram.tgnet.TLRPC.PrivacyKey::TLdeserialize, null)

    }

    @Test
    public fun test_TopPeerCategory_TL_topPeerCategoryForwardUsers() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_TopPeerCategory.TL_topPeerCategoryForwardUsers::class,
          space.axolab.axogram.tgnet.TLRPC.TopPeerCategory::TLdeserialize, null)

    }

    @Test
    public fun test_TopPeerCategory_TL_topPeerCategoryForwardChats() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_TopPeerCategory.TL_topPeerCategoryForwardChats::class,
          space.axolab.axogram.tgnet.TLRPC.TopPeerCategory::TLdeserialize, null)

    }

    @Test
    public fun test_messages_SearchCounter_TL_messages_searchCounter() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_SearchCounter.TL_messages_searchCounter::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_searchCounter::TLdeserialize, null)

    }

    @Test
    public fun test_UrlAuthResult_TL_urlAuthResultDefault() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UrlAuthResult.TL_urlAuthResultDefault::class,
          space.axolab.axogram.tgnet.TLRPC.UrlAuthResult::TLdeserialize, null)

    }

    @Test
    public fun test_MessageEntity_TL_messageEntityUnderline() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageEntity.TL_messageEntityUnderline::class,
          space.axolab.axogram.tgnet.TLRPC.MessageEntity::TLdeserialize, null)

    }

    @Test
    public fun test_MessageEntity_TL_messageEntityStrike() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageEntity.TL_messageEntityStrike::class,
          space.axolab.axogram.tgnet.TLRPC.MessageEntity::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updatePeerSettings() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updatePeerSettings::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelLocation_TL_channelLocationEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelLocation.TL_channelLocationEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelLocation::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelLocation_TL_channelLocation() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelLocation.TL_channelLocation::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelLocation::TLdeserialize, null)

    }

    @Test
    public fun test_PeerLocated_TL_peerLocated() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PeerLocated.TL_peerLocated::class,
          space.axolab.axogram.tgnet.TLRPC.PeerLocated::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updatePeerLocated() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updatePeerLocated::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionChangeLocation() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionChangeLocation::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_ReportReason_TL_inputReportReasonGeoIrrelevant() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ReportReason.TL_inputReportReasonGeoIrrelevant::class,
          space.axolab.axogram.tgnet.TLRPC.ReportReason::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionToggleSlowMode() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionToggleSlowMode::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_auth_Authorization_TL_auth_authorizationSignUpRequired() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_auth_Authorization.TL_auth_authorizationSignUpRequired::class,
          space.axolab.axogram.tgnet.TLRPC.auth_Authorization::TLdeserialize, null)

    }

    @Test
    public fun test_payments_PaymentResult_TL_payments_paymentVerificationNeeded() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_PaymentResult.TL_payments_paymentVerificationNeeded::class,
          space.axolab.axogram.tgnet.TLRPC.payments_PaymentResult::TLdeserialize, null)

    }

    @Test
    public fun test_InputStickerSet_TL_inputStickerSetAnimatedEmoji() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputStickerSet.TL_inputStickerSetAnimatedEmoji::class,
          space.axolab.axogram.tgnet.TLRPC.InputStickerSet::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateNewScheduledMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateNewScheduledMessage::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_RestrictionReason_TL_restrictionReason() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_RestrictionReason.TL_restrictionReason::class,
          space.axolab.axogram.tgnet.TLRPC.RestrictionReason::TLdeserialize, null)

    }

    @Test
    public fun test_InputTheme_TL_inputTheme() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputTheme.TL_inputTheme::class,
          space.axolab.axogram.tgnet.TLRPC.InputTheme::TLdeserialize, null)

    }

    @Test
    public fun test_InputTheme_TL_inputThemeSlug() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputTheme.TL_inputThemeSlug::class,
          space.axolab.axogram.tgnet.TLRPC.InputTheme::TLdeserialize, null)

    }

    @Test
    public fun test_account_Themes_TL_account_themesNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_Themes.TL_account_themesNotModified::class,
          space.axolab.axogram.tgnet.tl.TL_account.Themes::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateTheme() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateTheme::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_InputPrivacyKey_TL_inputPrivacyKeyAddedByPhone() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPrivacyKey.TL_inputPrivacyKeyAddedByPhone::class,
          space.axolab.axogram.tgnet.TLRPC.InputPrivacyKey::TLdeserialize, null)

    }

    @Test
    public fun test_PrivacyKey_TL_privacyKeyAddedByPhone() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PrivacyKey.TL_privacyKeyAddedByPhone::class,
          space.axolab.axogram.tgnet.TLRPC.PrivacyKey::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateGeoLiveViewed() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateGeoLiveViewed::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateLoginToken() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateLoginToken::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_auth_LoginToken_TL_auth_loginToken() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_auth_LoginToken.TL_auth_loginToken::class,
          space.axolab.axogram.tgnet.TLRPC.auth_LoginToken::TLdeserialize, null)

    }

    @Test
    public fun test_auth_LoginToken_TL_auth_loginTokenMigrateTo() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_auth_LoginToken.TL_auth_loginTokenMigrateTo::class,
          space.axolab.axogram.tgnet.TLRPC.auth_LoginToken::TLdeserialize, null)

    }

    @Test
    public fun test_auth_LoginToken_TL_auth_loginTokenSuccess() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_auth_LoginToken.TL_auth_loginTokenSuccess::class,
          space.axolab.axogram.tgnet.TLRPC.auth_LoginToken::TLdeserialize, null)

    }

    @Test
    public fun test_account_ContentSettings_TL_account_contentSettings() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_ContentSettings.TL_account_contentSettings::class,
          space.axolab.axogram.tgnet.tl.TL_account.contentSettings::TLdeserialize, null)

    }

    @Test
    public fun test_messages_InactiveChats_TL_messages_inactiveChats() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_InactiveChats.TL_messages_inactiveChats::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_inactiveChats::TLdeserialize, null)

    }

    @Test
    public fun test_BaseTheme_TL_baseThemeClassic() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BaseTheme.TL_baseThemeClassic::class,
          space.axolab.axogram.tgnet.TLRPC.BaseTheme::TLdeserialize, null)

    }

    @Test
    public fun test_BaseTheme_TL_baseThemeDay() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BaseTheme.TL_baseThemeDay::class,
          space.axolab.axogram.tgnet.TLRPC.BaseTheme::TLdeserialize, null)

    }

    @Test
    public fun test_BaseTheme_TL_baseThemeNight() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BaseTheme.TL_baseThemeNight::class,
          space.axolab.axogram.tgnet.TLRPC.BaseTheme::TLdeserialize, null)

    }

    @Test
    public fun test_BaseTheme_TL_baseThemeTinted() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BaseTheme.TL_baseThemeTinted::class,
          space.axolab.axogram.tgnet.TLRPC.BaseTheme::TLdeserialize, null)

    }

    @Test
    public fun test_BaseTheme_TL_baseThemeArctic() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BaseTheme.TL_baseThemeArctic::class,
          space.axolab.axogram.tgnet.TLRPC.BaseTheme::TLdeserialize, null)

    }

    @Test
    public fun test_WebPage_TL_webPage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_WebPage.TL_webPage::class,
          space.axolab.axogram.tgnet.TLRPC.WebPage::TLdeserialize, null)

    }

    @Test
    public fun test_WebPageAttribute_TL_webPageAttributeTheme() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_WebPageAttribute.TL_webPageAttributeTheme::class,
          space.axolab.axogram.tgnet.TLRPC.WebPageAttribute::TLdeserialize, null)

    }

    @Test
    public fun test_MessageEntity_TL_messageEntityBankCard() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageEntity.TL_messageEntityBankCard::class,
          space.axolab.axogram.tgnet.TLRPC.MessageEntity::TLdeserialize, null)

    }

    @Test
    public fun test_BankCardOpenUrl_TL_bankCardOpenUrl() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BankCardOpenUrl.TL_bankCardOpenUrl::class,
          space.axolab.axogram.tgnet.TLRPC.TL_bankCardOpenUrl::TLdeserialize, null)

    }

    @Test
    public fun test_payments_BankCardData_TL_payments_bankCardData() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_BankCardData.TL_payments_bankCardData::class,
          space.axolab.axogram.tgnet.TLRPC.TL_payments_bankCardData::TLdeserialize, null)

    }

    @Test
    public fun test_PeerLocated_TL_peerSelfLocated() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PeerLocated.TL_peerSelfLocated::class,
          space.axolab.axogram.tgnet.TLRPC.PeerLocated::TLdeserialize, null)

    }

    @Test
    public fun test_WebPage_TL_webPageNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_WebPage.TL_webPageNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.WebPage::TLdeserialize, null)

    }

    @Test
    public fun test_PhoneCallProtocol_TL_phoneCallProtocol() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PhoneCallProtocol.TL_phoneCallProtocol::class,
          space.axolab.axogram.tgnet.tl.TL_phone.PhoneCallProtocol::TLdeserialize, null)

    }

    @Test
    public fun test_Page_TL_page() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Page.TL_page::class,
          space.axolab.axogram.tgnet.TLRPC.Page::TLdeserialize, null)

    }

    @Test
    public fun test_DialogFilterSuggested_TL_dialogFilterSuggested() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DialogFilterSuggested.TL_dialogFilterSuggested::class,
          space.axolab.axogram.tgnet.TLRPC.TL_dialogFilterSuggested::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateDialogFilter() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateDialogFilter::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateDialogFilterOrder() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateDialogFilterOrder::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateDialogFilters() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateDialogFilters::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_StatsDateRangeDays_TL_statsDateRangeDays() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StatsDateRangeDays.TL_statsDateRangeDays::class,
          space.axolab.axogram.tgnet.tl.TL_stats.TL_statsDateRangeDays::TLdeserialize, null)

    }

    @Test
    public fun test_StatsAbsValueAndPrev_TL_statsAbsValueAndPrev() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StatsAbsValueAndPrev.TL_statsAbsValueAndPrev::class,
          space.axolab.axogram.tgnet.tl.TL_stats.TL_statsAbsValueAndPrev::TLdeserialize, null)

    }

    @Test
    public fun test_StatsPercentValue_TL_statsPercentValue() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StatsPercentValue.TL_statsPercentValue::class,
          space.axolab.axogram.tgnet.tl.TL_stats.TL_statsPercentValue::TLdeserialize, null)

    }

    @Test
    public fun test_StatsGraph_TL_statsGraphAsync() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StatsGraph.TL_statsGraphAsync::class,
          space.axolab.axogram.tgnet.tl.TL_stats.StatsGraph::TLdeserialize, null)

    }

    @Test
    public fun test_StatsGraph_TL_statsGraphError() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StatsGraph.TL_statsGraphError::class,
          space.axolab.axogram.tgnet.tl.TL_stats.StatsGraph::TLdeserialize, null)

    }

    @Test
    public fun test_StatsGraph_TL_statsGraph() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StatsGraph.TL_statsGraph::class,
          space.axolab.axogram.tgnet.tl.TL_stats.StatsGraph::TLdeserialize, null)

    }

    @Test
    public fun test_messages_FeaturedStickers_TL_messages_featuredStickersNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_FeaturedStickers.TL_messages_featuredStickersNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.messages_FeaturedStickers::TLdeserialize, null)

    }

    @Test
    public fun test_InputMedia_TL_inputMediaDice() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputMedia.TL_inputMediaDice::class,
          space.axolab.axogram.tgnet.TLRPC.InputMedia::TLdeserialize, null)

    }

    @Test
    public fun test_InputStickerSet_TL_inputStickerSetDice() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputStickerSet.TL_inputStickerSetDice::class,
          space.axolab.axogram.tgnet.TLRPC.InputStickerSet::TLdeserialize, null)

    }

    @Test
    public fun test_help_PromoData_TL_help_promoDataEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_help_PromoData.TL_help_promoDataEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.help_PromoData::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updatePhoneCallSignalingData() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updatePhoneCallSignalingData::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_ChatInvite_TL_chatInvitePeek() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatInvite.TL_chatInvitePeek::class,
          space.axolab.axogram.tgnet.TLRPC.ChatInvite::TLdeserialize, null)

    }

    @Test
    public fun test_Photo_TL_photo() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Photo.TL_photo::class,
          space.axolab.axogram.tgnet.TLRPC.Photo::TLdeserialize, null)

    }

    @Test
    public fun test_stats_MegagroupStats_TL_stats_megagroupStats() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_stats_MegagroupStats.TL_stats_megagroupStats::class,
          space.axolab.axogram.tgnet.tl.TL_stats.TL_megagroupStats::TLdeserialize, null)

    }

    @Test
    public fun test_PhoneConnection_TL_phoneConnectionWebrtc() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PhoneConnection.TL_phoneConnectionWebrtc::class,
          space.axolab.axogram.tgnet.TLRPC.PhoneConnection::TLdeserialize, null)

    }

    @Test
    public fun test_help_CountryCode_TL_help_countryCode() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_help_CountryCode.TL_help_countryCode::class,
          space.axolab.axogram.tgnet.TLRPC.TL_help_countryCode::TLdeserialize, null)

    }

    @Test
    public fun test_help_Country_TL_help_country() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_help_Country.TL_help_country::class,
          space.axolab.axogram.tgnet.TLRPC.TL_help_country::TLdeserialize, null)

    }

    @Test
    public fun test_help_CountriesList_TL_help_countriesListNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_help_CountriesList.TL_help_countriesListNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.help_CountriesList::TLdeserialize, null)

    }

    @Test
    public fun test_help_CountriesList_TL_help_countriesList() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_help_CountriesList.TL_help_countriesList::class,
          space.axolab.axogram.tgnet.TLRPC.help_CountriesList::TLdeserialize, null)

    }

    @Test
    public fun test_contacts_Blocked_TL_contacts_blocked() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_contacts_Blocked.TL_contacts_blocked::class,
          space.axolab.axogram.tgnet.TLRPC.contacts_Blocked::TLdeserialize, null)

    }

    @Test
    public fun test_contacts_Blocked_TL_contacts_blockedSlice() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_contacts_Blocked.TL_contacts_blockedSlice::class,
          space.axolab.axogram.tgnet.TLRPC.contacts_Blocked::TLdeserialize, null)

    }

    @Test
    public fun test_MessageViews_TL_messageViews() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageViews.TL_messageViews::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messageViews::TLdeserialize, null)

    }

    @Test
    public fun test_messages_MessageViews_TL_messages_messageViews() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_MessageViews.TL_messages_messageViews::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_messageViews::TLdeserialize, null)

    }

    @Test
    public fun test_PeerBlocked_TL_peerBlocked() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PeerBlocked.TL_peerBlocked::class,
          space.axolab.axogram.tgnet.TLRPC.TL_peerBlocked::TLdeserialize, null)

    }

    @Test
    public fun test_InputGeoPoint_TL_inputGeoPoint() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputGeoPoint.TL_inputGeoPoint::class,
          space.axolab.axogram.tgnet.TLRPC.InputGeoPoint::TLdeserialize, null)

    }

    @Test
    public fun test_GeoPoint_TL_geoPoint() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_GeoPoint.TL_geoPoint::class,
          space.axolab.axogram.tgnet.TLRPC.GeoPoint::TLdeserialize, null)

    }

    @Test
    public fun test_BotInlineMessage_TL_botInlineMessageMediaGeo() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BotInlineMessage.TL_botInlineMessageMediaGeo::class,
          space.axolab.axogram.tgnet.TLRPC.BotInlineMessage::TLdeserialize, null)

    }

    @Test
    public fun test_InputMedia_TL_inputMediaGeoLive() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputMedia.TL_inputMediaGeoLive::class,
          space.axolab.axogram.tgnet.TLRPC.InputMedia::TLdeserialize, null)

    }

    @Test
    public fun test_MessageMedia_TL_messageMediaGeoLive() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaGeoLive::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelParticipantsFilter_TL_channelParticipantsMentions() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelParticipantsFilter.TL_channelParticipantsMentions::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelParticipantsFilter::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updatePinnedMessages() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updatePinnedMessages::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_MessagesFilter_TL_inputMessagesFilterPinned() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessagesFilter.TL_inputMessagesFilterPinned::class,
          space.axolab.axogram.tgnet.TLRPC.MessagesFilter::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionGeoProximityReached() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionGeoProximityReached::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_PhotoSize_TL_photoPathSize() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PhotoSize.TL_photoPathSize::class,
          space.axolab.axogram.tgnet.TLRPC.PhotoSize::TLdeserialize, null)

    }

    @Test
    public fun test_SendMessageAction_TL_speakingInGroupCallAction() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SendMessageAction.TL_speakingInGroupCallAction::class,
          space.axolab.axogram.tgnet.TLRPC.SendMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_GroupCall_TL_groupCallDiscarded() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_GroupCall.TL_groupCallDiscarded::class,
          space.axolab.axogram.tgnet.TLRPC.GroupCall::TLdeserialize, null)

    }

    @Test
    public fun test_InputGroupCall_TL_inputGroupCall() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputGroupCall.TL_inputGroupCall::class,
          space.axolab.axogram.tgnet.TLRPC.InputGroupCall::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionGroupCall() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionGroupCall::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateGroupCallParticipants() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateGroupCallParticipants::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_InlineQueryPeerType_TL_inlineQueryPeerTypeSameBotPM() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InlineQueryPeerType.TL_inlineQueryPeerTypeSameBotPM::class,
          space.axolab.axogram.tgnet.TLRPC.InlineQueryPeerType::TLdeserialize, null)

    }

    @Test
    public fun test_InlineQueryPeerType_TL_inlineQueryPeerTypePM() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InlineQueryPeerType.TL_inlineQueryPeerTypePM::class,
          space.axolab.axogram.tgnet.TLRPC.InlineQueryPeerType::TLdeserialize, null)

    }

    @Test
    public fun test_InlineQueryPeerType_TL_inlineQueryPeerTypeChat() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InlineQueryPeerType.TL_inlineQueryPeerTypeChat::class,
          space.axolab.axogram.tgnet.TLRPC.InlineQueryPeerType::TLdeserialize, null)

    }

    @Test
    public fun test_InlineQueryPeerType_TL_inlineQueryPeerTypeMegagroup() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InlineQueryPeerType.TL_inlineQueryPeerTypeMegagroup::class,
          space.axolab.axogram.tgnet.TLRPC.InlineQueryPeerType::TLdeserialize, null)

    }

    @Test
    public fun test_InlineQueryPeerType_TL_inlineQueryPeerTypeBroadcast() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InlineQueryPeerType.TL_inlineQueryPeerTypeBroadcast::class,
          space.axolab.axogram.tgnet.TLRPC.InlineQueryPeerType::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionStartGroupCall() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionStartGroupCall::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionDiscardGroupCall() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionDiscardGroupCall::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionParticipantMute() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionParticipantMute::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionParticipantUnmute() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionParticipantUnmute::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public
        fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionToggleGroupCallSetting() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionToggleGroupCallSetting::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_Message_TL_messageEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_messageEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, null)

    }

    @Test
    public fun test_EncryptedChat_TL_encryptedChatDiscarded() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_EncryptedChat.TL_encryptedChatDiscarded::class,
          space.axolab.axogram.tgnet.TLRPC.EncryptedChat::TLdeserialize, null)

    }

    @Test
    public fun test_InputPaymentCredentials_TL_inputPaymentCredentialsGooglePay() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPaymentCredentials.TL_inputPaymentCredentialsGooglePay::class,
          space.axolab.axogram.tgnet.TLRPC.InputPaymentCredentials::TLdeserialize, null)

    }

    @Test
    public fun test_messages_HistoryImport_TL_messages_historyImport() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_HistoryImport.TL_messages_historyImport::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_historyImport::TLdeserialize, null)

    }

    @Test
    public fun test_SendMessageAction_TL_sendMessageHistoryImportAction() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SendMessageAction.TL_sendMessageHistoryImportAction::class,
          space.axolab.axogram.tgnet.TLRPC.SendMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_messages_HistoryImportParsed_TL_messages_historyImportParsed() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_HistoryImportParsed.TL_messages_historyImportParsed::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_historyImportParsed::TLdeserialize, null)

    }

    @Test
    public fun test_ReportReason_TL_inputReportReasonFake() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ReportReason.TL_inputReportReasonFake::class,
          space.axolab.axogram.tgnet.TLRPC.ReportReason::TLdeserialize, null)

    }

    @Test
    public fun test_messages_AffectedFoundMessages_TL_messages_affectedFoundMessages() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_AffectedFoundMessages.TL_messages_affectedFoundMessages::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_affectedFoundMessages::TLdeserialize, null)

    }

    @Test
    public fun test_ReportReason_TL_inputReportReasonOther() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ReportReason.TL_inputReportReasonOther::class,
          space.axolab.axogram.tgnet.TLRPC.ReportReason::TLdeserialize, null)

    }

    @Test
    public fun test_Updates_TL_updateShortSentMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Updates.TL_updateShortSentMessage::class,
          space.axolab.axogram.tgnet.TLRPC.Updates::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updatePeerHistoryTTL() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updatePeerHistoryTTL::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_messages_ExportedChatInvites_TL_messages_exportedChatInvites() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_ExportedChatInvites.TL_messages_exportedChatInvites::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_exportedChatInvites::TLdeserialize, null)

    }

    @Test
    public fun test_messages_ExportedChatInvite_TL_messages_exportedChatInvite() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_ExportedChatInvite.TL_messages_exportedChatInvite::class,
          space.axolab.axogram.tgnet.TLRPC.messages_ExportedChatInvite::TLdeserialize, null)

    }

    @Test
    public fun test_messages_ExportedChatInvite_TL_messages_exportedChatInviteReplaced() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_ExportedChatInvite.TL_messages_exportedChatInviteReplaced::class,
          space.axolab.axogram.tgnet.TLRPC.messages_ExportedChatInvite::TLdeserialize, null)

    }

    @Test
    public fun test_messages_ChatInviteImporters_TL_messages_chatInviteImporters() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_ChatInviteImporters.TL_messages_chatInviteImporters::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_chatInviteImporters::TLdeserialize, null)

    }

    @Test
    public fun test_messages_ChatAdminsWithInvites_TL_messages_chatAdminsWithInvites() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_ChatAdminsWithInvites.TL_messages_chatAdminsWithInvites::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_chatAdminsWithInvites::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionExportedInviteDelete() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionExportedInviteDelete::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionExportedInviteRevoke() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionExportedInviteRevoke::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionExportedInviteEdit() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionExportedInviteEdit::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionParticipantVolume() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionParticipantVolume::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionChangeHistoryTTL() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionChangeHistoryTTL::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_messages_CheckedHistoryImportPeer_TL_messages_checkedHistoryImportPeer() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_CheckedHistoryImportPeer.TL_messages_checkedHistoryImportPeer::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_checkedHistoryImportPeer::TLdeserialize,
          null)

    }

    @Test
    public fun test_phone_GroupCall_TL_phone_groupCall() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_phone_GroupCall.TL_phone_groupCall::class,
          space.axolab.axogram.tgnet.tl.TL_phone.groupCall::TLdeserialize, null)

    }

    @Test
    public fun test_phone_GroupParticipants_TL_phone_groupParticipants() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_phone_GroupParticipants.TL_phone_groupParticipants::class,
          space.axolab.axogram.tgnet.tl.TL_phone.groupParticipants::TLdeserialize, null)

    }

    @Test
    public fun test_phone_JoinAsPeers_TL_phone_joinAsPeers() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_phone_JoinAsPeers.TL_phone_joinAsPeers::class,
          space.axolab.axogram.tgnet.tl.TL_phone.joinAsPeers::TLdeserialize, null)

    }

    @Test
    public fun test_phone_ExportedGroupCallInvite_TL_phone_exportedGroupCallInvite() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_phone_ExportedGroupCallInvite.TL_phone_exportedGroupCallInvite::class,
          space.axolab.axogram.tgnet.tl.TL_phone.exportedGroupCallInvite::TLdeserialize, null)

    }

    @Test
    public fun test_channels_ChannelParticipants_TL_channels_channelParticipants() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_channels_ChannelParticipants.TL_channels_channelParticipants::class,
          space.axolab.axogram.tgnet.TLRPC.channels_ChannelParticipants::TLdeserialize, null)

    }

    @Test
    public fun test_channels_ChannelParticipant_TL_channels_channelParticipant() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_channels_ChannelParticipant.TL_channels_channelParticipant::class,
          space.axolab.axogram.tgnet.TLRPC.TL_channels_channelParticipant::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelParticipant_TL_channelParticipantLeft() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelParticipant.TL_channelParticipantLeft::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelParticipant::TLdeserialize, null)

    }

    @Test
    public fun test_BotInlineMessage_TL_botInlineMessageMediaInvoice() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BotInlineMessage.TL_botInlineMessageMediaInvoice::class,
          space.axolab.axogram.tgnet.TLRPC.BotInlineMessage::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionGroupCallScheduled() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionGroupCallScheduled::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_UserProfilePhoto_TL_userProfilePhoto() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserProfilePhoto.TL_userProfilePhoto::class,
          space.axolab.axogram.tgnet.TLRPC.UserProfilePhoto::TLdeserialize, null)

    }

    @Test
    public fun test_ChatPhoto_TL_chatPhoto() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatPhoto.TL_chatPhoto::class,
          space.axolab.axogram.tgnet.TLRPC.ChatPhoto::TLdeserialize, null)

    }

    @Test
    public fun test_PhotoSize_TL_photoSize() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PhotoSize.TL_photoSize::class,
          space.axolab.axogram.tgnet.TLRPC.PhotoSize::TLdeserialize, null)

    }

    @Test
    public fun test_PhotoSize_TL_photoCachedSize() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PhotoSize.TL_photoCachedSize::class,
          space.axolab.axogram.tgnet.TLRPC.PhotoSize::TLdeserialize, null)

    }

    @Test
    public fun test_InputFileLocation_TL_inputPeerPhotoFileLocation() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputFileLocation.TL_inputPeerPhotoFileLocation::class,
          space.axolab.axogram.tgnet.TLRPC.InputFileLocation::TLdeserialize, null)

    }

    @Test
    public fun test_InputFileLocation_TL_inputStickerSetThumb() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputFileLocation.TL_inputStickerSetThumb::class,
          space.axolab.axogram.tgnet.TLRPC.InputFileLocation::TLdeserialize, null)

    }

    @Test
    public fun test_VideoSize_TL_videoSize() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_VideoSize.TL_videoSize::class,
          space.axolab.axogram.tgnet.TLRPC.VideoSize::TLdeserialize, null)

    }

    @Test
    public fun test_PhotoSize_TL_photoSizeProgressive() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PhotoSize.TL_photoSizeProgressive::class,
          space.axolab.axogram.tgnet.TLRPC.PhotoSize::TLdeserialize, null)

    }

    @Test
    public fun test_help_AppUpdate_TL_help_appUpdate() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_help_AppUpdate.TL_help_appUpdate::class,
          space.axolab.axogram.tgnet.TLRPC.help_AppUpdate::TLdeserialize, null)

    }

    @Test
    public fun test_InputWallPaper_TL_inputWallPaperNoFile() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputWallPaper.TL_inputWallPaperNoFile::class,
          space.axolab.axogram.tgnet.TLRPC.InputWallPaper::TLdeserialize, null)

    }

    @Test
    public fun test_WallPaper_TL_wallPaperNoFile() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_WallPaper.TL_wallPaperNoFile::class,
          space.axolab.axogram.tgnet.TLRPC.WallPaper::TLdeserialize, null)

    }

    @Test
    public fun test_GroupCallParticipantVideoSourceGroup_TL_groupCallParticipantVideoSourceGroup() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_GroupCallParticipantVideoSourceGroup.TL_groupCallParticipantVideoSourceGroup::class,
          space.axolab.axogram.tgnet.TLRPC.TL_groupCallParticipantVideoSourceGroup::TLdeserialize,
          null)

    }

    @Test
    public fun test_Update_TL_updateGroupCallConnection() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateGroupCallConnection::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_stickers_SuggestedShortName_TL_stickers_suggestedShortName() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_stickers_SuggestedShortName.TL_stickers_suggestedShortName::class,
          space.axolab.axogram.tgnet.TLRPC.TL_stickers_suggestedShortName::TLdeserialize, null)

    }

    @Test
    public fun test_ReplyMarkup_TL_replyKeyboardForceReply() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ReplyMarkup.TL_replyKeyboardForceReply::class,
          space.axolab.axogram.tgnet.TLRPC.ReplyMarkup::TLdeserialize, null)

    }

    @Test
    public fun test_ReplyMarkup_TL_replyKeyboardMarkup() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ReplyMarkup.TL_replyKeyboardMarkup::class,
          space.axolab.axogram.tgnet.TLRPC.ReplyMarkup::TLdeserialize, null)

    }

    @Test
    public fun test_GroupCallParticipantVideo_TL_groupCallParticipantVideo() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_GroupCallParticipantVideo.TL_groupCallParticipantVideo::class,
          space.axolab.axogram.tgnet.TLRPC.TL_groupCallParticipantVideo::TLdeserialize, null)

    }

    @Test
    public fun test_account_ResetPasswordResult_TL_account_resetPasswordFailedWait() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_ResetPasswordResult.TL_account_resetPasswordFailedWait::class,
          space.axolab.axogram.tgnet.tl.TL_account.ResetPasswordResult::TLdeserialize, null)

    }

    @Test
    public fun test_account_ResetPasswordResult_TL_account_resetPasswordRequestedWait() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_ResetPasswordResult.TL_account_resetPasswordRequestedWait::class,
          space.axolab.axogram.tgnet.tl.TL_account.ResetPasswordResult::TLdeserialize, null)

    }

    @Test
    public fun test_account_ResetPasswordResult_TL_account_resetPasswordOk() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_ResetPasswordResult.TL_account_resetPasswordOk::class,
          space.axolab.axogram.tgnet.tl.TL_account.ResetPasswordResult::TLdeserialize, null)

    }

    @Test
    public fun test_messages_DiscussionMessage_TL_messages_discussionMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_DiscussionMessage.TL_messages_discussionMessage::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_discussionMessage::TLdeserialize, null)

    }

    @Test
    public fun test_InputFileLocation_TL_inputGroupCallStream() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputFileLocation.TL_inputGroupCallStream::class,
          space.axolab.axogram.tgnet.TLRPC.InputFileLocation::TLdeserialize, null)

    }

    @Test
    public fun test_account_ChatThemes_TL_account_chatThemesNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_ChatThemes.TL_account_chatThemesNotModified::class,
          space.axolab.axogram.tgnet.tl.TL_account.ChatThemes::TLdeserialize, null)

    }

    @Test
    public fun test_SendMessageAction_TL_sendMessageChooseStickerAction() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SendMessageAction.TL_sendMessageChooseStickerAction::class,
          space.axolab.axogram.tgnet.TLRPC.SendMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_InputPeer_TL_inputPeerChat() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPeer.TL_inputPeerChat::class,
          space.axolab.axogram.tgnet.TLRPC.InputPeer::TLdeserialize, null)

    }

    @Test
    public fun test_Peer_TL_peerUser() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Peer.TL_peerUser::class,
          space.axolab.axogram.tgnet.TLRPC.Peer::TLdeserialize, null)

    }

    @Test
    public fun test_Peer_TL_peerChat() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Peer.TL_peerChat::class,
          space.axolab.axogram.tgnet.TLRPC.Peer::TLdeserialize, null)

    }

    @Test
    public fun test_User_TL_userEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_User.TL_userEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.User::TLdeserialize, null)

    }

    @Test
    public fun test_Chat_TL_chatEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_chatEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, null)

    }

    @Test
    public fun test_Chat_TL_chat() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_chat::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, null)

    }

    @Test
    public fun test_Chat_TL_chatForbidden() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_chatForbidden::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, null)

    }

    @Test
    public fun test_ChatParticipants_TL_chatParticipantsForbidden() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatParticipants.TL_chatParticipantsForbidden::class,
          space.axolab.axogram.tgnet.TLRPC.ChatParticipants::TLdeserialize, null)

    }

    @Test
    public fun test_ChatParticipants_TL_chatParticipants() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatParticipants.TL_chatParticipants::class,
          space.axolab.axogram.tgnet.TLRPC.ChatParticipants::TLdeserialize, null)

    }

    @Test
    public fun test_MessageMedia_TL_messageMediaContact() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaContact::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionChatCreate() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionChatCreate::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionChatAddUser() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionChatAddUser::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionChatDeleteUser() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionChatDeleteUser::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_auth_ExportedAuthorization_TL_auth_exportedAuthorization() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_auth_ExportedAuthorization.TL_auth_exportedAuthorization::class,
          space.axolab.axogram.tgnet.TLRPC.TL_auth_exportedAuthorization::TLdeserialize, null)

    }

    @Test
    public fun test_Contact_TL_contact() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Contact.TL_contact::class,
          space.axolab.axogram.tgnet.TLRPC.TL_contact::TLdeserialize, null)

    }

    @Test
    public fun test_ImportedContact_TL_importedContact() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ImportedContact.TL_importedContact::class,
          space.axolab.axogram.tgnet.TLRPC.TL_importedContact::TLdeserialize, null)

    }

    @Test
    public fun test_ContactStatus_TL_contactStatus() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ContactStatus.TL_contactStatus::class,
          space.axolab.axogram.tgnet.TLRPC.TL_contactStatus::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateChatUserTyping() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateChatUserTyping::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateUserStatus() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateUserStatus::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Updates_TL_updateShortMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Updates.TL_updateShortMessage::class,
          space.axolab.axogram.tgnet.TLRPC.Updates::TLdeserialize, null)

    }

    @Test
    public fun test_Updates_TL_updateShortChatMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Updates.TL_updateShortChatMessage::class,
          space.axolab.axogram.tgnet.TLRPC.Updates::TLdeserialize, null)

    }

    @Test
    public fun test_EncryptedChat_TL_encryptedChatWaiting() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_EncryptedChat.TL_encryptedChatWaiting::class,
          space.axolab.axogram.tgnet.TLRPC.EncryptedChat::TLdeserialize, null)

    }

    @Test
    public fun test_EncryptedChat_TL_encryptedChatRequested() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_EncryptedChat.TL_encryptedChatRequested::class,
          space.axolab.axogram.tgnet.TLRPC.EncryptedChat::TLdeserialize, null)

    }

    @Test
    public fun test_EncryptedChat_TL_encryptedChat() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_EncryptedChat.TL_encryptedChat::class,
          space.axolab.axogram.tgnet.TLRPC.EncryptedChat::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateChatParticipantAdd() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateChatParticipantAdd::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateChatParticipantDelete() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateChatParticipantDelete::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_PrivacyRule_TL_privacyValueAllowUsers() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PrivacyRule.TL_privacyValueAllowUsers::class,
          space.axolab.axogram.tgnet.TLRPC.PrivacyRule::TLdeserialize, null)

    }

    @Test
    public fun test_PrivacyRule_TL_privacyValueDisallowUsers() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PrivacyRule.TL_privacyValueDisallowUsers::class,
          space.axolab.axogram.tgnet.TLRPC.PrivacyRule::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateUserPhone() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateUserPhone::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_messages_Stickers_TL_messages_stickers() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_Stickers.TL_messages_stickers::class,
          space.axolab.axogram.tgnet.TLRPC.messages_Stickers::TLdeserialize, null)

    }

    @Test
    public fun test_messages_AllStickers_TL_messages_allStickers() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_AllStickers.TL_messages_allStickers::class,
          space.axolab.axogram.tgnet.TLRPC.messages_AllStickers::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionChatJoinedByLink() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionChatJoinedByLink::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_InputPeer_TL_inputPeerUser() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPeer.TL_inputPeerUser::class,
          space.axolab.axogram.tgnet.TLRPC.InputPeer::TLdeserialize, null)

    }

    @Test
    public fun test_InputUser_TL_inputUser() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputUser.TL_inputUser::class,
          space.axolab.axogram.tgnet.TLRPC.InputUser::TLdeserialize, null)

    }

    @Test
    public fun test_InputChannel_TL_inputChannel() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputChannel.TL_inputChannel::class,
          space.axolab.axogram.tgnet.TLRPC.InputChannel::TLdeserialize, null)

    }

    @Test
    public fun test_Peer_TL_peerChannel() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Peer.TL_peerChannel::class,
          space.axolab.axogram.tgnet.TLRPC.Peer::TLdeserialize, null)

    }

    @Test
    public fun test_InputPeer_TL_inputPeerChannel() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPeer.TL_inputPeerChannel::class,
          space.axolab.axogram.tgnet.TLRPC.InputPeer::TLdeserialize, null)

    }

    @Test
    public fun test_Chat_TL_channelForbidden() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_channelForbidden::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateChannelTooLong() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateChannelTooLong::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateChannel() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateChannel::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateReadChannelInbox() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateReadChannelInbox::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateDeleteChannelMessages() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateDeleteChannelMessages::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateChannelMessageViews() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateChannelMessageViews::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelParticipant_TL_channelParticipantCreator() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelParticipant.TL_channelParticipantCreator::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelParticipant::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateChatParticipantAdmin() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateChatParticipantAdmin::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionChatMigrateTo() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionChatMigrateTo::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionChannelMigrateFrom() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionChannelMigrateFrom::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_messages_SavedGifs_TL_messages_savedGifs() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_SavedGifs.TL_messages_savedGifs::class,
          space.axolab.axogram.tgnet.TLRPC.messages_SavedGifs::TLdeserialize, null)

    }

    @Test
    public fun test_MessageEntity_TL_messageEntityMentionName() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageEntity.TL_messageEntityMentionName::class,
          space.axolab.axogram.tgnet.TLRPC.MessageEntity::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateReadChannelOutbox() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateReadChannelOutbox::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_messages_RecentStickers_TL_messages_recentStickers() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_RecentStickers.TL_messages_recentStickers::class,
          space.axolab.axogram.tgnet.TLRPC.messages_RecentStickers::TLdeserialize, null)

    }

    @Test
    public fun test_HighScore_TL_highScore() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_HighScore.TL_highScore::class,
          space.axolab.axogram.tgnet.TLRPC.TL_highScore::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateChannelWebPage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateChannelWebPage::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_payments_PaymentReceipt_TL_payments_paymentReceipt() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_PaymentReceipt.TL_payments_paymentReceipt::class,
          space.axolab.axogram.tgnet.TLRPC.PaymentReceipt::TLdeserialize, null)

    }

    @Test
    public fun test_PhoneCall_TL_phoneCallWaiting() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PhoneCall.TL_phoneCallWaiting::class,
          space.axolab.axogram.tgnet.tl.TL_phone.PhoneCall::TLdeserialize, null)

    }

    @Test
    public fun test_PhoneCall_TL_phoneCallRequested() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PhoneCall.TL_phoneCallRequested::class,
          space.axolab.axogram.tgnet.tl.TL_phone.PhoneCall::TLdeserialize, null)

    }

    @Test
    public fun test_PhoneCall_TL_phoneCallAccepted() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PhoneCall.TL_phoneCallAccepted::class,
          space.axolab.axogram.tgnet.tl.TL_phone.PhoneCall::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelParticipant_TL_channelParticipantAdmin() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelParticipant.TL_channelParticipantAdmin::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelParticipant::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEvent_TL_channelAdminLogEvent() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEvent.TL_channelAdminLogEvent::class,
          space.axolab.axogram.tgnet.TLRPC.TL_channelAdminLogEvent::TLdeserialize, null)

    }

    @Test
    public fun test_messages_FavedStickers_TL_messages_favedStickers() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_FavedStickers.TL_messages_favedStickers::class,
          space.axolab.axogram.tgnet.TLRPC.messages_FavedStickers::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateChannelAvailableMessages() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateChannelAvailableMessages::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_RecentMeUrl_TL_recentMeUrlUser() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_RecentMeUrl.TL_recentMeUrlUser::class,
          space.axolab.axogram.tgnet.TLRPC.RecentMeUrl::TLdeserialize, null)

    }

    @Test
    public fun test_RecentMeUrl_TL_recentMeUrlChat() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_RecentMeUrl.TL_recentMeUrlChat::class,
          space.axolab.axogram.tgnet.TLRPC.RecentMeUrl::TLdeserialize, null)

    }

    @Test
    public fun test_WebAuthorization_TL_webAuthorization() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_WebAuthorization.TL_webAuthorization::class,
          space.axolab.axogram.tgnet.TLRPC.TL_webAuthorization::TLdeserialize, null)

    }

    @Test
    public fun test_messages_FoundStickerSets_TL_messages_foundStickerSets() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_FoundStickerSets.TL_messages_foundStickerSets::class,
          space.axolab.axogram.tgnet.TLRPC.messages_FoundStickerSets::TLdeserialize, null)

    }

    @Test
    public fun test_account_WallPapers_TL_account_wallPapers() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_WallPapers.TL_account_wallPapers::class,
          space.axolab.axogram.tgnet.tl.TL_account.WallPapers::TLdeserialize, null)

    }

    @Test
    public fun test_InputUser_TL_inputUserFromMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputUser.TL_inputUserFromMessage::class,
          space.axolab.axogram.tgnet.TLRPC.InputUser::TLdeserialize, null)

    }

    @Test
    public fun test_InputChannel_TL_inputChannelFromMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputChannel.TL_inputChannelFromMessage::class,
          space.axolab.axogram.tgnet.TLRPC.InputChannel::TLdeserialize, null)

    }

    @Test
    public fun test_InputPeer_TL_inputPeerUserFromMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPeer.TL_inputPeerUserFromMessage::class,
          space.axolab.axogram.tgnet.TLRPC.InputPeer::TLdeserialize, null)

    }

    @Test
    public fun test_InputPeer_TL_inputPeerChannelFromMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPeer.TL_inputPeerChannelFromMessage::class,
          space.axolab.axogram.tgnet.TLRPC.InputPeer::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionChangeLinkedChat() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionChangeLinkedChat::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_InputPrivacyRule_TL_inputPrivacyValueAllowChatParticipants() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPrivacyRule.TL_inputPrivacyValueAllowChatParticipants::class,
          space.axolab.axogram.tgnet.TLRPC.InputPrivacyRule::TLdeserialize, null)

    }

    @Test
    public fun test_InputPrivacyRule_TL_inputPrivacyValueDisallowChatParticipants() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPrivacyRule.TL_inputPrivacyValueDisallowChatParticipants::class,
          space.axolab.axogram.tgnet.TLRPC.InputPrivacyRule::TLdeserialize, null)

    }

    @Test
    public fun test_PrivacyRule_TL_privacyValueAllowChatParticipants() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PrivacyRule.TL_privacyValueAllowChatParticipants::class,
          space.axolab.axogram.tgnet.TLRPC.PrivacyRule::TLdeserialize, null)

    }

    @Test
    public fun test_PrivacyRule_TL_privacyValueDisallowChatParticipants() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PrivacyRule.TL_privacyValueDisallowChatParticipants::class,
          space.axolab.axogram.tgnet.TLRPC.PrivacyRule::TLdeserialize, null)

    }

    @Test
    public fun test_account_Themes_TL_account_themes() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_Themes.TL_account_themes::class,
          space.axolab.axogram.tgnet.tl.TL_account.Themes::TLdeserialize, null)

    }

    @Test
    public fun test_InputThemeSettings_TL_inputThemeSettings() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputThemeSettings.TL_inputThemeSettings::class,
          space.axolab.axogram.tgnet.TLRPC.TL_inputThemeSettings::TLdeserialize, null)

    }

    @Test
    public fun test_ThemeSettings_TL_themeSettings() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ThemeSettings.TL_themeSettings::class,
          space.axolab.axogram.tgnet.TLRPC.ThemeSettings::TLdeserialize, null)
          test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ThemeSettings.TL_themeSettings::class,
              space.axolab.axogram.tgnet.TLRPC.TL_themeSettings::TLdeserialize, null)

    }

    @Test
    public fun test_StatsGroupTopPoster_TL_statsGroupTopPoster() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StatsGroupTopPoster.TL_statsGroupTopPoster::class,
          space.axolab.axogram.tgnet.tl.TL_stats.TL_statsGroupTopPoster::TLdeserialize, null)

    }

    @Test
    public fun test_StatsGroupTopAdmin_TL_statsGroupTopAdmin() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StatsGroupTopAdmin.TL_statsGroupTopAdmin::class,
          space.axolab.axogram.tgnet.tl.TL_stats.TL_statsGroupTopAdmin::TLdeserialize, null)

    }

    @Test
    public fun test_StatsGroupTopInviter_TL_statsGroupTopInviter() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StatsGroupTopInviter.TL_statsGroupTopInviter::class,
          space.axolab.axogram.tgnet.tl.TL_stats.TL_statsGroupTopInviter::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateChannelMessageForwards() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateChannelMessageForwards::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateReadChannelDiscussionInbox() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateReadChannelDiscussionInbox::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateReadChannelDiscussionOutbox() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateReadChannelDiscussionOutbox::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_MessageReplies_TL_messageReplies() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageReplies.TL_messageReplies::class,
          space.axolab.axogram.tgnet.TLRPC.MessageReplies::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateChannelUserTyping() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateChannelUserTyping::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updatePinnedChannelMessages() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updatePinnedChannelMessages::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionInviteToGroupCall() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionInviteToGroupCall::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateChat() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateChat::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateChannelParticipant() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateChannelParticipant::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_ChatAdminWithInvites_TL_chatAdminWithInvites() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatAdminWithInvites.TL_chatAdminWithInvites::class,
          space.axolab.axogram.tgnet.TLRPC.TL_chatAdminWithInvites::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateBotCommands() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateBotCommands::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_SendMessageAction_TL_sendMessageEmojiInteraction() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SendMessageAction.TL_sendMessageEmojiInteraction::class,
          space.axolab.axogram.tgnet.TLRPC.SendMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_SendMessageAction_TL_sendMessageEmojiInteractionSeen() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SendMessageAction.TL_sendMessageEmojiInteractionSeen::class,
          space.axolab.axogram.tgnet.TLRPC.SendMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_Theme_TL_theme() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Theme.TL_theme::class,
          space.axolab.axogram.tgnet.TLRPC.Theme::TLdeserialize, null)

    }

    @Test
    public fun test_ChatInviteImporter_TL_chatInviteImporter() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatInviteImporter.TL_chatInviteImporter::class,
          space.axolab.axogram.tgnet.TLRPC.TL_chatInviteImporter::TLdeserialize, null)

    }

    @Test
    public fun test_SearchResultsCalendarPeriod_TL_searchResultsCalendarPeriod() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SearchResultsCalendarPeriod.TL_searchResultsCalendarPeriod::class,
          space.axolab.axogram.tgnet.TLRPC.TL_searchResultsCalendarPeriod::TLdeserialize, null)

    }

    @Test
    public fun test_messages_SearchResultsCalendar_TL_messages_searchResultsCalendar() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_SearchResultsCalendar.TL_messages_searchResultsCalendar::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_searchResultsCalendar::TLdeserialize, null)

    }

    @Test
    public fun test_SearchResultsPosition_TL_searchResultPosition() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SearchResultsPosition.TL_searchResultPosition::class,
          space.axolab.axogram.tgnet.TLRPC.TL_searchResultPosition::TLdeserialize, null)

    }

    @Test
    public fun test_messages_SearchResultsPositions_TL_messages_searchResultsPositions() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_SearchResultsPositions.TL_messages_searchResultsPositions::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_searchResultsPositions::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionChatJoinedByRequest() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionChatJoinedByRequest::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updatePendingJoinRequests() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updatePendingJoinRequests::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public
        fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionParticipantJoinByRequest() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionParticipantJoinByRequest::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_account_Authorizations_TL_account_authorizations() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_Authorizations.TL_account_authorizations::class,
          space.axolab.axogram.tgnet.tl.TL_account.authorizations::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionToggleNoForwards() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionToggleNoForwards::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_messages_StickerSet_TL_messages_stickerSetNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_StickerSet.TL_messages_stickerSetNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.messages_StickerSet::TLdeserialize, null)

    }

    @Test
    public fun test_users_UserFull_TL_users_userFull() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_users_UserFull.TL_users_userFull::class,
          space.axolab.axogram.tgnet.TLRPC.TL_users_userFull::TLdeserialize, null)

    }

    @Test
    public fun test_messages_PeerSettings_TL_messages_peerSettings() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_PeerSettings.TL_messages_peerSettings::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_peerSettings::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionSendMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionSendMessage::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_auth_CodeType_TL_auth_codeTypeMissedCall() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_auth_CodeType.TL_auth_codeTypeMissedCall::class,
          space.axolab.axogram.tgnet.TLRPC.auth_CodeType::TLdeserialize, null)

    }

    @Test
    public fun test_auth_SentCodeType_TL_auth_sentCodeTypeMissedCall() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_auth_SentCodeType.TL_auth_sentCodeTypeMissedCall::class,
          space.axolab.axogram.tgnet.TLRPC.auth_SentCodeType::TLdeserialize, null)

    }

    @Test
    public fun test_auth_LoggedOut_TL_auth_loggedOut() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_auth_LoggedOut.TL_auth_loggedOut::class,
          space.axolab.axogram.tgnet.TLRPC.TL_auth_loggedOut::TLdeserialize, null)

    }

    @Test
    public fun test_messages_AvailableReactions_TL_messages_availableReactionsNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_AvailableReactions.TL_messages_availableReactionsNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.messages_AvailableReactions::TLdeserialize, null)

    }

    @Test
    public fun test_messages_AvailableReactions_TL_messages_availableReactions() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_AvailableReactions.TL_messages_availableReactions::class,
          space.axolab.axogram.tgnet.TLRPC.messages_AvailableReactions::TLdeserialize, null)

    }

    @Test
    public fun test_MessageEntity_TL_messageEntitySpoiler() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageEntity.TL_messageEntitySpoiler::class,
          space.axolab.axogram.tgnet.TLRPC.MessageEntity::TLdeserialize, null)

    }

    @Test
    public fun test_AvailableReaction_TL_availableReaction() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_AvailableReaction.TL_availableReaction::class,
          space.axolab.axogram.tgnet.TLRPC.TL_availableReaction::TLdeserialize, null)

    }

    @Test
    public fun test_messages_MessageReactionsList_TL_messages_messageReactionsList() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_MessageReactionsList.TL_messages_messageReactionsList::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_messageReactionsList::TLdeserialize, null)

    }

    @Test
    public fun test_GroupCallStreamChannel_TL_groupCallStreamChannel() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_GroupCallStreamChannel.TL_groupCallStreamChannel::class,
          space.axolab.axogram.tgnet.tl.TL_phone.TL_groupCallStreamChannel::TLdeserialize, null)

    }

    @Test
    public fun test_phone_GroupCallStreamChannels_TL_phone_groupCallStreamChannels() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_phone_GroupCallStreamChannels.TL_phone_groupCallStreamChannels::class,
          space.axolab.axogram.tgnet.tl.TL_phone.groupCallStreamChannels::TLdeserialize, null)

    }

    @Test
    public fun test_ReportReason_TL_inputReportReasonIllegalDrugs() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ReportReason.TL_inputReportReasonIllegalDrugs::class,
          space.axolab.axogram.tgnet.TLRPC.ReportReason::TLdeserialize, null)

    }

    @Test
    public fun test_ReportReason_TL_inputReportReasonPersonalDetails() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ReportReason.TL_inputReportReasonPersonalDetails::class,
          space.axolab.axogram.tgnet.TLRPC.ReportReason::TLdeserialize, null)

    }

    @Test
    public fun test_phone_GroupCallStreamRtmpUrl_TL_phone_groupCallStreamRtmpUrl() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_phone_GroupCallStreamRtmpUrl.TL_phone_groupCallStreamRtmpUrl::class,
          space.axolab.axogram.tgnet.tl.TL_phone.groupCallStreamRtmpUrl::TLdeserialize, null)

    }

    @Test
    public fun test_AttachMenuBotIconColor_TL_attachMenuBotIconColor() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_AttachMenuBotIconColor.TL_attachMenuBotIconColor::class,
          space.axolab.axogram.tgnet.TLRPC.TL_attachMenuBotIconColor::TLdeserialize, null)

    }

    @Test
    public fun test_AttachMenuBotIcon_TL_attachMenuBotIcon() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_AttachMenuBotIcon.TL_attachMenuBotIcon::class,
          space.axolab.axogram.tgnet.TLRPC.TL_attachMenuBotIcon::TLdeserialize, null)

    }

    @Test
    public fun test_AttachMenuBots_TL_attachMenuBotsNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_AttachMenuBots.TL_attachMenuBotsNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.AttachMenuBots::TLdeserialize, null)

    }

    @Test
    public fun test_AttachMenuBots_TL_attachMenuBots() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_AttachMenuBots.TL_attachMenuBots::class,
          space.axolab.axogram.tgnet.TLRPC.AttachMenuBots::TLdeserialize, null)

    }

    @Test
    public fun test_AttachMenuBotsBot_TL_attachMenuBotsBot() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_AttachMenuBotsBot.TL_attachMenuBotsBot::class,
          space.axolab.axogram.tgnet.TLRPC.TL_attachMenuBotsBot::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateAttachMenuBots() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateAttachMenuBots::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_WebViewMessageSent_TL_webViewMessageSent() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_WebViewMessageSent.TL_webViewMessageSent::class,
          space.axolab.axogram.tgnet.TLRPC.TL_webViewMessageSent::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateWebViewResultSent() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateWebViewResultSent::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionWebViewDataSentMe() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionWebViewDataSentMe::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionWebViewDataSent() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionWebViewDataSent::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateBotMenuButton() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateBotMenuButton::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_BotMenuButton_TL_botMenuButtonDefault() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BotMenuButton.TL_botMenuButtonDefault::class,
          space.axolab.axogram.tgnet.tl.TL_bots.BotMenuButton::TLdeserialize, null)

    }

    @Test
    public fun test_BotMenuButton_TL_botMenuButtonCommands() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BotMenuButton.TL_botMenuButtonCommands::class,
          space.axolab.axogram.tgnet.tl.TL_bots.BotMenuButton::TLdeserialize, null)

    }

    @Test
    public fun test_BotMenuButton_TL_botMenuButton() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BotMenuButton.TL_botMenuButton::class,
          space.axolab.axogram.tgnet.tl.TL_bots.BotMenuButton::TLdeserialize, null)

    }

    @Test
    public fun test_account_SavedRingtones_TL_account_savedRingtonesNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_SavedRingtones.TL_account_savedRingtonesNotModified::class,
          space.axolab.axogram.tgnet.tl.TL_account.SavedRingtones::TLdeserialize, null)

    }

    @Test
    public fun test_account_SavedRingtones_TL_account_savedRingtones() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_SavedRingtones.TL_account_savedRingtones::class,
          space.axolab.axogram.tgnet.tl.TL_account.SavedRingtones::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateSavedRingtones() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateSavedRingtones::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_NotificationSound_TL_notificationSoundDefault() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_NotificationSound.TL_notificationSoundDefault::class,
          space.axolab.axogram.tgnet.TLRPC.NotificationSound::TLdeserialize, null)

    }

    @Test
    public fun test_NotificationSound_TL_notificationSoundNone() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_NotificationSound.TL_notificationSoundNone::class,
          space.axolab.axogram.tgnet.TLRPC.NotificationSound::TLdeserialize, null)

    }

    @Test
    public fun test_NotificationSound_TL_notificationSoundLocal() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_NotificationSound.TL_notificationSoundLocal::class,
          space.axolab.axogram.tgnet.TLRPC.NotificationSound::TLdeserialize, null)

    }

    @Test
    public fun test_NotificationSound_TL_notificationSoundRingtone() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_NotificationSound.TL_notificationSoundRingtone::class,
          space.axolab.axogram.tgnet.TLRPC.NotificationSound::TLdeserialize, null)

    }

    @Test
    public fun test_account_SavedRingtone_TL_account_savedRingtone() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_SavedRingtone.TL_account_savedRingtone::class,
          space.axolab.axogram.tgnet.tl.TL_account.SavedRingtone::TLdeserialize, null)

    }

    @Test
    public fun test_account_SavedRingtone_TL_account_savedRingtoneConverted() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_SavedRingtone.TL_account_savedRingtoneConverted::class,
          space.axolab.axogram.tgnet.tl.TL_account.SavedRingtone::TLdeserialize, null)

    }

    @Test
    public fun test_PhoneConnection_TL_phoneConnection() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PhoneConnection.TL_phoneConnection::class,
          space.axolab.axogram.tgnet.TLRPC.PhoneConnection::TLdeserialize, null)

    }

    @Test
    public fun test_EncryptedFile_TL_encryptedFile() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_EncryptedFile.TL_encryptedFile::class,
          space.axolab.axogram.tgnet.TLRPC.EncryptedFile::TLdeserialize, null)

    }

    @Test
    public fun test_Document_TL_document() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Document.TL_document::class,
          space.axolab.axogram.tgnet.TLRPC.Document::TLdeserialize, null)

    }

    @Test
    public fun test_messages_FeaturedStickers_TL_messages_featuredStickers() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_FeaturedStickers.TL_messages_featuredStickers::class,
          space.axolab.axogram.tgnet.TLRPC.messages_FeaturedStickers::TLdeserialize, null)

    }

    @Test
    public fun test_FileHash_TL_fileHash() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_FileHash.TL_fileHash::class,
          space.axolab.axogram.tgnet.TLRPC.TL_fileHash::TLdeserialize, null)

    }

    @Test
    public fun test_SecureFile_TL_secureFile() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureFile.TL_secureFile::class,
          space.axolab.axogram.tgnet.TLRPC.SecureFile::TLdeserialize, null)

    }

    @Test
    public fun test_AttachMenuPeerType_TL_attachMenuPeerTypeSameBotPM() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_AttachMenuPeerType.TL_attachMenuPeerTypeSameBotPM::class,
          space.axolab.axogram.tgnet.TLRPC.AttachMenuPeerType::TLdeserialize, null)

    }

    @Test
    public fun test_AttachMenuPeerType_TL_attachMenuPeerTypeBotPM() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_AttachMenuPeerType.TL_attachMenuPeerTypeBotPM::class,
          space.axolab.axogram.tgnet.TLRPC.AttachMenuPeerType::TLdeserialize, null)

    }

    @Test
    public fun test_AttachMenuPeerType_TL_attachMenuPeerTypePM() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_AttachMenuPeerType.TL_attachMenuPeerTypePM::class,
          space.axolab.axogram.tgnet.TLRPC.AttachMenuPeerType::TLdeserialize, null)

    }

    @Test
    public fun test_AttachMenuPeerType_TL_attachMenuPeerTypeChat() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_AttachMenuPeerType.TL_attachMenuPeerTypeChat::class,
          space.axolab.axogram.tgnet.TLRPC.AttachMenuPeerType::TLdeserialize, null)

    }

    @Test
    public fun test_AttachMenuPeerType_TL_attachMenuPeerTypeBroadcast() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_AttachMenuPeerType.TL_attachMenuPeerTypeBroadcast::class,
          space.axolab.axogram.tgnet.TLRPC.AttachMenuPeerType::TLdeserialize, null)

    }

    @Test
    public fun test_ExportedChatInvite_TL_chatInvitePublicJoinRequests() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ExportedChatInvite.TL_chatInvitePublicJoinRequests::class,
          space.axolab.axogram.tgnet.TLRPC.ExportedChatInvite::TLdeserialize, null)

    }

    @Test
    public fun test_InputInvoice_TL_inputInvoiceMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputInvoice.TL_inputInvoiceMessage::class,
          space.axolab.axogram.tgnet.TLRPC.InputInvoice::TLdeserialize, null)

    }

    @Test
    public fun test_InputInvoice_TL_inputInvoiceSlug() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputInvoice.TL_inputInvoiceSlug::class,
          space.axolab.axogram.tgnet.TLRPC.InputInvoice::TLdeserialize, null)

    }

    @Test
    public fun test_payments_ExportedInvoice_TL_payments_exportedInvoice() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_ExportedInvoice.TL_payments_exportedInvoice::class,
          space.axolab.axogram.tgnet.TLRPC.TL_payments_exportedInvoice::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateTranscribedAudio() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateTranscribedAudio::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_DialogFilter_TL_dialogFilterDefault() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DialogFilter.TL_dialogFilterDefault::class,
          space.axolab.axogram.tgnet.TLRPC.DialogFilter::TLdeserialize, null)

    }

    @Test
    public fun test_StickerSet_TL_stickerSet() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StickerSet.TL_stickerSet::class,
          space.axolab.axogram.tgnet.TLRPC.StickerSet::TLdeserialize, null)

    }

    @Test
    public fun test_payments_PaymentForm_TL_payments_paymentForm() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_PaymentForm.TL_payments_paymentForm::class,
          space.axolab.axogram.tgnet.TLRPC.PaymentForm::TLdeserialize, null)

    }

    @Test
    public fun test_MessageEntity_TL_messageEntityCustomEmoji() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageEntity.TL_messageEntityCustomEmoji::class,
          space.axolab.axogram.tgnet.TLRPC.MessageEntity::TLdeserialize, null)

    }

    @Test
    public fun test_DocumentAttribute_TL_documentAttributeCustomEmoji() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DocumentAttribute.TL_documentAttributeCustomEmoji::class,
          space.axolab.axogram.tgnet.TLRPC.DocumentAttribute::TLdeserialize, null)

    }

    @Test
    public fun test_InputStorePaymentPurpose_TL_inputStorePaymentPremiumSubscription() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputStorePaymentPurpose.TL_inputStorePaymentPremiumSubscription::class,
          space.axolab.axogram.tgnet.TLRPC.InputStorePaymentPurpose::TLdeserialize, null)

    }

    @Test
    public fun test_InputStorePaymentPurpose_TL_inputStorePaymentGiftPremium() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputStorePaymentPurpose.TL_inputStorePaymentGiftPremium::class,
          space.axolab.axogram.tgnet.TLRPC.InputStorePaymentPurpose::TLdeserialize, null)

    }

    @Test
    public fun test_InputStickerSet_TL_inputStickerSetPremiumGifts() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputStickerSet.TL_inputStickerSetPremiumGifts::class,
          space.axolab.axogram.tgnet.TLRPC.InputStickerSet::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateReadFeaturedEmojiStickers() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateReadFeaturedEmojiStickers::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_InputPrivacyKey_TL_inputPrivacyKeyVoiceMessages() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPrivacyKey.TL_inputPrivacyKeyVoiceMessages::class,
          space.axolab.axogram.tgnet.TLRPC.InputPrivacyKey::TLdeserialize, null)

    }

    @Test
    public fun test_PrivacyKey_TL_privacyKeyVoiceMessages() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PrivacyKey.TL_privacyKeyVoiceMessages::class,
          space.axolab.axogram.tgnet.TLRPC.PrivacyKey::TLdeserialize, null)

    }

    @Test
    public fun test_PaymentFormMethod_TL_paymentFormMethod() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PaymentFormMethod.TL_paymentFormMethod::class,
          space.axolab.axogram.tgnet.TLRPC.TL_paymentFormMethod::TLdeserialize, null)

    }

    @Test
    public fun test_account_Password_TL_account_password() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_Password.TL_account_password::class,
          space.axolab.axogram.tgnet.tl.TL_account.Password::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateStickerSets() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateStickerSets::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_channels_SendAsPeers_TL_channels_sendAsPeers() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_channels_SendAsPeers.TL_channels_sendAsPeers::class,
          space.axolab.axogram.tgnet.TLRPC.TL_channels_sendAsPeers::TLdeserialize, null)

    }

    @Test
    public fun test_ReactionCount_TL_reactionCount() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ReactionCount.TL_reactionCount::class,
          space.axolab.axogram.tgnet.TLRPC.ReactionCount::TLdeserialize, null)

    }

    @Test
    public
        fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionChangeAvailableReactions() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionChangeAvailableReactions::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_help_PremiumPromo_TL_help_premiumPromo() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_help_PremiumPromo.TL_help_premiumPromo::class,
          space.axolab.axogram.tgnet.TLRPC.TL_help_premiumPromo::TLdeserialize, null)

    }

    @Test
    public fun test_EmojiStatus_TL_emojiStatusEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_EmojiStatus.TL_emojiStatusEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.EmojiStatus::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateUserEmojiStatus() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateUserEmojiStatus::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateRecentEmojiStatuses() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateRecentEmojiStatuses::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_account_EmojiStatuses_TL_account_emojiStatusesNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_EmojiStatuses.TL_account_emojiStatusesNotModified::class,
          space.axolab.axogram.tgnet.tl.TL_account.EmojiStatuses::TLdeserialize, null)

    }

    @Test
    public fun test_account_EmojiStatuses_TL_account_emojiStatuses() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_EmojiStatuses.TL_account_emojiStatuses::class,
          space.axolab.axogram.tgnet.tl.TL_account.EmojiStatuses::TLdeserialize, null)

    }

    @Test
    public fun test_Reaction_TL_reactionEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Reaction.TL_reactionEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.Reaction::TLdeserialize, null)

    }

    @Test
    public fun test_Reaction_TL_reactionEmoji() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Reaction.TL_reactionEmoji::class,
          space.axolab.axogram.tgnet.TLRPC.Reaction::TLdeserialize, null)

    }

    @Test
    public fun test_Reaction_TL_reactionCustomEmoji() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Reaction.TL_reactionCustomEmoji::class,
          space.axolab.axogram.tgnet.TLRPC.Reaction::TLdeserialize, null)

    }

    @Test
    public fun test_ChatReactions_TL_chatReactionsNone() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatReactions.TL_chatReactionsNone::class,
          space.axolab.axogram.tgnet.TLRPC.ChatReactions::TLdeserialize, null)

    }

    @Test
    public fun test_ChatReactions_TL_chatReactionsAll() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatReactions.TL_chatReactionsAll::class,
          space.axolab.axogram.tgnet.TLRPC.ChatReactions::TLdeserialize, null)

    }

    @Test
    public fun test_ChatReactions_TL_chatReactionsSome() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatReactions.TL_chatReactionsSome::class,
          space.axolab.axogram.tgnet.TLRPC.ChatReactions::TLdeserialize, null)

    }

    @Test
    public fun test_messages_Reactions_TL_messages_reactionsNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_Reactions.TL_messages_reactionsNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.messages_Reactions::TLdeserialize, null)

    }

    @Test
    public fun test_messages_Reactions_TL_messages_reactions() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_Reactions.TL_messages_reactions::class,
          space.axolab.axogram.tgnet.TLRPC.messages_Reactions::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateRecentReactions() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateRecentReactions::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateMoveStickerSetToTop() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateMoveStickerSetToTop::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_auth_SentCodeType_TL_auth_sentCodeTypeSetUpEmailRequired() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_auth_SentCodeType.TL_auth_sentCodeTypeSetUpEmailRequired::class,
          space.axolab.axogram.tgnet.TLRPC.auth_SentCodeType::TLdeserialize, null)

    }

    @Test
    public fun test_EmailVerifyPurpose_TL_emailVerifyPurposeLoginSetup() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_EmailVerifyPurpose.TL_emailVerifyPurposeLoginSetup::class,
          space.axolab.axogram.tgnet.TLRPC.EmailVerifyPurpose::TLdeserialize, null)

    }

    @Test
    public fun test_EmailVerifyPurpose_TL_emailVerifyPurposeLoginChange() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_EmailVerifyPurpose.TL_emailVerifyPurposeLoginChange::class,
          space.axolab.axogram.tgnet.TLRPC.EmailVerifyPurpose::TLdeserialize, null)

    }

    @Test
    public fun test_EmailVerifyPurpose_TL_emailVerifyPurposePassport() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_EmailVerifyPurpose.TL_emailVerifyPurposePassport::class,
          space.axolab.axogram.tgnet.TLRPC.EmailVerifyPurpose::TLdeserialize, null)

    }

    @Test
    public fun test_EmailVerification_TL_emailVerificationCode() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_EmailVerification.TL_emailVerificationCode::class,
          space.axolab.axogram.tgnet.TLRPC.EmailVerification::TLdeserialize, null)

    }

    @Test
    public fun test_EmailVerification_TL_emailVerificationGoogle() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_EmailVerification.TL_emailVerificationGoogle::class,
          space.axolab.axogram.tgnet.TLRPC.EmailVerification::TLdeserialize, null)

    }

    @Test
    public fun test_EmailVerification_TL_emailVerificationApple() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_EmailVerification.TL_emailVerificationApple::class,
          space.axolab.axogram.tgnet.TLRPC.EmailVerification::TLdeserialize, null)

    }

    @Test
    public fun test_account_EmailVerified_TL_account_emailVerified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_EmailVerified.TL_account_emailVerified::class,
          space.axolab.axogram.tgnet.tl.TL_account.EmailVerified::TLdeserialize, null)

    }

    @Test
    public fun test_account_EmailVerified_TL_account_emailVerifiedLogin() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_EmailVerified.TL_account_emailVerifiedLogin::class,
          space.axolab.axogram.tgnet.tl.TL_account.EmailVerified::TLdeserialize, null)

    }

    @Test
    public fun test_InputStickerSet_TL_inputStickerSetEmojiGenericAnimations() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputStickerSet.TL_inputStickerSetEmojiGenericAnimations::class,
          space.axolab.axogram.tgnet.TLRPC.InputStickerSet::TLdeserialize, null)

    }

    @Test
    public fun test_InputStickerSet_TL_inputStickerSetEmojiDefaultStatuses() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputStickerSet.TL_inputStickerSetEmojiDefaultStatuses::class,
          space.axolab.axogram.tgnet.TLRPC.InputStickerSet::TLdeserialize, null)

    }

    @Test
    public fun test_SendAsPeer_TL_sendAsPeer() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SendAsPeer.TL_sendAsPeer::class,
          space.axolab.axogram.tgnet.TLRPC.TL_sendAsPeer::TLdeserialize, null)

    }

    @Test
    public fun test_MessageMedia_TL_messageMediaInvoice() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaInvoice::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_MessageExtendedMedia_TL_messageExtendedMediaPreview() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageExtendedMedia.TL_messageExtendedMediaPreview::class,
          space.axolab.axogram.tgnet.TLRPC.MessageExtendedMedia::TLdeserialize, null)

    }

    @Test
    public fun test_MessageExtendedMedia_TL_messageExtendedMedia() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageExtendedMedia.TL_messageExtendedMedia::class,
          space.axolab.axogram.tgnet.TLRPC.MessageExtendedMedia::TLdeserialize, null)

    }

    @Test
    public fun test_messages_StickerSet_TL_messages_stickerSet() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_StickerSet.TL_messages_stickerSet::class,
          space.axolab.axogram.tgnet.TLRPC.messages_StickerSet::TLdeserialize, null)

    }

    @Test
    public fun test_StickerSetCovered_TL_stickerSetFullCovered() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StickerSetCovered.TL_stickerSetFullCovered::class,
          space.axolab.axogram.tgnet.TLRPC.StickerSetCovered::TLdeserialize, null)

    }

    @Test
    public fun test_StickerKeyword_TL_stickerKeyword() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StickerKeyword.TL_stickerKeyword::class,
          space.axolab.axogram.tgnet.TLRPC.TL_stickerKeyword::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateUserName() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateUserName::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Username_TL_username() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Username.TL_username::class,
          space.axolab.axogram.tgnet.TLRPC.TL_username::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionChangeUsernames() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionChangeUsernames::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionToggleForum() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionToggleForum::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionCreateTopic() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionCreateTopic::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionEditTopic() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionEditTopic::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionDeleteTopic() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionDeleteTopic::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionPinTopic() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionPinTopic::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_ForumTopic_TL_forumTopicDeleted() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ForumTopic.TL_forumTopicDeleted::class,
          space.axolab.axogram.tgnet.TLRPC.ForumTopic::TLdeserialize, null)

    }

    @Test
    public fun test_messages_ForumTopics_TL_messages_forumTopics() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_ForumTopics.TL_messages_forumTopics::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_forumTopics::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionTopicCreate() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionTopicCreate::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_InputNotifyPeer_TL_inputNotifyForumTopic() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputNotifyPeer.TL_inputNotifyForumTopic::class,
          space.axolab.axogram.tgnet.TLRPC.InputNotifyPeer::TLdeserialize, null)

    }

    @Test
    public fun test_NotifyPeer_TL_notifyForumTopic() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_NotifyPeer.TL_notifyForumTopic::class,
          space.axolab.axogram.tgnet.TLRPC.NotifyPeer::TLdeserialize, null)

    }

    @Test
    public fun test_InputStickerSet_TL_inputStickerSetEmojiDefaultTopicIcons() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputStickerSet.TL_inputStickerSetEmojiDefaultTopicIcons::class,
          space.axolab.axogram.tgnet.TLRPC.InputStickerSet::TLdeserialize, null)

    }

    @Test
    public fun test_messages_SponsoredMessages_TL_messages_sponsoredMessagesEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_SponsoredMessages.TL_messages_sponsoredMessagesEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.messages_SponsoredMessages::TLdeserialize, null)

    }

    @Test
    public fun test_messages_Messages_TL_messages_channelMessages() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_Messages.TL_messages_channelMessages::class,
          space.axolab.axogram.tgnet.TLRPC.messages_Messages::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionSetMessagesTTL() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionSetMessagesTTL::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionTopicEdit() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionTopicEdit::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_DefaultHistoryTTL_TL_defaultHistoryTTL() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DefaultHistoryTTL.TL_defaultHistoryTTL::class,
          space.axolab.axogram.tgnet.TLRPC.TL_defaultHistoryTTL::TLdeserialize, null)

    }

    @Test
    public fun test_auth_CodeType_TL_auth_codeTypeFragmentSms() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_auth_CodeType.TL_auth_codeTypeFragmentSms::class,
          space.axolab.axogram.tgnet.TLRPC.auth_CodeType::TLdeserialize, null)

    }

    @Test
    public fun test_auth_SentCodeType_TL_auth_sentCodeTypeFragmentSms() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_auth_SentCodeType.TL_auth_sentCodeTypeFragmentSms::class,
          space.axolab.axogram.tgnet.TLRPC.auth_SentCodeType::TLdeserialize, null)

    }

    @Test
    public fun test_ExportedContactToken_TL_exportedContactToken() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ExportedContactToken.TL_exportedContactToken::class,
          space.axolab.axogram.tgnet.TLRPC.TL_exportedContactToken::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionToggleAntiSpam() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionToggleAntiSpam::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionSuggestProfilePhoto() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionSuggestProfilePhoto::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_StickerSetCovered_TL_stickerSetNoCovered() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StickerSetCovered.TL_stickerSetNoCovered::class,
          space.axolab.axogram.tgnet.TLRPC.StickerSetCovered::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateUser() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateUser::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_InputChatPhoto_TL_inputChatUploadedPhoto() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputChatPhoto.TL_inputChatUploadedPhoto::class,
          space.axolab.axogram.tgnet.TLRPC.InputChatPhoto::TLdeserialize, null)

    }

    @Test
    public fun test_auth_Authorization_TL_auth_authorization() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_auth_Authorization.TL_auth_authorization::class,
          space.axolab.axogram.tgnet.TLRPC.auth_Authorization::TLdeserialize, null)

    }

    @Test
    public fun test_CodeSettings_TL_codeSettings() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_CodeSettings.TL_codeSettings::class,
          space.axolab.axogram.tgnet.TLRPC.TL_codeSettings::TLdeserialize, null)

    }

    @Test
    public fun test_PremiumSubscriptionOption_TL_premiumSubscriptionOption() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PremiumSubscriptionOption.TL_premiumSubscriptionOption::class,
          space.axolab.axogram.tgnet.TLRPC.TL_premiumSubscriptionOption::TLdeserialize, null)

    }

    @Test
    public fun test_auth_SentCode_TL_auth_sentCodeSuccess() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_auth_SentCode.TL_auth_sentCodeSuccess::class,
          space.axolab.axogram.tgnet.TLRPC.auth_SentCode::TLdeserialize, null)

    }

    @Test
    public fun test_RequestPeerType_TL_requestPeerTypeUser() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_RequestPeerType.TL_requestPeerTypeUser::class,
          space.axolab.axogram.tgnet.TLRPC.RequestPeerType::TLdeserialize, null)

    }

    @Test
    public fun test_RequestPeerType_TL_requestPeerTypeChat() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_RequestPeerType.TL_requestPeerTypeChat::class,
          space.axolab.axogram.tgnet.TLRPC.RequestPeerType::TLdeserialize, null)

    }

    @Test
    public fun test_RequestPeerType_TL_requestPeerTypeBroadcast() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_RequestPeerType.TL_requestPeerTypeBroadcast::class,
          space.axolab.axogram.tgnet.TLRPC.RequestPeerType::TLdeserialize, null)

    }

    @Test
    public fun test_EmojiList_TL_emojiListNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_EmojiList.TL_emojiListNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.EmojiList::TLdeserialize, null)

    }

    @Test
    public fun test_EmojiList_TL_emojiList() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_EmojiList.TL_emojiList::class,
          space.axolab.axogram.tgnet.TLRPC.EmojiList::TLdeserialize, null)

    }

    @Test
    public fun test_EmojiGroup_TL_emojiGroup() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_EmojiGroup.TL_emojiGroup::class,
          space.axolab.axogram.tgnet.TLRPC.EmojiGroup::TLdeserialize, null)

    }

    @Test
    public fun test_messages_EmojiGroups_TL_messages_emojiGroupsNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_EmojiGroups.TL_messages_emojiGroupsNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.messages_EmojiGroups::TLdeserialize, null)

    }

    @Test
    public fun test_messages_EmojiGroups_TL_messages_emojiGroups() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_EmojiGroups.TL_messages_emojiGroups::class,
          space.axolab.axogram.tgnet.TLRPC.messages_EmojiGroups::TLdeserialize, null)

    }

    @Test
    public fun test_VideoSize_TL_videoSizeEmojiMarkup() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_VideoSize.TL_videoSizeEmojiMarkup::class,
          space.axolab.axogram.tgnet.TLRPC.VideoSize::TLdeserialize, null)

    }

    @Test
    public fun test_VideoSize_TL_videoSizeStickerMarkup() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_VideoSize.TL_videoSizeStickerMarkup::class,
          space.axolab.axogram.tgnet.TLRPC.VideoSize::TLdeserialize, null)

    }

    @Test
    public fun test_TextWithEntities_TL_textWithEntities() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_TextWithEntities.TL_textWithEntities::class,
          space.axolab.axogram.tgnet.TLRPC.TL_textWithEntities::TLdeserialize, null)

    }

    @Test
    public fun test_messages_TranslatedText_TL_messages_translateResult() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_TranslatedText.TL_messages_translateResult::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_translateResult::TLdeserialize, null)

    }

    @Test
    public fun test_help_AppConfig_TL_help_appConfigNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_help_AppConfig.TL_help_appConfigNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.help_AppConfig::TLdeserialize, null)

    }

    @Test
    public fun test_help_AppConfig_TL_help_appConfig() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_help_AppConfig.TL_help_appConfig::class,
          space.axolab.axogram.tgnet.TLRPC.help_AppConfig::TLdeserialize, null)

    }

    @Test
    public fun test_Config_TL_config() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Config.TL_config::class,
          space.axolab.axogram.tgnet.TLRPC.TL_config::TLdeserialize, null)

    }

    @Test
    public fun test_messages_BotResults_TL_messages_botResults() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_BotResults.TL_messages_botResults::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_botResults::TLdeserialize, null)
          test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_BotResults.TL_messages_botResults::class,
              space.axolab.axogram.tgnet.TLRPC.messages_BotResults::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionBotAllowed() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionBotAllowed::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_InputBotApp_TL_inputBotAppID() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputBotApp.TL_inputBotAppID::class,
          space.axolab.axogram.tgnet.TLRPC.InputBotApp::TLdeserialize, null)

    }

    @Test
    public fun test_InputBotApp_TL_inputBotAppShortName() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputBotApp.TL_inputBotAppShortName::class,
          space.axolab.axogram.tgnet.TLRPC.InputBotApp::TLdeserialize, null)

    }

    @Test
    public fun test_BotApp_TL_botAppNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BotApp.TL_botAppNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.BotApp::TLdeserialize, null)

    }

    @Test
    public fun test_BotApp_TL_botApp() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BotApp.TL_botApp::class,
          space.axolab.axogram.tgnet.TLRPC.BotApp::TLdeserialize, null)

    }

    @Test
    public fun test_messages_BotApp_TL_messages_botApp() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_BotApp.TL_messages_botApp::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_botApp::TLdeserialize, null)

    }

    @Test
    public fun test_InlineBotWebView_TL_inlineBotWebView() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InlineBotWebView.TL_inlineBotWebView::class,
          space.axolab.axogram.tgnet.TLRPC.TL_inlineBotWebView::TLdeserialize, null)

    }

    @Test
    public fun test_ReadParticipantDate_TL_readParticipantDate() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ReadParticipantDate.TL_readParticipantDate::class,
          space.axolab.axogram.tgnet.TLRPC.TL_readParticipantDate::TLdeserialize, null)

    }

    @Test
    public fun test_MessagePeerReaction_TL_messagePeerReaction() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessagePeerReaction.TL_messagePeerReaction::class,
          space.axolab.axogram.tgnet.TLRPC.MessagePeerReaction::TLdeserialize, null)

    }

    @Test
    public fun test_auth_SentCodeType_TL_auth_sentCodeTypeEmailCode() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_auth_SentCodeType.TL_auth_sentCodeTypeEmailCode::class,
          space.axolab.axogram.tgnet.TLRPC.auth_SentCodeType::TLdeserialize, null)

    }

    @Test
    public
        fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionParticipantJoinByInvite() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionParticipantJoinByInvite::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_InputChatlist_TL_inputChatlistDialogFilter() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputChatlist.TL_inputChatlistDialogFilter::class,
          space.axolab.axogram.tgnet.tl.TL_chatlists.TL_inputChatlistDialogFilter::TLdeserialize,
          null)

    }

    @Test
    public fun test_ExportedChatlistInvite_TL_exportedChatlistInvite() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ExportedChatlistInvite.TL_exportedChatlistInvite::class,
          space.axolab.axogram.tgnet.tl.TL_chatlists.TL_exportedChatlistInvite::TLdeserialize, null)

    }

    @Test
    public fun test_chatlists_ExportedChatlistInvite_TL_chatlists_exportedChatlistInvite() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_chatlists_ExportedChatlistInvite.TL_chatlists_exportedChatlistInvite::class,
          space.axolab.axogram.tgnet.tl.TL_chatlists.TL_chatlists_exportedChatlistInvite::TLdeserialize,
          null)

    }

    @Test
    public fun test_chatlists_ExportedInvites_TL_chatlists_exportedInvites() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_chatlists_ExportedInvites.TL_chatlists_exportedInvites::class,
          space.axolab.axogram.tgnet.tl.TL_chatlists.TL_chatlists_exportedInvites::TLdeserialize,
          null)

    }

    @Test
    public fun test_chatlists_ChatlistInvite_TL_chatlists_chatlistInviteAlready() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_chatlists_ChatlistInvite.TL_chatlists_chatlistInviteAlready::class,
          space.axolab.axogram.tgnet.tl.TL_chatlists.chatlist_ChatlistInvite::TLdeserialize, null)

    }

    @Test
    public fun test_chatlists_ChatlistUpdates_TL_chatlists_chatlistUpdates() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_chatlists_ChatlistUpdates.TL_chatlists_chatlistUpdates::class,
          space.axolab.axogram.tgnet.tl.TL_chatlists.TL_chatlists_chatlistUpdates::TLdeserialize,
          null)

    }

    @Test
    public fun test_InlineQueryPeerType_TL_inlineQueryPeerTypeBotPM() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InlineQueryPeerType.TL_inlineQueryPeerTypeBotPM::class,
          space.axolab.axogram.tgnet.TLRPC.InlineQueryPeerType::TLdeserialize, null)

    }

    @Test
    public fun test_AutoDownloadSettings_TL_autoDownloadSettings() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_AutoDownloadSettings.TL_autoDownloadSettings::class,
          space.axolab.axogram.tgnet.TLRPC.TL_autoDownloadSettings::TLdeserialize, null)

    }

    @Test
    public fun test_messages_VotesList_TL_messages_votesList() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_VotesList.TL_messages_votesList::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_votesList::TLdeserialize, null)

    }

    @Test
    public fun test_MessagePeerVote_TL_messagePeerVote() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessagePeerVote.TL_messagePeerVote::class,
          space.axolab.axogram.tgnet.TLRPC.MessagePeerVote::TLdeserialize, null)

    }

    @Test
    public fun test_MessagePeerVote_TL_messagePeerVoteInputOption() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessagePeerVote.TL_messagePeerVoteInputOption::class,
          space.axolab.axogram.tgnet.TLRPC.MessagePeerVote::TLdeserialize, null)

    }

    @Test
    public fun test_MessagePeerVote_TL_messagePeerVoteMultiple() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessagePeerVote.TL_messagePeerVoteMultiple::class,
          space.axolab.axogram.tgnet.TLRPC.MessagePeerVote::TLdeserialize, null)

    }

    @Test
    public fun test_InputPrivacyKey_TL_inputPrivacyKeyAbout() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPrivacyKey.TL_inputPrivacyKeyAbout::class,
          space.axolab.axogram.tgnet.TLRPC.InputPrivacyKey::TLdeserialize, null)

    }

    @Test
    public fun test_PrivacyKey_TL_privacyKeyAbout() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PrivacyKey.TL_privacyKeyAbout::class,
          space.axolab.axogram.tgnet.TLRPC.PrivacyKey::TLdeserialize, null)

    }

    @Test
    public fun test_InputPeerNotifySettings_TL_inputPeerNotifySettings() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPeerNotifySettings.TL_inputPeerNotifySettings::class,
          space.axolab.axogram.tgnet.TLRPC.TL_inputPeerNotifySettings::TLdeserialize, null)

    }

    @Test
    public fun test_PeerNotifySettings_TL_peerNotifySettings() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PeerNotifySettings.TL_peerNotifySettings::class,
          space.axolab.axogram.tgnet.TLRPC.PeerNotifySettings::TLdeserialize, null)

    }

    @Test
    public fun test_StoryItem_TL_storyItemDeleted() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StoryItem.TL_storyItemDeleted::class,
          space.axolab.axogram.tgnet.tl.TL_stories.StoryItem::TLdeserialize, null)

    }

    @Test
    public fun test_StoryItem_TL_storyItemSkipped() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StoryItem.TL_storyItemSkipped::class,
          space.axolab.axogram.tgnet.tl.TL_stories.StoryItem::TLdeserialize, null)

    }

    @Test
    public fun test_InputPrivacyRule_TL_inputPrivacyValueAllowCloseFriends() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPrivacyRule.TL_inputPrivacyValueAllowCloseFriends::class,
          space.axolab.axogram.tgnet.TLRPC.InputPrivacyRule::TLdeserialize, null)

    }

    @Test
    public fun test_PrivacyRule_TL_privacyValueAllowCloseFriends() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PrivacyRule.TL_privacyValueAllowCloseFriends::class,
          space.axolab.axogram.tgnet.TLRPC.PrivacyRule::TLdeserialize, null)

    }

    @Test
    public fun test_stories_StoryViews_TL_stories_storyViews() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_stories_StoryViews.TL_stories_storyViews::class,
          space.axolab.axogram.tgnet.tl.TL_stories.TL_stories_storyViews::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateStoryID() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateStoryID::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_ExportedStoryLink_TL_exportedStoryLink() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ExportedStoryLink.TL_exportedStoryLink::class,
          space.axolab.axogram.tgnet.tl.TL_stories.TL_exportedStoryLink::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateNewAuthorization() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateNewAuthorization::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_WebPage_TL_webPageEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_WebPage.TL_webPageEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.WebPage::TLdeserialize, null)

    }

    @Test
    public fun test_WebPage_TL_webPagePending() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_WebPage.TL_webPagePending::class,
          space.axolab.axogram.tgnet.TLRPC.WebPage::TLdeserialize, null)

    }

    @Test
    public fun test_MessageMedia_TL_messageMediaWebPage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaWebPage::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateReadMessagesContents() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateReadMessagesContents::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_MessageFwdHeader_TL_messageFwdHeader() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageFwdHeader.TL_messageFwdHeader::class,
          space.axolab.axogram.tgnet.TLRPC.MessageFwdHeader::TLdeserialize, null)

    }

    @Test
    public fun test_WallPaperSettings_TL_wallPaperSettings() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_WallPaperSettings.TL_wallPaperSettings::class,
          space.axolab.axogram.tgnet.TLRPC.WallPaperSettings::TLdeserialize, null)

    }

    @Test
    public fun test_stats_BroadcastStats_TL_stats_broadcastStats() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_stats_BroadcastStats.TL_stats_broadcastStats::class,
          space.axolab.axogram.tgnet.tl.TL_stats.TL_broadcastStats::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updatePeerBlocked() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updatePeerBlocked::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_stats_MessageStats_TL_stats_messageStats() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_stats_MessageStats.TL_stats_messageStats::class,
          space.axolab.axogram.tgnet.tl.TL_stats.TL_messageStats::TLdeserialize, null)

    }

    @Test
    public fun test_AttachMenuBot_TL_attachMenuBot() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_AttachMenuBot.TL_attachMenuBot::class,
          space.axolab.axogram.tgnet.TLRPC.TL_attachMenuBot_layer140::TLdeserialize, null)
          test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_AttachMenuBot.TL_attachMenuBot::class,
              space.axolab.axogram.tgnet.TLRPC.AttachMenuBot::TLdeserialize, null)

    }

    @Test
    public fun test_messages_TranscribedAudio_TL_messages_transcribedAudio() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_TranscribedAudio.TL_messages_transcribedAudio::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_transcribedAudio::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionRequestedPeer() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionRequestedPeer::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionSetChatWallPaper() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionSetChatWallPaper::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_StoryViews_TL_storyViews() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StoryViews.TL_storyViews::class,
          space.axolab.axogram.tgnet.tl.TL_stories.StoryViews::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateStory() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateStory::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateReadStories() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateReadStories::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_stories_AllStories_TL_stories_allStoriesNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_stories_AllStories.TL_stories_allStoriesNotModified::class,
          space.axolab.axogram.tgnet.tl.TL_stories.stories_AllStories::TLdeserialize, null)

    }

    @Test
    public fun test_stories_AllStories_TL_stories_allStories() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_stories_AllStories.TL_stories_allStories::class,
          space.axolab.axogram.tgnet.tl.TL_stories.stories_AllStories::TLdeserialize, null)

    }

    @Test
    public fun test_StoryView_TL_storyView() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StoryView.TL_storyView::class,
          space.axolab.axogram.tgnet.tl.TL_stories.StoryView::TLdeserialize, null)

    }

    @Test
    public fun test_stories_StoryViewsList_TL_stories_storyViewsList() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_stories_StoryViewsList.TL_stories_storyViewsList::class,
          space.axolab.axogram.tgnet.tl.TL_stories.StoryViewsList::TLdeserialize, null)

    }

    @Test
    public fun test_InputMedia_TL_inputMediaStory() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputMedia.TL_inputMediaStory::class,
          space.axolab.axogram.tgnet.TLRPC.InputMedia::TLdeserialize, null)

    }

    @Test
    public fun test_MessageMedia_TL_messageMediaStory() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaStory::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_WebPageAttribute_TL_webPageAttributeStory() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_WebPageAttribute.TL_webPageAttributeStory::class,
          space.axolab.axogram.tgnet.TLRPC.WebPageAttribute::TLdeserialize, null)

    }

    @Test
    public fun test_StoriesStealthMode_TL_storiesStealthMode() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StoriesStealthMode.TL_storiesStealthMode::class,
          space.axolab.axogram.tgnet.tl.TL_stories.TL_storiesStealthMode::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateStoriesStealthMode() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateStoriesStealthMode::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_MediaArea_TL_mediaAreaVenue() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MediaArea.TL_mediaAreaVenue::class,
          space.axolab.axogram.tgnet.tl.TL_stories.MediaArea::TLdeserialize, null)

    }

    @Test
    public fun test_MediaArea_TL_inputMediaAreaVenue() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MediaArea.TL_inputMediaAreaVenue::class,
          space.axolab.axogram.tgnet.tl.TL_stories.MediaArea::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateSentStoryReaction() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateSentStoryReaction::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_MediaArea_TL_mediaAreaSuggestedReaction() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MediaArea.TL_mediaAreaSuggestedReaction::class,
          space.axolab.axogram.tgnet.tl.TL_stories.MediaArea::TLdeserialize, null)

    }

    @Test
    public fun test_PeerStories_TL_peerStories() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PeerStories.TL_peerStories::class,
          space.axolab.axogram.tgnet.tl.TL_stories.PeerStories::TLdeserialize, null)

    }

    @Test
    public fun test_stories_PeerStories_TL_stories_peerStories() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_stories_PeerStories.TL_stories_peerStories::class,
          space.axolab.axogram.tgnet.tl.TL_stories.TL_stories_peerStories::TLdeserialize, null)

    }

    @Test
    public fun test_messages_WebPage_TL_messages_webPage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_WebPage.TL_messages_webPage::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_webPage::TLdeserialize, null)

    }

    @Test
    public fun test_InputStorePaymentPurpose_TL_inputStorePaymentPremiumGiveaway() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputStorePaymentPurpose.TL_inputStorePaymentPremiumGiveaway::class,
          space.axolab.axogram.tgnet.TLRPC.InputStorePaymentPurpose::TLdeserialize, null)

    }

    @Test
    public fun test_InputInvoice_TL_inputInvoicePremiumGiftCode() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputInvoice.TL_inputInvoicePremiumGiftCode::class,
          space.axolab.axogram.tgnet.TLRPC.InputInvoice::TLdeserialize, null)

    }

    @Test
    public fun test_PremiumGiftCodeOption_TL_premiumGiftCodeOption() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PremiumGiftCodeOption.TL_premiumGiftCodeOption::class,
          space.axolab.axogram.tgnet.TLRPC.TL_premiumGiftCodeOption::TLdeserialize, null)

    }

    @Test
    public fun test_payments_GiveawayInfo_TL_payments_giveawayInfo() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_GiveawayInfo.TL_payments_giveawayInfo::class,
          space.axolab.axogram.tgnet.TLRPC.payments_GiveawayInfo::TLdeserialize, null)

    }

    @Test
    public fun test_PrepaidGiveaway_TL_prepaidGiveaway() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PrepaidGiveaway.TL_prepaidGiveaway::class,
          space.axolab.axogram.tgnet.tl.TL_stories.PrepaidGiveaway::TLdeserialize, null)

    }

    @Test
    public fun test_InputMedia_TL_inputMediaWebPage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputMedia.TL_inputMediaWebPage::class,
          space.axolab.axogram.tgnet.TLRPC.InputMedia::TLdeserialize, null)

    }

    @Test
    public fun test_BotInlineMessage_TL_botInlineMessageMediaWebPage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BotInlineMessage.TL_botInlineMessageMediaWebPage::class,
          space.axolab.axogram.tgnet.TLRPC.BotInlineMessage::TLdeserialize, null)

    }

    @Test
    public fun test_premium_BoostsList_TL_premium_boostsList() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_premium_BoostsList.TL_premium_boostsList::class,
          space.axolab.axogram.tgnet.tl.TL_stories.TL_premium_boostsList::TLdeserialize, null)

    }

    @Test
    public fun test_MyBoost_TL_myBoost() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MyBoost.TL_myBoost::class,
          space.axolab.axogram.tgnet.tl.TL_stories.TL_myBoost::TLdeserialize, null)

    }

    @Test
    public fun test_premium_MyBoosts_TL_premium_myBoosts() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_premium_MyBoosts.TL_premium_myBoosts::class,
          space.axolab.axogram.tgnet.tl.TL_stories.TL_premium_myBoosts::TLdeserialize, null)

    }

    @Test
    public fun test_premium_BoostsStatus_TL_premium_boostsStatus() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_premium_BoostsStatus.TL_premium_boostsStatus::class,
          space.axolab.axogram.tgnet.tl.TL_stories.TL_premium_boostsStatus::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateChannelViewForumAsMessages() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateChannelViewForumAsMessages::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updatePeerWallpaper() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updatePeerWallpaper::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_StoryFwdHeader_TL_storyFwdHeader() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StoryFwdHeader.TL_storyFwdHeader::class,
          space.axolab.axogram.tgnet.tl.TL_stories.StoryFwdHeader::TLdeserialize, null)

    }

    @Test
    public fun test_PostInteractionCounters_TL_postInteractionCountersMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PostInteractionCounters.TL_postInteractionCountersMessage::class,
          space.axolab.axogram.tgnet.tl.TL_stats.PostInteractionCounters::TLdeserialize, null)

    }

    @Test
    public fun test_PostInteractionCounters_TL_postInteractionCountersStory() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PostInteractionCounters.TL_postInteractionCountersStory::class,
          space.axolab.axogram.tgnet.tl.TL_stats.PostInteractionCounters::TLdeserialize, null)

    }

    @Test
    public fun test_stats_StoryStats_TL_stats_storyStats() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_stats_StoryStats.TL_stats_storyStats::class,
          space.axolab.axogram.tgnet.tl.TL_stories.TL_stats_storyStats::TLdeserialize, null)

    }

    @Test
    public fun test_PublicForward_TL_publicForwardMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PublicForward.TL_publicForwardMessage::class,
          space.axolab.axogram.tgnet.tl.TL_stats.PublicForward::TLdeserialize, null)

    }

    @Test
    public fun test_PublicForward_TL_publicForwardStory() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PublicForward.TL_publicForwardStory::class,
          space.axolab.axogram.tgnet.tl.TL_stats.PublicForward::TLdeserialize, null)

    }

    @Test
    public fun test_stats_PublicForwards_TL_stats_publicForwards() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_stats_PublicForwards.TL_stats_publicForwards::class,
          space.axolab.axogram.tgnet.tl.TL_stats.TL_publicForwards::TLdeserialize, null)

    }

    @Test
    public fun test_PeerColor_TL_peerColor() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PeerColor.TL_peerColor::class,
          space.axolab.axogram.tgnet.TLRPC.PeerColor::TLdeserialize, null)

    }

    @Test
    public fun test_help_PeerColorSet_TL_help_peerColorSet() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_help_PeerColorSet.TL_help_peerColorSet::class,
          space.axolab.axogram.tgnet.TLRPC.help_PeerColorSet::TLdeserialize, null)

    }

    @Test
    public fun test_help_PeerColorSet_TL_help_peerColorProfileSet() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_help_PeerColorSet.TL_help_peerColorProfileSet::class,
          space.axolab.axogram.tgnet.TLRPC.help_PeerColorSet::TLdeserialize, null)

    }

    @Test
    public fun test_help_PeerColors_TL_help_peerColorsNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_help_PeerColors.TL_help_peerColorsNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.help_PeerColors::TLdeserialize, null)

    }

    @Test
    public fun test_help_PeerColors_TL_help_peerColors() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_help_PeerColors.TL_help_peerColors::class,
          space.axolab.axogram.tgnet.TLRPC.help_PeerColors::TLdeserialize, null)

    }

    @Test
    public fun test_StoryReaction_TL_storyReaction() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StoryReaction.TL_storyReaction::class,
          space.axolab.axogram.tgnet.tl.TL_stories.StoryReaction::TLdeserialize, null)

    }

    @Test
    public fun test_StoryReaction_TL_storyReactionPublicForward() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StoryReaction.TL_storyReactionPublicForward::class,
          space.axolab.axogram.tgnet.tl.TL_stories.StoryReaction::TLdeserialize, null)

    }

    @Test
    public fun test_StoryReaction_TL_storyReactionPublicRepost() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StoryReaction.TL_storyReactionPublicRepost::class,
          space.axolab.axogram.tgnet.tl.TL_stories.StoryReaction::TLdeserialize, null)

    }

    @Test
    public fun test_stories_StoryReactionsList_TL_stories_storyReactionsList() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_stories_StoryReactionsList.TL_stories_storyReactionsList::class,
          space.axolab.axogram.tgnet.tl.TL_stories.TL_storyReactionsList::TLdeserialize, null)

    }

    @Test
    public fun test_StoryView_TL_storyViewPublicForward() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StoryView.TL_storyViewPublicForward::class,
          space.axolab.axogram.tgnet.tl.TL_stories.StoryView::TLdeserialize, null)

    }

    @Test
    public fun test_StoryView_TL_storyViewPublicRepost() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StoryView.TL_storyViewPublicRepost::class,
          space.axolab.axogram.tgnet.tl.TL_stories.StoryView::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionChangePeerColor() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionChangePeerColor::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public
        fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionChangeProfilePeerColor() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionChangeProfilePeerColor::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionChangeWallpaper() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionChangeWallpaper::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionChangeEmojiStatus() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionChangeEmojiStatus::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_InputStickerSet_TL_inputStickerSetEmojiChannelDefaultStatuses() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputStickerSet.TL_inputStickerSetEmojiChannelDefaultStatuses::class,
          space.axolab.axogram.tgnet.TLRPC.InputStickerSet::TLdeserialize, null)

    }

    @Test
    public fun test_MediaArea_TL_mediaAreaChannelPost() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MediaArea.TL_mediaAreaChannelPost::class,
          space.axolab.axogram.tgnet.tl.TL_stories.MediaArea::TLdeserialize, null)

    }

    @Test
    public fun test_MediaArea_TL_inputMediaAreaChannelPost() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MediaArea.TL_inputMediaAreaChannelPost::class,
          space.axolab.axogram.tgnet.tl.TL_stories.MediaArea::TLdeserialize, null)

    }

    @Test
    public fun test_SavedDialog_TL_savedDialog() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SavedDialog.TL_savedDialog::class,
          space.axolab.axogram.tgnet.TLRPC.savedDialog::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateSavedDialogPinned() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateSavedDialogPinned::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updatePinnedSavedDialogs() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updatePinnedSavedDialogs::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_messages_SavedDialogs_TL_messages_savedDialogs() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_SavedDialogs.TL_messages_savedDialogs::class,
          space.axolab.axogram.tgnet.TLRPC.messages_SavedDialogs::TLdeserialize, null)

    }

    @Test
    public fun test_messages_SavedDialogs_TL_messages_savedDialogsSlice() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_SavedDialogs.TL_messages_savedDialogsSlice::class,
          space.axolab.axogram.tgnet.TLRPC.messages_SavedDialogs::TLdeserialize, null)

    }

    @Test
    public fun test_messages_SavedDialogs_TL_messages_savedDialogsNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_SavedDialogs.TL_messages_savedDialogsNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.messages_SavedDialogs::TLdeserialize, null)

    }

    @Test
    public fun test_SavedReactionTag_TL_savedReactionTag() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SavedReactionTag.TL_savedReactionTag::class,
          space.axolab.axogram.tgnet.TLRPC.TL_savedReactionTag::TLdeserialize, null)

    }

    @Test
    public fun test_messages_SavedReactionTags_TL_messages_savedReactionTagsNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_SavedReactionTags.TL_messages_savedReactionTagsNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.messages_SavedReactionTags::TLdeserialize, null)

    }

    @Test
    public fun test_messages_SavedReactionTags_TL_messages_savedReactionTags() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_SavedReactionTags.TL_messages_savedReactionTags::class,
          space.axolab.axogram.tgnet.TLRPC.messages_SavedReactionTags::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateSavedReactionTags() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateSavedReactionTags::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_UserStatus_TL_userStatusRecently() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserStatus.TL_userStatusRecently::class,
          space.axolab.axogram.tgnet.TLRPC.UserStatus::TLdeserialize, null)

    }

    @Test
    public fun test_UserStatus_TL_userStatusLastWeek() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserStatus.TL_userStatusLastWeek::class,
          space.axolab.axogram.tgnet.TLRPC.UserStatus::TLdeserialize, null)

    }

    @Test
    public fun test_UserStatus_TL_userStatusLastMonth() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserStatus.TL_userStatusLastMonth::class,
          space.axolab.axogram.tgnet.TLRPC.UserStatus::TLdeserialize, null)

    }

    @Test
    public fun test_OutboxReadDate_TL_outboxReadDate() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_OutboxReadDate.TL_outboxReadDate::class,
          space.axolab.axogram.tgnet.TLRPC.TL_outboxReadDate::TLdeserialize, null)

    }

    @Test
    public fun test_InputReplyTo_TL_inputReplyToStory() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputReplyTo.TL_inputReplyToStory::class,
          space.axolab.axogram.tgnet.TLRPC.InputReplyTo::TLdeserialize, null)

    }

    @Test
    public fun test_MessageReplyHeader_TL_messageReplyStoryHeader() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageReplyHeader.TL_messageReplyStoryHeader::class,
          space.axolab.axogram.tgnet.TLRPC.MessageReplyHeader::TLdeserialize, null)

    }

    @Test
    public fun test_help_PeerColorOption_TL_help_peerColorOption() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_help_PeerColorOption.TL_help_peerColorOption::class,
          space.axolab.axogram.tgnet.TLRPC.TL_help_peerColorOption::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionBoostApply() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionBoostApply::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public
        fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionChangeEmojiStickerSet() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionChangeEmojiStickerSet::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_BusinessWeeklyOpen_TL_businessWeeklyOpen() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BusinessWeeklyOpen.TL_businessWeeklyOpen::class,
          space.axolab.axogram.tgnet.tl.TL_account.TL_businessWeeklyOpen::TLdeserialize, null)

    }

    @Test
    public fun test_BusinessWorkHours_TL_businessWorkHours() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BusinessWorkHours.TL_businessWorkHours::class,
          space.axolab.axogram.tgnet.tl.TL_account.TL_businessWorkHours::TLdeserialize, null)

    }

    @Test
    public fun test_BusinessLocation_TL_businessLocation() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BusinessLocation.TL_businessLocation::class,
          space.axolab.axogram.tgnet.TLRPC.TL_businessLocation::TLdeserialize, null)

    }

    @Test
    public fun test_InputBusinessRecipients_TL_inputBusinessRecipients() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputBusinessRecipients.TL_inputBusinessRecipients::class,
          space.axolab.axogram.tgnet.tl.TL_account.TL_inputBusinessRecipients::TLdeserialize, null)

    }

    @Test
    public fun test_BusinessRecipients_TL_businessRecipients() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BusinessRecipients.TL_businessRecipients::class,
          space.axolab.axogram.tgnet.tl.TL_account.TL_businessRecipients::TLdeserialize, null)

    }

    @Test
    public fun test_BusinessAwayMessageSchedule_TL_businessAwayMessageScheduleAlways() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BusinessAwayMessageSchedule.TL_businessAwayMessageScheduleAlways::class,
          space.axolab.axogram.tgnet.tl.TL_account.BusinessAwayMessageSchedule::TLdeserialize, null)

    }

    @Test
    public fun test_BusinessAwayMessageSchedule_TL_businessAwayMessageScheduleOutsideWorkHours() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BusinessAwayMessageSchedule.TL_businessAwayMessageScheduleOutsideWorkHours::class,
          space.axolab.axogram.tgnet.tl.TL_account.BusinessAwayMessageSchedule::TLdeserialize, null)

    }

    @Test
    public fun test_BusinessAwayMessageSchedule_TL_businessAwayMessageScheduleCustom() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BusinessAwayMessageSchedule.TL_businessAwayMessageScheduleCustom::class,
          space.axolab.axogram.tgnet.tl.TL_account.BusinessAwayMessageSchedule::TLdeserialize, null)

    }

    @Test
    public fun test_BusinessGreetingMessage_TL_businessGreetingMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BusinessGreetingMessage.TL_businessGreetingMessage::class,
          space.axolab.axogram.tgnet.tl.TL_account.TL_businessGreetingMessage::TLdeserialize, null)

    }

    @Test
    public fun test_BusinessAwayMessage_TL_businessAwayMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BusinessAwayMessage.TL_businessAwayMessage::class,
          space.axolab.axogram.tgnet.tl.TL_account.TL_businessAwayMessage::TLdeserialize, null)

    }

    @Test
    public fun test_Timezone_TL_timezone() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Timezone.TL_timezone::class,
          space.axolab.axogram.tgnet.TLRPC.TL_timezone::TLdeserialize, null)

    }

    @Test
    public fun test_help_TimezonesList_TL_help_timezonesListNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_help_TimezonesList.TL_help_timezonesListNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.help_timezonesList::TLdeserialize, null)

    }

    @Test
    public fun test_help_TimezonesList_TL_help_timezonesList() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_help_TimezonesList.TL_help_timezonesList::class,
          space.axolab.axogram.tgnet.TLRPC.help_timezonesList::TLdeserialize, null)

    }

    @Test
    public fun test_QuickReply_TL_quickReply() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_QuickReply.TL_quickReply::class,
          space.axolab.axogram.tgnet.TLRPC.TL_quickReply::TLdeserialize, null)

    }

    @Test
    public fun test_InputQuickReplyShortcut_TL_inputQuickReplyShortcut() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputQuickReplyShortcut.TL_inputQuickReplyShortcut::class,
          space.axolab.axogram.tgnet.TLRPC.InputQuickReplyShortcut::TLdeserialize, null)

    }

    @Test
    public fun test_InputQuickReplyShortcut_TL_inputQuickReplyShortcutId() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputQuickReplyShortcut.TL_inputQuickReplyShortcutId::class,
          space.axolab.axogram.tgnet.TLRPC.InputQuickReplyShortcut::TLdeserialize, null)

    }

    @Test
    public fun test_messages_QuickReplies_TL_messages_quickReplies() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_QuickReplies.TL_messages_quickReplies::class,
          space.axolab.axogram.tgnet.TLRPC.messages_quickReplies::TLdeserialize, null)

    }

    @Test
    public fun test_messages_QuickReplies_TL_messages_quickRepliesNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_QuickReplies.TL_messages_quickRepliesNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.messages_quickReplies::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateQuickReplies() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateQuickReplies::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateNewQuickReply() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateNewQuickReply::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateDeleteQuickReply() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateDeleteQuickReply::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateQuickReplyMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateQuickReplyMessage::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateDeleteQuickReplyMessages() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateDeleteQuickReplyMessages::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_account_ConnectedBots_TL_account_connectedBots() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_ConnectedBots.TL_account_connectedBots::class,
          space.axolab.axogram.tgnet.tl.TL_account.connectedBots::TLdeserialize, null)

    }

    @Test
    public fun test_messages_DialogFilters_TL_messages_dialogFilters() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_DialogFilters.TL_messages_dialogFilters::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_dialogFilters::TLdeserialize, null)

    }

    @Test
    public fun test_PhoneCall_TL_phoneCall() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PhoneCall.TL_phoneCall::class,
          space.axolab.axogram.tgnet.tl.TL_phone.PhoneCall::TLdeserialize, null)

    }

    @Test
    public fun test_Birthday_TL_birthday() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Birthday.TL_birthday::class,
          space.axolab.axogram.tgnet.tl.TL_account.TL_birthday::TLdeserialize, null)

    }

    @Test
    public fun test_InputBusinessIntro_TL_inputBusinessIntro() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputBusinessIntro.TL_inputBusinessIntro::class,
          space.axolab.axogram.tgnet.tl.TL_account.TL_inputBusinessIntro::TLdeserialize, null)

    }

    @Test
    public fun test_BusinessIntro_TL_businessIntro() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BusinessIntro.TL_businessIntro::class,
          space.axolab.axogram.tgnet.tl.TL_account.TL_businessIntro::TLdeserialize, null)

    }

    @Test
    public fun test_messages_MyStickers_TL_messages_myStickers() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_MyStickers.TL_messages_myStickers::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_myStickers::TLdeserialize, null)

    }

    @Test
    public fun test_InputCollectible_TL_inputCollectibleUsername() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputCollectible.TL_inputCollectibleUsername::class,
          space.axolab.axogram.tgnet.tl.TL_fragment.InputCollectible::TLdeserialize, null)

    }

    @Test
    public fun test_InputCollectible_TL_inputCollectiblePhone() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputCollectible.TL_inputCollectiblePhone::class,
          space.axolab.axogram.tgnet.tl.TL_fragment.InputCollectible::TLdeserialize, null)

    }

    @Test
    public fun test_fragment_CollectibleInfo_TL_fragment_collectibleInfo() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_fragment_CollectibleInfo.TL_fragment_collectibleInfo::class,
          space.axolab.axogram.tgnet.tl.TL_fragment.TL_collectibleInfo::TLdeserialize, null)

    }

    @Test
    public fun test_InputBusinessBotRecipients_TL_inputBusinessBotRecipients() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputBusinessBotRecipients.TL_inputBusinessBotRecipients::class,
          space.axolab.axogram.tgnet.tl.TL_account.TL_inputBusinessBotRecipients::TLdeserialize,
          null)

    }

    @Test
    public fun test_BusinessBotRecipients_TL_businessBotRecipients() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BusinessBotRecipients.TL_businessBotRecipients::class,
          space.axolab.axogram.tgnet.tl.TL_account.TL_businessBotRecipients::TLdeserialize, null)

    }

    @Test
    public fun test_ContactBirthday_TL_contactBirthday() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ContactBirthday.TL_contactBirthday::class,
          space.axolab.axogram.tgnet.tl.TL_account.TL_contactBirthday::TLdeserialize, null)

    }

    @Test
    public fun test_contacts_ContactBirthdays_TL_contacts_contactBirthdays() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_contacts_ContactBirthdays.TL_contacts_contactBirthdays::class,
          space.axolab.axogram.tgnet.tl.TL_account.contactBirthdays::TLdeserialize, null)

    }

    @Test
    public fun test_InputPrivacyKey_TL_inputPrivacyKeyBirthday() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPrivacyKey.TL_inputPrivacyKeyBirthday::class,
          space.axolab.axogram.tgnet.TLRPC.InputPrivacyKey::TLdeserialize, null)

    }

    @Test
    public fun test_PrivacyKey_TL_privacyKeyBirthday() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PrivacyKey.TL_privacyKeyBirthday::class,
          space.axolab.axogram.tgnet.TLRPC.PrivacyKey::TLdeserialize, null)

    }

    @Test
    public fun test_InputPrivacyRule_TL_inputPrivacyValueAllowPremium() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPrivacyRule.TL_inputPrivacyValueAllowPremium::class,
          space.axolab.axogram.tgnet.TLRPC.InputPrivacyRule::TLdeserialize, null)

    }

    @Test
    public fun test_PrivacyRule_TL_privacyValueAllowPremium() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PrivacyRule.TL_privacyValueAllowPremium::class,
          space.axolab.axogram.tgnet.TLRPC.PrivacyRule::TLdeserialize, null)

    }

    @Test
    public fun test_MissingInvitee_TL_missingInvitee() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MissingInvitee.TL_missingInvitee::class,
          space.axolab.axogram.tgnet.TLRPC.TL_missingInvitee::TLdeserialize, null)

    }

    @Test
    public fun test_messages_InvitedUsers_TL_messages_invitedUsers() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_InvitedUsers.TL_messages_invitedUsers::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_invitedUsers::TLdeserialize, null)

    }

    @Test
    public fun test_InputBusinessChatLink_TL_inputBusinessChatLink() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputBusinessChatLink.TL_inputBusinessChatLink::class,
          space.axolab.axogram.tgnet.tl.TL_account.TL_inputBusinessChatLink::TLdeserialize, null)

    }

    @Test
    public fun test_BusinessChatLink_TL_businessChatLink() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BusinessChatLink.TL_businessChatLink::class,
          space.axolab.axogram.tgnet.tl.TL_account.TL_businessChatLink::TLdeserialize, null)

    }

    @Test
    public fun test_account_BusinessChatLinks_TL_account_businessChatLinks() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_BusinessChatLinks.TL_account_businessChatLinks::class,
          space.axolab.axogram.tgnet.tl.TL_account.businessChatLinks::TLdeserialize, null)

    }

    @Test
    public fun test_account_ResolvedBusinessChatLinks_TL_account_resolvedBusinessChatLinks() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_ResolvedBusinessChatLinks.TL_account_resolvedBusinessChatLinks::class,
          space.axolab.axogram.tgnet.tl.TL_account.resolvedBusinessChatLinks::TLdeserialize, null)

    }

    @Test
    public fun test_SponsoredMessageReportOption_TL_sponsoredMessageReportOption() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SponsoredMessageReportOption.TL_sponsoredMessageReportOption::class,
          space.axolab.axogram.tgnet.TLRPC.TL_sponsoredMessageReportOption::TLdeserialize, null)

    }

    @Test
    public
        fun test_channels_SponsoredMessageReportResult_TL_channels_sponsoredMessageReportResultChooseOption() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_channels_SponsoredMessageReportResult.TL_channels_sponsoredMessageReportResultChooseOption::class,
          space.axolab.axogram.tgnet.TLRPC.channels_SponsoredMessageReportResult::TLdeserialize,
          null)

    }

    @Test
    public
        fun test_channels_SponsoredMessageReportResult_TL_channels_sponsoredMessageReportResultAdsHidden() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_channels_SponsoredMessageReportResult.TL_channels_sponsoredMessageReportResultAdsHidden::class,
          space.axolab.axogram.tgnet.TLRPC.channels_SponsoredMessageReportResult::TLdeserialize,
          null)

    }

    @Test
    public
        fun test_channels_SponsoredMessageReportResult_TL_channels_sponsoredMessageReportResultReported() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_channels_SponsoredMessageReportResult.TL_channels_sponsoredMessageReportResultReported::class,
          space.axolab.axogram.tgnet.TLRPC.channels_SponsoredMessageReportResult::TLdeserialize,
          null)

    }

    @Test
    public fun test_ChatFull_TL_chatFull() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_chatFull::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, null)

    }

    @Test
    public fun test_stories_Stories_TL_stories_stories() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_stories_Stories.TL_stories_stories::class,
          space.axolab.axogram.tgnet.tl.TL_stories.TL_stories_stories::TLdeserialize, null)

    }

    @Test
    public fun test_WebPageAttribute_TL_webPageAttributeStickerSet() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_WebPageAttribute.TL_webPageAttributeStickerSet::class,
          space.axolab.axogram.tgnet.TLRPC.WebPageAttribute::TLdeserialize, null)

    }

    @Test
    public fun test_ReactionNotificationsFrom_TL_reactionNotificationsFromContacts() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ReactionNotificationsFrom.TL_reactionNotificationsFromContacts::class,
          space.axolab.axogram.tgnet.tl.TL_account.ReactionNotificationsFrom::TLdeserialize, null)

    }

    @Test
    public fun test_ReactionNotificationsFrom_TL_reactionNotificationsFromAll() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ReactionNotificationsFrom.TL_reactionNotificationsFromAll::class,
          space.axolab.axogram.tgnet.tl.TL_account.ReactionNotificationsFrom::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateNewStoryReaction() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateNewStoryReaction::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_auth_SentCodeType_TL_auth_sentCodeTypeSmsWord() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_auth_SentCodeType.TL_auth_sentCodeTypeSmsWord::class,
          space.axolab.axogram.tgnet.TLRPC.auth_SentCodeType::TLdeserialize, null)

    }

    @Test
    public fun test_auth_SentCodeType_TL_auth_sentCodeTypeSmsPhrase() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_auth_SentCodeType.TL_auth_sentCodeTypeSmsPhrase::class,
          space.axolab.axogram.tgnet.TLRPC.auth_SentCodeType::TLdeserialize, null)

    }

    @Test
    public fun test_EmojiGroup_TL_emojiGroupGreeting() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_EmojiGroup.TL_emojiGroupGreeting::class,
          space.axolab.axogram.tgnet.TLRPC.EmojiGroup::TLdeserialize, null)

    }

    @Test
    public fun test_EmojiGroup_TL_emojiGroupPremium() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_EmojiGroup.TL_emojiGroupPremium::class,
          space.axolab.axogram.tgnet.TLRPC.EmojiGroup::TLdeserialize, null)

    }

    @Test
    public fun test_AvailableEffect_TL_availableEffect() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_AvailableEffect.TL_availableEffect::class,
          space.axolab.axogram.tgnet.TLRPC.TL_availableEffect::TLdeserialize, null)

    }

    @Test
    public fun test_messages_AvailableEffects_TL_messages_availableEffectsNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_AvailableEffects.TL_messages_availableEffectsNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.messages_AvailableEffects::TLdeserialize, null)

    }

    @Test
    public fun test_messages_AvailableEffects_TL_messages_availableEffects() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_AvailableEffects.TL_messages_availableEffects::class,
          space.axolab.axogram.tgnet.TLRPC.messages_AvailableEffects::TLdeserialize, null)

    }

    @Test
    public fun test_InputMedia_TL_inputMediaInvoice() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputMedia.TL_inputMediaInvoice::class,
          space.axolab.axogram.tgnet.TLRPC.InputMedia::TLdeserialize, null)

    }

    @Test
    public fun test_MessageEntity_TL_messageEntityBlockquote() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageEntity.TL_messageEntityBlockquote::class,
          space.axolab.axogram.tgnet.TLRPC.MessageEntity::TLdeserialize, null)

    }

    @Test
    public fun test_FactCheck_TL_factCheck() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_FactCheck.TL_factCheck::class,
          space.axolab.axogram.tgnet.TLRPC.TL_factCheck::TLdeserialize, null)

    }

    @Test
    public fun test_StarsTransactionPeer_TL_starsTransactionPeerUnsupported() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarsTransactionPeer.TL_starsTransactionPeerUnsupported::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarsTransactionPeer::TLdeserialize, null)

    }

    @Test
    public fun test_StarsTransactionPeer_TL_starsTransactionPeerAppStore() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarsTransactionPeer.TL_starsTransactionPeerAppStore::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarsTransactionPeer::TLdeserialize, null)

    }

    @Test
    public fun test_StarsTransactionPeer_TL_starsTransactionPeerPlayMarket() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarsTransactionPeer.TL_starsTransactionPeerPlayMarket::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarsTransactionPeer::TLdeserialize, null)

    }

    @Test
    public fun test_StarsTransactionPeer_TL_starsTransactionPeerPremiumBot() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarsTransactionPeer.TL_starsTransactionPeerPremiumBot::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarsTransactionPeer::TLdeserialize, null)

    }

    @Test
    public fun test_StarsTransactionPeer_TL_starsTransactionPeerFragment() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarsTransactionPeer.TL_starsTransactionPeerFragment::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarsTransactionPeer::TLdeserialize, null)

    }

    @Test
    public fun test_StarsTransactionPeer_TL_starsTransactionPeer() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarsTransactionPeer.TL_starsTransactionPeer::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarsTransactionPeer::TLdeserialize, null)

    }

    @Test
    public fun test_StarsTopupOption_TL_starsTopupOption() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarsTopupOption.TL_starsTopupOption::class,
          space.axolab.axogram.tgnet.tl.TL_stars.TL_starsTopupOption::TLdeserialize, null)

    }

    @Test
    public fun test_payments_PaymentForm_TL_payments_paymentFormStars() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_PaymentForm.TL_payments_paymentFormStars::class,
          space.axolab.axogram.tgnet.TLRPC.PaymentForm::TLdeserialize, null)

    }

    @Test
    public fun test_payments_PaymentReceipt_TL_payments_paymentReceiptStars() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_PaymentReceipt.TL_payments_paymentReceiptStars::class,
          space.axolab.axogram.tgnet.TLRPC.PaymentReceipt::TLdeserialize, null)

    }

    @Test
    public fun test_MediaAreaCoordinates_TL_mediaAreaCoordinates() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MediaAreaCoordinates.TL_mediaAreaCoordinates::class,
          space.axolab.axogram.tgnet.tl.TL_stories.MediaAreaCoordinates::TLdeserialize, null)

    }

    @Test
    public fun test_MediaArea_TL_mediaAreaGeoPoint() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MediaArea.TL_mediaAreaGeoPoint::class,
          space.axolab.axogram.tgnet.tl.TL_stories.MediaArea::TLdeserialize, null)

    }

    @Test
    public fun test_MediaArea_TL_mediaAreaUrl() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MediaArea.TL_mediaAreaUrl::class,
          space.axolab.axogram.tgnet.tl.TL_stories.MediaArea::TLdeserialize, null)

    }

    @Test
    public fun test_FoundStory_TL_foundStory() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_FoundStory.TL_foundStory::class,
          space.axolab.axogram.tgnet.tl.TL_stories.TL_foundStory::TLdeserialize, null)

    }

    @Test
    public fun test_stories_FoundStories_TL_stories_foundStories() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_stories_FoundStories.TL_stories_foundStories::class,
          space.axolab.axogram.tgnet.tl.TL_stories.TL_foundStories::TLdeserialize, null)

    }

    @Test
    public fun test_GeoPointAddress_TL_geoPointAddress() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_GeoPointAddress.TL_geoPointAddress::class,
          space.axolab.axogram.tgnet.tl.TL_stories.TL_geoPointAddress::TLdeserialize, null)

    }

    @Test
    public fun test_payments_StarsRevenueWithdrawalUrl_TL_payments_starsRevenueWithdrawalUrl() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_StarsRevenueWithdrawalUrl.TL_payments_starsRevenueWithdrawalUrl::class,
          space.axolab.axogram.tgnet.TLRPC.TL_payments_starsRevenueWithdrawalUrl::TLdeserialize,
          null)

    }

    @Test
    public fun test_Update_TL_updateStarsRevenueStatus() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateStarsRevenueStatus::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_WebViewResult_TL_webViewResultUrl() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_WebViewResult.TL_webViewResultUrl::class,
          space.axolab.axogram.tgnet.TLRPC.TL_webViewResultUrl::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateMessageExtendedMedia() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateMessageExtendedMedia::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_auth_SentCodeType_TL_auth_sentCodeTypeFirebaseSms() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_auth_SentCodeType.TL_auth_sentCodeTypeFirebaseSms::class,
          space.axolab.axogram.tgnet.TLRPC.auth_SentCodeType::TLdeserialize, null)

    }

    @Test
    public fun test_MessageMedia_TL_messageMediaPaidMedia() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaPaidMedia::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_StarsTransactionPeer_TL_starsTransactionPeerAds() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarsTransactionPeer.TL_starsTransactionPeerAds::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarsTransactionPeer::TLdeserialize, null)

    }

    @Test
    public fun test_payments_StarsRevenueAdsAccountUrl_TL_payments_starsRevenueAdsAccountUrl() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_StarsRevenueAdsAccountUrl.TL_payments_starsRevenueAdsAccountUrl::class,
          space.axolab.axogram.tgnet.TLRPC.TL_payments_starsRevenueAdsAccountUrl::TLdeserialize,
          null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionPaymentRefunded() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionPaymentRefunded::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_InputInvoice_TL_inputInvoiceStars() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputInvoice.TL_inputInvoiceStars::class,
          space.axolab.axogram.tgnet.TLRPC.InputInvoice::TLdeserialize, null)

    }

    @Test
    public fun test_InputStorePaymentPurpose_TL_inputStorePaymentStarsGift() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputStorePaymentPurpose.TL_inputStorePaymentStarsGift::class,
          space.axolab.axogram.tgnet.TLRPC.InputStorePaymentPurpose::TLdeserialize, null)

    }

    @Test
    public fun test_StarsGiftOption_TL_starsGiftOption() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarsGiftOption.TL_starsGiftOption::class,
          space.axolab.axogram.tgnet.tl.TL_stars.TL_starsGiftOption::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionGiftStars() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionGiftStars::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_TopPeerCategory_TL_topPeerCategoryBotsApp() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_TopPeerCategory.TL_topPeerCategoryBotsApp::class,
          space.axolab.axogram.tgnet.TLRPC.TopPeerCategory::TLdeserialize, null)

    }

    @Test
    public fun test_bots_PopularAppBots_TL_bots_popularAppBots() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_bots_PopularAppBots.TL_bots_popularAppBots::class,
          space.axolab.axogram.tgnet.tl.TL_bots.popularAppBots::TLdeserialize, null)

    }

    @Test
    public fun test_BotPreviewMedia_TL_botPreviewMedia() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BotPreviewMedia.TL_botPreviewMedia::class,
          space.axolab.axogram.tgnet.tl.TL_bots.botPreviewMedia::TLdeserialize, null)

    }

    @Test
    public fun test_bots_PreviewInfo_TL_bots_previewInfo() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_bots_PreviewInfo.TL_bots_previewInfo::class,
          space.axolab.axogram.tgnet.tl.TL_bots.previewInfo::TLdeserialize, null)

    }

    @Test
    public fun test_MediaArea_TL_mediaAreaWeather() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MediaArea.TL_mediaAreaWeather::class,
          space.axolab.axogram.tgnet.tl.TL_stories.MediaArea::TLdeserialize, null)

    }

    @Test
    public fun test_InputFile_TL_inputFileStoryDocument() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputFile.TL_inputFileStoryDocument::class,
          space.axolab.axogram.tgnet.TLRPC.InputFile::TLdeserialize, null)

    }

    @Test
    public fun test_ExportedChatInvite_TL_chatInviteExported() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ExportedChatInvite.TL_chatInviteExported::class,
          space.axolab.axogram.tgnet.TLRPC.ExportedChatInvite::TLdeserialize, null)

    }

    @Test
    public fun test_MessageReactions_TL_messageReactions() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageReactions.TL_messageReactions::class,
          space.axolab.axogram.tgnet.TLRPC.MessageReactions::TLdeserialize, null)

    }

    @Test
    public fun test_InputInvoice_TL_inputInvoiceChatInviteSubscription() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputInvoice.TL_inputInvoiceChatInviteSubscription::class,
          space.axolab.axogram.tgnet.TLRPC.InputInvoice::TLdeserialize, null)

    }

    @Test
    public fun test_StarsSubscriptionPricing_TL_starsSubscriptionPricing() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarsSubscriptionPricing.TL_starsSubscriptionPricing::class,
          space.axolab.axogram.tgnet.tl.TL_stars.TL_starsSubscriptionPricing::TLdeserialize, null)

    }

    @Test
    public fun test_Reaction_TL_reactionPaid() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Reaction.TL_reactionPaid::class,
          space.axolab.axogram.tgnet.TLRPC.Reaction::TLdeserialize, null)

    }

    @Test
    public fun test_MessageReactor_TL_messageReactor() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageReactor.TL_messageReactor::class,
          space.axolab.axogram.tgnet.TLRPC.MessageReactor::TLdeserialize, null)

    }

    @Test
    public
        fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionToggleSignatureProfiles() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionToggleSignatureProfiles::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_MessageMedia_TL_messageMediaGiveaway() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaGiveaway::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionGiveawayLaunch() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionGiveawayLaunch::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_payments_GiveawayInfo_TL_payments_giveawayInfoResults() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_GiveawayInfo.TL_payments_giveawayInfoResults::class,
          space.axolab.axogram.tgnet.TLRPC.payments_GiveawayInfo::TLdeserialize, null)

    }

    @Test
    public fun test_Boost_TL_boost() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Boost.TL_boost::class,
          space.axolab.axogram.tgnet.tl.TL_stories.Boost::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionGiveawayResults() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionGiveawayResults::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_MessageMedia_TL_messageMediaGiveawayResults() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaGiveawayResults::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_InputMedia_TL_inputMediaPaidMedia() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputMedia.TL_inputMediaPaidMedia::class,
          space.axolab.axogram.tgnet.TLRPC.InputMedia::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateBotPurchasedPaidMedia() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateBotPurchasedPaidMedia::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionParticipantSubExtend() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionParticipantSubExtend::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_InputStorePaymentPurpose_TL_inputStorePaymentStarsGiveaway() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputStorePaymentPurpose.TL_inputStorePaymentStarsGiveaway::class,
          space.axolab.axogram.tgnet.TLRPC.InputStorePaymentPurpose::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionPrizeStars() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionPrizeStars::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_StarsGiveawayOption_TL_starsGiveawayOption() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarsGiveawayOption.TL_starsGiveawayOption::class,
          space.axolab.axogram.tgnet.tl.TL_stars.TL_starsGiveawayOption::TLdeserialize, null)

    }

    @Test
    public fun test_StarsGiveawayWinnersOption_TL_starsGiveawayWinnersOption() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarsGiveawayWinnersOption.TL_starsGiveawayWinnersOption::class,
          space.axolab.axogram.tgnet.tl.TL_stars.TL_starsGiveawayWinnersOption::TLdeserialize, null)

    }

    @Test
    public fun test_PrepaidGiveaway_TL_prepaidStarsGiveaway() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PrepaidGiveaway.TL_prepaidStarsGiveaway::class,
          space.axolab.axogram.tgnet.tl.TL_stories.PrepaidGiveaway::TLdeserialize, null)

    }

    @Test
    public fun test_DocumentAttribute_TL_documentAttributeVideo() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DocumentAttribute.TL_documentAttributeVideo::class,
          space.axolab.axogram.tgnet.TLRPC.DocumentAttribute::TLdeserialize, null)

    }

    @Test
    public fun test_payments_StarGifts_TL_payments_starGiftsNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_StarGifts.TL_payments_starGiftsNotModified::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGifts::TLdeserialize, null)

    }

    @Test
    public fun test_payments_PaymentForm_TL_payments_paymentFormStarGift() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_PaymentForm.TL_payments_paymentFormStarGift::class,
          space.axolab.axogram.tgnet.TLRPC.PaymentForm::TLdeserialize, null)

    }

    @Test
    public fun test_MessageReportOption_TL_messageReportOption() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageReportOption.TL_messageReportOption::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messageReportOption::TLdeserialize, null)

    }

    @Test
    public fun test_ReportResult_TL_reportResultChooseOption() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ReportResult.TL_reportResultChooseOption::class,
          space.axolab.axogram.tgnet.TLRPC.ReportResult::TLdeserialize, null)

    }

    @Test
    public fun test_ReportResult_TL_reportResultAddComment() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ReportResult.TL_reportResultAddComment::class,
          space.axolab.axogram.tgnet.TLRPC.ReportResult::TLdeserialize, null)

    }

    @Test
    public fun test_ReportResult_TL_reportResultReported() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ReportResult.TL_reportResultReported::class,
          space.axolab.axogram.tgnet.TLRPC.ReportResult::TLdeserialize, null)

    }

    @Test
    public fun test_InputStorePaymentPurpose_TL_inputStorePaymentPremiumGiftCode() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputStorePaymentPurpose.TL_inputStorePaymentPremiumGiftCode::class,
          space.axolab.axogram.tgnet.TLRPC.InputStorePaymentPurpose::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateDeleteScheduledMessages() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateDeleteScheduledMessages::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_StarsTransactionPeer_TL_starsTransactionPeerAPI() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarsTransactionPeer.TL_starsTransactionPeerAPI::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarsTransactionPeer::TLdeserialize, null)

    }

    @Test
    public fun test_Invoice_TL_invoice() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Invoice.TL_invoice::class,
          space.axolab.axogram.tgnet.TLRPC.TL_invoice::TLdeserialize, null)

    }

    @Test
    public fun test_StarsSubscription_TL_starsSubscription() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarsSubscription.TL_starsSubscription::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarsSubscription::TLdeserialize, null)

    }

    @Test
    public fun test_messages_PreparedInlineMessage_TL_messages_preparedInlineMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_PreparedInlineMessage.TL_messages_preparedInlineMessage::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_preparedInlineMessage::TLdeserialize, null)

    }

    @Test
    public fun test_BotAppSettings_TL_botAppSettings() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BotAppSettings.TL_botAppSettings::class,
          space.axolab.axogram.tgnet.tl.TL_bots.botAppSettings::TLdeserialize, null)

    }

    @Test
    public fun test_InputPrivacyRule_TL_inputPrivacyValueAllowBots() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPrivacyRule.TL_inputPrivacyValueAllowBots::class,
          space.axolab.axogram.tgnet.TLRPC.InputPrivacyRule::TLdeserialize, null)

    }

    @Test
    public fun test_InputPrivacyRule_TL_inputPrivacyValueDisallowBots() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPrivacyRule.TL_inputPrivacyValueDisallowBots::class,
          space.axolab.axogram.tgnet.TLRPC.InputPrivacyRule::TLdeserialize, null)

    }

    @Test
    public fun test_PrivacyRule_TL_privacyValueAllowBots() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PrivacyRule.TL_privacyValueAllowBots::class,
          space.axolab.axogram.tgnet.TLRPC.PrivacyRule::TLdeserialize, null)

    }

    @Test
    public fun test_PrivacyRule_TL_privacyValueDisallowBots() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PrivacyRule.TL_privacyValueDisallowBots::class,
          space.axolab.axogram.tgnet.TLRPC.PrivacyRule::TLdeserialize, null)

    }

    @Test
    public fun test_InputPrivacyKey_TL_inputPrivacyKeyStarGiftsAutoSave() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPrivacyKey.TL_inputPrivacyKeyStarGiftsAutoSave::class,
          space.axolab.axogram.tgnet.TLRPC.InputPrivacyKey::TLdeserialize, null)

    }

    @Test
    public fun test_PrivacyKey_TL_privacyKeyStarGiftsAutoSave() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PrivacyKey.TL_privacyKeyStarGiftsAutoSave::class,
          space.axolab.axogram.tgnet.TLRPC.PrivacyKey::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionPaymentSentMe() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionPaymentSentMe::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionPaymentSent() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionPaymentSent::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_payments_StarsStatus_TL_payments_starsStatus() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_StarsStatus.TL_payments_starsStatus::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarsStatus::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateStarsBalance() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateStarsBalance::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_StarsRevenueStatus_TL_starsRevenueStatus() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarsRevenueStatus.TL_starsRevenueStatus::class,
          space.axolab.axogram.tgnet.TLRPC.TL_starsRevenueStatus::TLdeserialize, null)

    }

    @Test
    public fun test_StarRefProgram_TL_starRefProgram() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarRefProgram.TL_starRefProgram::class,
          space.axolab.axogram.tgnet.tl.TL_payments.starRefProgram::TLdeserialize, null)

    }

    @Test
    public fun test_ConnectedBotStarRef_TL_connectedBotStarRef() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ConnectedBotStarRef.TL_connectedBotStarRef::class,
          space.axolab.axogram.tgnet.tl.TL_payments.connectedBotStarRef::TLdeserialize, null)

    }

    @Test
    public fun test_payments_ConnectedStarRefBots_TL_payments_connectedStarRefBots() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_ConnectedStarRefBots.TL_payments_connectedStarRefBots::class,
          space.axolab.axogram.tgnet.tl.TL_payments.connectedStarRefBots::TLdeserialize, null)

    }

    @Test
    public fun test_payments_SuggestedStarRefBots_TL_payments_suggestedStarRefBots() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_SuggestedStarRefBots.TL_payments_suggestedStarRefBots::class,
          space.axolab.axogram.tgnet.tl.TL_payments.suggestedStarRefBots::TLdeserialize, null)

    }

    @Test
    public fun test_StarsAmount_TL_starsAmount() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarsAmount.TL_starsAmount::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarsAmount::TLdeserialize, null)

    }

    @Test
    public fun test_messages_FoundStickers_TL_messages_foundStickersNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_FoundStickers.TL_messages_foundStickersNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.messages_FoundStickers::TLdeserialize, null)

    }

    @Test
    public fun test_messages_FoundStickers_TL_messages_foundStickers() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_FoundStickers.TL_messages_foundStickers::class,
          space.axolab.axogram.tgnet.TLRPC.messages_FoundStickers::TLdeserialize, null)

    }

    @Test
    public fun test_ChatInvite_TL_chatInvite() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatInvite.TL_chatInvite::class,
          space.axolab.axogram.tgnet.TLRPC.ChatInvite::TLdeserialize, null)

    }

    @Test
    public fun test_BotInfo_TL_botInfo() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BotInfo.TL_botInfo::class,
          space.axolab.axogram.tgnet.tl.TL_bots.BotInfo::TLdeserialize, null)

    }

    @Test
    public fun test_DialogFilter_TL_dialogFilter() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DialogFilter.TL_dialogFilter::class,
          space.axolab.axogram.tgnet.TLRPC.DialogFilter::TLdeserialize, null)

    }

    @Test
    public fun test_DialogFilter_TL_dialogFilterChatlist() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DialogFilter.TL_dialogFilterChatlist::class,
          space.axolab.axogram.tgnet.TLRPC.DialogFilter::TLdeserialize, null)

    }

    @Test
    public fun test_chatlists_ChatlistInvite_TL_chatlists_chatlistInvite() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_chatlists_ChatlistInvite.TL_chatlists_chatlistInvite::class,
          space.axolab.axogram.tgnet.tl.TL_chatlists.chatlist_ChatlistInvite::TLdeserialize, null)

    }

    @Test
    public fun test_BotVerifierSettings_TL_botVerifierSettings() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BotVerifierSettings.TL_botVerifierSettings::class,
          space.axolab.axogram.tgnet.tl.TL_bots.botVerifierSettings::TLdeserialize, null)

    }

    @Test
    public fun test_BotVerification_TL_botVerification() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BotVerification.TL_botVerification::class,
          space.axolab.axogram.tgnet.tl.TL_bots.botVerification::TLdeserialize, null)

    }

    @Test
    public fun test_users_Users_TL_users_users() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_users_Users.TL_users_users::class,
          space.axolab.axogram.tgnet.TLRPC.Users::TLdeserialize, null)

    }

    @Test
    public fun test_users_Users_TL_users_usersSlice() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_users_Users.TL_users_usersSlice::class,
          space.axolab.axogram.tgnet.TLRPC.Users::TLdeserialize, null)

    }

    @Test
    public fun test_WebPageAttribute_TL_webPageAttributeUniqueStarGift() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_WebPageAttribute.TL_webPageAttributeUniqueStarGift::class,
          space.axolab.axogram.tgnet.TLRPC.WebPageAttribute::TLdeserialize, null)

    }

    @Test
    public fun test_MediaArea_TL_mediaAreaStarGift() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MediaArea.TL_mediaAreaStarGift::class,
          space.axolab.axogram.tgnet.tl.TL_stories.MediaArea::TLdeserialize, null)

    }

    @Test
    public fun test_InputMedia_TL_inputMediaUploadedDocument() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputMedia.TL_inputMediaUploadedDocument::class,
          space.axolab.axogram.tgnet.TLRPC.InputMedia::TLdeserialize, null)

    }

    @Test
    public fun test_InputMedia_TL_inputMediaDocument() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputMedia.TL_inputMediaDocument::class,
          space.axolab.axogram.tgnet.TLRPC.InputMedia::TLdeserialize, null)

    }

    @Test
    public fun test_MessageMedia_TL_messageMediaDocument() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaDocument::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_InputMedia_TL_inputMediaDocumentExternal() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputMedia.TL_inputMediaDocumentExternal::class,
          space.axolab.axogram.tgnet.TLRPC.InputMedia::TLdeserialize, null)

    }

    @Test
    public fun test_EmojiStatus_TL_emojiStatus() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_EmojiStatus.TL_emojiStatus::class,
          space.axolab.axogram.tgnet.TLRPC.EmojiStatus::TLdeserialize, null)

    }

    @Test
    public fun test_InputInvoice_TL_inputInvoiceStarGift() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputInvoice.TL_inputInvoiceStarGift::class,
          space.axolab.axogram.tgnet.TLRPC.InputInvoice::TLdeserialize, null)

    }

    @Test
    public fun test_StarGiftAttribute_TL_starGiftAttributeOriginalDetails() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGiftAttribute.TL_starGiftAttributeOriginalDetails::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGiftAttribute::TLdeserialize, null)

    }

    @Test
    public fun test_InputInvoice_TL_inputInvoiceStarGiftUpgrade() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputInvoice.TL_inputInvoiceStarGiftUpgrade::class,
          space.axolab.axogram.tgnet.TLRPC.InputInvoice::TLdeserialize, null)

    }

    @Test
    public fun test_InputInvoice_TL_inputInvoiceStarGiftTransfer() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputInvoice.TL_inputInvoiceStarGiftTransfer::class,
          space.axolab.axogram.tgnet.TLRPC.InputInvoice::TLdeserialize, null)

    }

    @Test
    public fun test_EmojiStatus_TL_emojiStatusCollectible() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_EmojiStatus.TL_emojiStatusCollectible::class,
          space.axolab.axogram.tgnet.TLRPC.EmojiStatus::TLdeserialize, null)

    }

    @Test
    public fun test_EmojiStatus_TL_inputEmojiStatusCollectible() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_EmojiStatus.TL_inputEmojiStatusCollectible::class,
          space.axolab.axogram.tgnet.TLRPC.EmojiStatus::TLdeserialize, null)

    }

    @Test
    public fun test_payments_SavedStarGifts_TL_payments_savedStarGifts() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_SavedStarGifts.TL_payments_savedStarGifts::class,
          space.axolab.axogram.tgnet.tl.TL_stars.TL_payments_savedStarGifts::TLdeserialize, null)

    }

    @Test
    public fun test_InputSavedStarGift_TL_inputSavedStarGiftUser() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputSavedStarGift.TL_inputSavedStarGiftUser::class,
          space.axolab.axogram.tgnet.tl.TL_stars.InputSavedStarGift::TLdeserialize, null)

    }

    @Test
    public fun test_InputSavedStarGift_TL_inputSavedStarGiftChat() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputSavedStarGift.TL_inputSavedStarGiftChat::class,
          space.axolab.axogram.tgnet.tl.TL_stars.InputSavedStarGift::TLdeserialize, null)

    }

    @Test
    public fun test_payments_StarGiftWithdrawalUrl_TL_payments_starGiftWithdrawalUrl() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_StarGiftWithdrawalUrl.TL_payments_starGiftWithdrawalUrl::class,
          space.axolab.axogram.tgnet.tl.TL_stars.starGiftWithdrawalUrl::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updatePaidReactionPrivacy() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updatePaidReactionPrivacy::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_PaidReactionPrivacy_TL_paidReactionPrivacyDefault() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PaidReactionPrivacy.TL_paidReactionPrivacyDefault::class,
          space.axolab.axogram.tgnet.tl.TL_stars.PaidReactionPrivacy::TLdeserialize, null)

    }

    @Test
    public fun test_PaidReactionPrivacy_TL_paidReactionPrivacyAnonymous() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PaidReactionPrivacy.TL_paidReactionPrivacyAnonymous::class,
          space.axolab.axogram.tgnet.tl.TL_stars.PaidReactionPrivacy::TLdeserialize, null)

    }

    @Test
    public fun test_PaidReactionPrivacy_TL_paidReactionPrivacyPeer() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PaidReactionPrivacy.TL_paidReactionPrivacyPeer::class,
          space.axolab.axogram.tgnet.tl.TL_stars.PaidReactionPrivacy::TLdeserialize, null)

    }

    @Test
    public fun test_PeerSettings_TL_peerSettings() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PeerSettings.TL_peerSettings::class,
          space.axolab.axogram.tgnet.TLRPC.PeerSettings::TLdeserialize, null)

    }

    @Test
    public fun test_InputPrivacyKey_TL_inputPrivacyKeyNoPaidMessages() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPrivacyKey.TL_inputPrivacyKeyNoPaidMessages::class,
          space.axolab.axogram.tgnet.TLRPC.InputPrivacyKey::TLdeserialize, null)

    }

    @Test
    public fun test_PrivacyKey_TL_privacyKeyNoPaidMessages() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PrivacyKey.TL_privacyKeyNoPaidMessages::class,
          space.axolab.axogram.tgnet.TLRPC.PrivacyKey::TLdeserialize, null)

    }

    @Test
    public fun test_account_PaidMessagesRevenue_TL_account_paidMessagesRevenue() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_PaidMessagesRevenue.TL_account_paidMessagesRevenue::class,
          space.axolab.axogram.tgnet.tl.TL_account.paidMessagesRevenue::TLdeserialize, null)

    }

    @Test
    public fun test_RequirementToContact_TL_requirementToContactEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_RequirementToContact.TL_requirementToContactEmpty::class,
          space.axolab.axogram.tgnet.tl.TL_account.RequirementToContact::TLdeserialize, null)

    }

    @Test
    public fun test_RequirementToContact_TL_requirementToContactPremium() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_RequirementToContact.TL_requirementToContactPremium::class,
          space.axolab.axogram.tgnet.tl.TL_account.RequirementToContact::TLdeserialize, null)

    }

    @Test
    public fun test_RequirementToContact_TL_requirementToContactPaidMessages() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_RequirementToContact.TL_requirementToContactPaidMessages::class,
          space.axolab.axogram.tgnet.tl.TL_account.RequirementToContact::TLdeserialize, null)

    }

    @Test
    public fun test_InputInvoice_TL_inputInvoicePremiumGiftStars() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputInvoice.TL_inputInvoicePremiumGiftStars::class,
          space.axolab.axogram.tgnet.TLRPC.InputInvoice::TLdeserialize, null)

    }

    @Test
    public fun test_GlobalPrivacySettings_TL_globalPrivacySettings() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_GlobalPrivacySettings.TL_globalPrivacySettings::class,
          space.axolab.axogram.tgnet.TLRPC.GlobalPrivacySettings::TLdeserialize, null)

    }

    @Test
    public fun test_ConnectedBot_TL_connectedBot() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ConnectedBot.TL_connectedBot::class,
          space.axolab.axogram.tgnet.tl.TL_account.TL_connectedBot::TLdeserialize, null)

    }

    @Test
    public fun test_InputStorePaymentPurpose_TL_inputStorePaymentAuthCode() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputStorePaymentPurpose.TL_inputStorePaymentAuthCode::class,
          space.axolab.axogram.tgnet.TLRPC.InputStorePaymentPurpose::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateSentPhoneCode() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateSentPhoneCode::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_BusinessBotRights_TL_businessBotRights() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BusinessBotRights.TL_businessBotRights::class,
          space.axolab.axogram.tgnet.tl.TL_account.TL_businessBotRights::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionPaidMessagesRefunded() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionPaidMessagesRefunded::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_DisallowedGiftsSettings_TL_disallowedGiftsSettings() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DisallowedGiftsSettings.TL_disallowedGiftsSettings::class,
          space.axolab.axogram.tgnet.TLRPC.DisallowedGiftsSettings::TLdeserialize, null)

    }

    @Test
    public fun test_SponsoredPeer_TL_sponsoredPeer() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SponsoredPeer.TL_sponsoredPeer::class,
          space.axolab.axogram.tgnet.TLRPC.TL_sponsoredPeer::TLdeserialize, null)

    }

    @Test
    public fun test_contacts_SponsoredPeers_TL_contacts_sponsoredPeersEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_contacts_SponsoredPeers.TL_contacts_sponsoredPeersEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.contacts_SponsoredPeers::TLdeserialize, null)

    }

    @Test
    public fun test_contacts_SponsoredPeers_TL_contacts_sponsoredPeers() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_contacts_SponsoredPeers.TL_contacts_sponsoredPeers::class,
          space.axolab.axogram.tgnet.TLRPC.contacts_SponsoredPeers::TLdeserialize, null)

    }

    @Test
    public fun test_InputGroupCall_TL_inputGroupCallSlug() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputGroupCall.TL_inputGroupCallSlug::class,
          space.axolab.axogram.tgnet.TLRPC.InputGroupCall::TLdeserialize, null)

    }

    @Test
    public fun test_InputGroupCall_TL_inputGroupCallInviteMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputGroupCall.TL_inputGroupCallInviteMessage::class,
          space.axolab.axogram.tgnet.TLRPC.InputGroupCall::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateGroupCallChainBlocks() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateGroupCallChainBlocks::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionConferenceCall() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionConferenceCall::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_PhoneCallDiscardReason_TL_phoneCallDiscardReasonMigrateConferenceCall() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PhoneCallDiscardReason.TL_phoneCallDiscardReasonMigrateConferenceCall::class,
          space.axolab.axogram.tgnet.TLRPC.PhoneCallDiscardReason::TLdeserialize, null)

    }

    @Test
    public fun test_help_PromoData_TL_help_promoData() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_help_PromoData.TL_help_promoData::class,
          space.axolab.axogram.tgnet.TLRPC.help_PromoData::TLdeserialize, null)

    }

    @Test
    public fun test_InputSavedStarGift_TL_inputSavedStarGiftSlug() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputSavedStarGift.TL_inputSavedStarGiftSlug::class,
          space.axolab.axogram.tgnet.tl.TL_stars.InputSavedStarGift::TLdeserialize, null)

    }

    @Test
    public fun test_StarGiftAttributeId_TL_starGiftAttributeIdModel() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGiftAttributeId.TL_starGiftAttributeIdModel::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGiftAttributeId::TLdeserialize, null)

    }

    @Test
    public fun test_StarGiftAttributeId_TL_starGiftAttributeIdPattern() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGiftAttributeId.TL_starGiftAttributeIdPattern::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGiftAttributeId::TLdeserialize, null)

    }

    @Test
    public fun test_StarGiftAttributeId_TL_starGiftAttributeIdBackdrop() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGiftAttributeId.TL_starGiftAttributeIdBackdrop::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGiftAttributeId::TLdeserialize, null)

    }

    @Test
    public fun test_StarGiftAttributeCounter_TL_starGiftAttributeCounter() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGiftAttributeCounter.TL_starGiftAttributeCounter::class,
          space.axolab.axogram.tgnet.tl.TL_stars.starGiftAttributeCounter::TLdeserialize, null)

    }

    @Test
    public fun test_payments_ResaleStarGifts_TL_payments_resaleStarGifts() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_ResaleStarGifts.TL_payments_resaleStarGifts::class,
          space.axolab.axogram.tgnet.tl.TL_stars.resaleStarGifts::TLdeserialize, null)

    }

    @Test
    public
        fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionToggleAutotranslation() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionToggleAutotranslation::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_stories_CanSendStoryCount_TL_stories_canSendStoryCount() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_stories_CanSendStoryCount.TL_stories_canSendStoryCount::class,
          space.axolab.axogram.tgnet.tl.TL_stories.canSendStoryCount::TLdeserialize, null)

    }

    @Test
    public fun test_PendingSuggestion_TL_pendingSuggestion() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PendingSuggestion.TL_pendingSuggestion::class,
          space.axolab.axogram.tgnet.TLRPC.TL_pendingSuggestion::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateDraftMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateDraftMessage::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateChannelReadMessagesContents() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateChannelReadMessagesContents::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateDialogUnreadMark() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateDialogUnreadMark::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateMessageReactions() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateMessageReactions::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionPaidMessagesPrice() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionPaidMessagesPrice::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_InputReplyTo_TL_inputReplyToMonoForum() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputReplyTo.TL_inputReplyToMonoForum::class,
          space.axolab.axogram.tgnet.TLRPC.InputReplyTo::TLdeserialize, null)

    }

    @Test
    public fun test_SavedDialog_TL_monoForumDialog() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SavedDialog.TL_monoForumDialog::class,
          space.axolab.axogram.tgnet.TLRPC.savedDialog::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateReadMonoForumInbox() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateReadMonoForumInbox::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateReadMonoForumOutbox() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateReadMonoForumOutbox::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Message_TL_messageService() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_messageService::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, null)

    }

    @Test
    public fun test_SponsoredMessage_TL_sponsoredMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SponsoredMessage.TL_sponsoredMessage::class,
          space.axolab.axogram.tgnet.TLRPC.TL_sponsoredMessage::TLdeserialize, null)

    }

    @Test
    public fun test_messages_SponsoredMessages_TL_messages_sponsoredMessages() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_SponsoredMessages.TL_messages_sponsoredMessages::class,
          space.axolab.axogram.tgnet.TLRPC.messages_SponsoredMessages::TLdeserialize, null)

    }

    @Test
    public fun test_TodoItem_TL_todoItem() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_TodoItem.TL_todoItem::class,
          space.axolab.axogram.tgnet.TLRPC.TodoItem::TLdeserialize, null)

    }

    @Test
    public fun test_TodoList_TL_todoList() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_TodoList.TL_todoList::class,
          space.axolab.axogram.tgnet.TLRPC.TodoList::TLdeserialize, null)

    }

    @Test
    public fun test_InputMedia_TL_inputMediaTodo() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputMedia.TL_inputMediaTodo::class,
          space.axolab.axogram.tgnet.TLRPC.InputMedia::TLdeserialize, null)

    }

    @Test
    public fun test_MessageMedia_TL_messageMediaToDo() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaToDo::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionTodoCompletions() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionTodoCompletions::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionTodoAppendTasks() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionTodoAppendTasks::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateMonoForumNoPaidException() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateMonoForumNoPaidException::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_DraftMessage_TL_draftMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DraftMessage.TL_draftMessage::class,
          space.axolab.axogram.tgnet.TLRPC.DraftMessage::TLdeserialize, null)

    }

    @Test
    public fun test_StarsTransaction_TL_starsTransaction() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarsTransaction.TL_starsTransaction::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarsTransaction::TLdeserialize, null)

    }

    @Test
    public fun test_payments_StarsRevenueStats_TL_payments_starsRevenueStats() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_StarsRevenueStats.TL_payments_starsRevenueStats::class,
          space.axolab.axogram.tgnet.TLRPC.TL_payments_starsRevenueStats::TLdeserialize, null)

    }

    @Test
    public fun test_SuggestedPost_TL_suggestedPost() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SuggestedPost.TL_suggestedPost::class,
          space.axolab.axogram.tgnet.TLRPC.SuggestedPost::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionSuggestedPostApproval() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionSuggestedPostApproval::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionSuggestedPostSuccess() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionSuggestedPostSuccess::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionSuggestedPostRefund() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionSuggestedPostRefund::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_StarsAmount_TL_starsTonAmount() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarsAmount.TL_starsTonAmount::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarsAmount::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionGiftTon() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionGiftTon::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_InputStickerSet_TL_inputStickerSetTonGifts() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputStickerSet.TL_inputStickerSetTonGifts::class,
          space.axolab.axogram.tgnet.TLRPC.InputStickerSet::TLdeserialize, null)

    }

    @Test
    public fun test_payments_StarGifts_TL_payments_starGifts() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_StarGifts.TL_payments_starGifts::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGifts::TLdeserialize, null)

    }

    @Test
    public fun test_StarsRating_TL_starsRating() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarsRating.TL_starsRating::class,
          space.axolab.axogram.tgnet.tl.TL_stars.Tl_starsRating::TLdeserialize, null)

    }

    @Test
    public fun test_StarGiftCollection_TL_starGiftCollection() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGiftCollection.TL_starGiftCollection::class,
          space.axolab.axogram.tgnet.tl.TL_stars.TL_starGiftCollection::TLdeserialize, null)

    }

    @Test
    public fun test_payments_StarGiftCollections_TL_payments_starGiftCollectionsNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_StarGiftCollections.TL_payments_starGiftCollectionsNotModified::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGiftCollections::TLdeserialize, null)

    }

    @Test
    public fun test_payments_StarGiftCollections_TL_payments_starGiftCollections() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_StarGiftCollections.TL_payments_starGiftCollections::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGiftCollections::TLdeserialize, null)

    }

    @Test
    public fun test_InputInvoice_TL_inputInvoiceStarGiftResale() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputInvoice.TL_inputInvoiceStarGiftResale::class,
          space.axolab.axogram.tgnet.TLRPC.InputInvoice::TLdeserialize, null)

    }

    @Test
    public fun test_StoryAlbum_TL_storyAlbum() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StoryAlbum.TL_storyAlbum::class,
          space.axolab.axogram.tgnet.tl.TL_stories.TL_storyAlbum::TLdeserialize, null)

    }

    @Test
    public fun test_stories_Albums_TL_stories_albumsNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_stories_Albums.TL_stories_albumsNotModified::class,
          space.axolab.axogram.tgnet.tl.TL_stories.Albums::TLdeserialize, null)

    }

    @Test
    public fun test_stories_Albums_TL_stories_albums() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_stories_Albums.TL_stories_albums::class,
          space.axolab.axogram.tgnet.tl.TL_stories.Albums::TLdeserialize, null)

    }

    @Test
    public fun test_SearchPostsFlood_TL_searchPostsFlood() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SearchPostsFlood.TL_searchPostsFlood::class,
          space.axolab.axogram.tgnet.TLRPC.SearchPostsFlood::TLdeserialize, null)

    }

    @Test
    public fun test_WebPageAttribute_TL_webPageAttributeStarGiftCollection() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_WebPageAttribute.TL_webPageAttributeStarGiftCollection::class,
          space.axolab.axogram.tgnet.TLRPC.WebPageAttribute::TLdeserialize, null)

    }

    @Test
    public fun test_InputInvoice_TL_inputInvoiceStarGiftPrepaidUpgrade() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputInvoice.TL_inputInvoiceStarGiftPrepaidUpgrade::class,
          space.axolab.axogram.tgnet.TLRPC.InputInvoice::TLdeserialize, null)

    }

    @Test
    public fun test_payments_UniqueStarGiftValueInfo_TL_payments_uniqueStarGiftValueInfo() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_UniqueStarGiftValueInfo.TL_payments_uniqueStarGiftValueInfo::class,
          space.axolab.axogram.tgnet.tl.TL_stars.UniqueStarGiftValueInfo::TLdeserialize, null)

    }

    @Test
    public fun test_ChatFull_TL_channelFull() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, null)

    }

    @Test
    public fun test_InputStorePaymentPurpose_TL_inputStorePaymentStarsTopup() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputStorePaymentPurpose.TL_inputStorePaymentStarsTopup::class,
          space.axolab.axogram.tgnet.TLRPC.InputStorePaymentPurpose::TLdeserialize, null)

    }

    @Test
    public fun test_payments_UniqueStarGift_TL_payments_uniqueStarGift() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_UniqueStarGift.TL_payments_uniqueStarGift::class,
          space.axolab.axogram.tgnet.tl.TL_stars.TL_payments_uniqueStarGift::TLdeserialize, null)

    }

    @Test
    public fun test_messages_WebPagePreview_TL_messages_webPagePreview() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_WebPagePreview.TL_messages_webPagePreview::class,
          space.axolab.axogram.tgnet.tl.TL_account.webPagePreview::TLdeserialize, null)

    }

    @Test
    public fun test_ProfileTab_TL_profileTabPosts() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ProfileTab.TL_profileTabPosts::class,
          space.axolab.axogram.tgnet.TLRPC.ProfileTab::TLdeserialize, null)

    }

    @Test
    public fun test_ProfileTab_TL_profileTabGifts() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ProfileTab.TL_profileTabGifts::class,
          space.axolab.axogram.tgnet.TLRPC.ProfileTab::TLdeserialize, null)

    }

    @Test
    public fun test_ProfileTab_TL_profileTabMedia() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ProfileTab.TL_profileTabMedia::class,
          space.axolab.axogram.tgnet.TLRPC.ProfileTab::TLdeserialize, null)

    }

    @Test
    public fun test_ProfileTab_TL_profileTabFiles() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ProfileTab.TL_profileTabFiles::class,
          space.axolab.axogram.tgnet.TLRPC.ProfileTab::TLdeserialize, null)

    }

    @Test
    public fun test_ProfileTab_TL_profileTabMusic() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ProfileTab.TL_profileTabMusic::class,
          space.axolab.axogram.tgnet.TLRPC.ProfileTab::TLdeserialize, null)

    }

    @Test
    public fun test_ProfileTab_TL_profileTabVoice() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ProfileTab.TL_profileTabVoice::class,
          space.axolab.axogram.tgnet.TLRPC.ProfileTab::TLdeserialize, null)

    }

    @Test
    public fun test_ProfileTab_TL_profileTabLinks() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ProfileTab.TL_profileTabLinks::class,
          space.axolab.axogram.tgnet.TLRPC.ProfileTab::TLdeserialize, null)

    }

    @Test
    public fun test_ProfileTab_TL_profileTabGifs() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ProfileTab.TL_profileTabGifs::class,
          space.axolab.axogram.tgnet.TLRPC.ProfileTab::TLdeserialize, null)

    }

    @Test
    public fun test_users_SavedMusic_TL_users_savedMusicNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_users_SavedMusic.TL_users_savedMusicNotModified::class,
          space.axolab.axogram.tgnet.TLRPC.SavedMusic::TLdeserialize, null)

    }

    @Test
    public fun test_users_SavedMusic_TL_users_savedMusic() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_users_SavedMusic.TL_users_savedMusic::class,
          space.axolab.axogram.tgnet.TLRPC.SavedMusic::TLdeserialize, null)

    }

    @Test
    public fun test_account_SavedMusicIds_TL_account_savedMusicIdsNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_SavedMusicIds.TL_account_savedMusicIdsNotModified::class,
          space.axolab.axogram.tgnet.tl.TL_account.SavedMusicIds::TLdeserialize, null)

    }

    @Test
    public fun test_account_SavedMusicIds_TL_account_savedMusicIds() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_SavedMusicIds.TL_account_savedMusicIds::class,
          space.axolab.axogram.tgnet.tl.TL_account.SavedMusicIds::TLdeserialize, null)

    }

    @Test
    public fun test_payments_CheckCanSendGiftResult_TL_payments_checkCanSendGiftResultOk() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_CheckCanSendGiftResult.TL_payments_checkCanSendGiftResultOk::class,
          space.axolab.axogram.tgnet.tl.TL_stars.CheckCanSendGiftResult::TLdeserialize, null)

    }

    @Test
    public fun test_payments_CheckCanSendGiftResult_TL_payments_checkCanSendGiftResultFail() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_CheckCanSendGiftResult.TL_payments_checkCanSendGiftResultFail::class,
          space.axolab.axogram.tgnet.tl.TL_stars.CheckCanSendGiftResult::TLdeserialize, null)

    }

    @Test
    public fun test_ChatTheme_TL_chatTheme() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatTheme.TL_chatTheme::class,
          space.axolab.axogram.tgnet.TLRPC.ChatTheme::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionSetChatTheme() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionSetChatTheme::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_ChatTheme_TL_chatThemeUniqueGift() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatTheme.TL_chatThemeUniqueGift::class,
          space.axolab.axogram.tgnet.TLRPC.ChatTheme::TLdeserialize, null)

    }

    @Test
    public fun test_InputChatTheme_TL_inputChatThemeEmpty() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputChatTheme.TL_inputChatThemeEmpty::class,
          space.axolab.axogram.tgnet.TLRPC.InputChatTheme::TLdeserialize, null)

    }

    @Test
    public fun test_InputChatTheme_TL_inputChatTheme() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputChatTheme.TL_inputChatTheme::class,
          space.axolab.axogram.tgnet.TLRPC.InputChatTheme::TLdeserialize, null)

    }

    @Test
    public fun test_InputChatTheme_TL_inputChatThemeUniqueGift() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputChatTheme.TL_inputChatThemeUniqueGift::class,
          space.axolab.axogram.tgnet.TLRPC.InputChatTheme::TLdeserialize, null)

    }

    @Test
    public fun test_account_ChatThemes_TL_account_chatThemes() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_ChatThemes.TL_account_chatThemes::class,
          space.axolab.axogram.tgnet.tl.TL_account.ChatThemes::TLdeserialize, null)

    }

    @Test
    public fun test_payments_StarGiftUpgradePreview_TL_payments_starGiftUpgradePreview() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_StarGiftUpgradePreview.TL_payments_starGiftUpgradePreview::class,
          space.axolab.axogram.tgnet.tl.TL_stars.starGiftUpgradePreview::TLdeserialize, null)

    }

    @Test
    public fun test_auth_SentCode_TL_auth_sentCodePaymentRequired() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_auth_SentCode.TL_auth_sentCodePaymentRequired::class,
          space.axolab.axogram.tgnet.TLRPC.auth_SentCode::TLdeserialize, null)

    }

    @Test
    public fun test_InputInvoice_TL_inputInvoicePremiumAuthCode() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputInvoice.TL_inputInvoicePremiumAuthCode::class,
          space.axolab.axogram.tgnet.TLRPC.InputInvoice::TLdeserialize, null)

    }

    @Test
    public fun test_InputInvoice_TL_inputInvoiceStarGiftDropOriginalDetails() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputInvoice.TL_inputInvoiceStarGiftDropOriginalDetails::class,
          space.axolab.axogram.tgnet.TLRPC.InputInvoice::TLdeserialize, null)

    }

    @Test
    public fun test_StarGiftUpgradePrice_TL_starGiftUpgradePrice() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGiftUpgradePrice.TL_starGiftUpgradePrice::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGiftUpgradePrice::TLdeserialize, null)

    }

    @Test
    public fun test_InputContact_TL_inputPhoneContact() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputContact.TL_inputPhoneContact::class,
          space.axolab.axogram.tgnet.TLRPC.TL_inputPhoneContact::TLdeserialize, null)

    }

    @Test
    public fun test_messages_Messages_TL_messages_messages() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_Messages.TL_messages_messages::class,
          space.axolab.axogram.tgnet.TLRPC.messages_Messages::TLdeserialize, null)

    }

    @Test
    public fun test_messages_Messages_TL_messages_messagesSlice() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_Messages.TL_messages_messagesSlice::class,
          space.axolab.axogram.tgnet.TLRPC.messages_Messages::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateUserTyping() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateUserTyping::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateReadHistoryInbox() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateReadHistoryInbox::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_SendMessageAction_TL_sendMessageTextDraftAction() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SendMessageAction.TL_sendMessageTextDraftAction::class,
          space.axolab.axogram.tgnet.TLRPC.SendMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateGroupCallEncryptedMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateGroupCallEncryptedMessage::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updatePinnedForumTopic() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updatePinnedForumTopic::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updatePinnedForumTopics() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updatePinnedForumTopics::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_PeerColor_TL_peerColorCollectible() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PeerColor.TL_peerColorCollectible::class,
          space.axolab.axogram.tgnet.TLRPC.PeerColor::TLdeserialize, null)

    }

    @Test
    public fun test_PeerColor_TL_inputPeerColorCollectible() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PeerColor.TL_inputPeerColorCollectible::class,
          space.axolab.axogram.tgnet.TLRPC.PeerColor::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionSuggestBirthday() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionSuggestBirthday::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_User_TL_user() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_User.TL_user::class,
          space.axolab.axogram.tgnet.TLRPC.User::TLdeserialize, null)

    }

    @Test
    public fun test_Chat_TL_channel() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_channel::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, null)

    }

    @Test
    public fun test_GroupCall_TL_groupCall() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_GroupCall.TL_groupCall::class,
          space.axolab.axogram.tgnet.TLRPC.GroupCall::TLdeserialize, null)

    }

    @Test
    public fun test_GroupCallParticipant_TL_groupCallParticipant() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_GroupCallParticipant.TL_groupCallParticipant::class,
          space.axolab.axogram.tgnet.TLRPC.GroupCallParticipant::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateGroupCall() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateGroupCall::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionGiftPremium() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionGiftPremium::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_payments_CheckedGiftCode_TL_payments_checkedGiftCode() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_CheckedGiftCode.TL_payments_checkedGiftCode::class,
          space.axolab.axogram.tgnet.TLRPC.TL_payments_checkedGiftCode::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionGiftCode() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionGiftCode::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_TodoCompletion_TL_todoCompletion() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_TodoCompletion.TL_todoCompletion::class,
          space.axolab.axogram.tgnet.TLRPC.TodoCompletion::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateGroupCallMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateGroupCallMessage::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_MessageMedia_TL_messageMediaVideoStream() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaVideoStream::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateDeleteGroupCallMessages() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateDeleteGroupCallMessages::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_GroupCallMessage_TL_groupCallMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_GroupCallMessage.TL_groupCallMessage::class,
          space.axolab.axogram.tgnet.TLRPC.GroupCallMessage::TLdeserialize, null)

    }

    @Test
    public fun test_InputPrivacyKey_TL_inputPrivacyKeySavedMusic() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPrivacyKey.TL_inputPrivacyKeySavedMusic::class,
          space.axolab.axogram.tgnet.TLRPC.InputPrivacyKey::TLdeserialize, null)

    }

    @Test
    public fun test_PrivacyKey_TL_privacyKeySavedMusic() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PrivacyKey.TL_privacyKeySavedMusic::class,
          space.axolab.axogram.tgnet.TLRPC.PrivacyKey::TLdeserialize, null)

    }

    @Test
    public fun test_GroupCallDonor_TL_groupCallDonor() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_GroupCallDonor.TL_groupCallDonor::class,
          space.axolab.axogram.tgnet.tl.TL_phone.groupCallDonor::TLdeserialize, null)

    }

    @Test
    public fun test_phone_GroupCallStars_TL_phone_groupCallStars() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_phone_GroupCallStars.TL_phone_groupCallStars::class,
          space.axolab.axogram.tgnet.tl.TL_phone.groupCallStars::TLdeserialize, null)

    }

    @Test
    public fun test_RecentStory_TL_recentStory() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_RecentStory.TL_recentStory::class,
          space.axolab.axogram.tgnet.TLRPC.TL_recentStory::TLdeserialize, null)

    }

    @Test
    public fun test_InputInvoice_TL_inputInvoiceStarGiftAuctionBid() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputInvoice.TL_inputInvoiceStarGiftAuctionBid::class,
          space.axolab.axogram.tgnet.TLRPC.InputInvoice::TLdeserialize, null)

    }

    @Test
    public fun test_AuctionBidLevel_TL_auctionBidLevel() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_AuctionBidLevel.TL_auctionBidLevel::class,
          space.axolab.axogram.tgnet.tl.TL_stars.TL_AuctionBidLevel::TLdeserialize, null)

    }

    @Test
    public fun test_StarGiftAuctionState_TL_starGiftAuctionStateNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGiftAuctionState.TL_starGiftAuctionStateNotModified::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGiftAuctionState::TLdeserialize, null)

    }

    @Test
    public fun test_StarGiftAuctionUserState_TL_starGiftAuctionUserState() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGiftAuctionUserState.TL_starGiftAuctionUserState::class,
          space.axolab.axogram.tgnet.tl.TL_stars.TL_StarGiftAuctionUserState::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateStarGiftAuctionState() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateStarGiftAuctionState::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateStarGiftAuctionUserState() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateStarGiftAuctionUserState::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public
        fun test_payments_StarGiftAuctionAcquiredGifts_TL_payments_starGiftAuctionAcquiredGifts() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_StarGiftAuctionAcquiredGifts.TL_payments_starGiftAuctionAcquiredGifts::class,
          space.axolab.axogram.tgnet.tl.TL_payments.TL_StarGiftAuctionAcquiredGifts::TLdeserialize,
          null)

    }

    @Test
    public fun test_StarGiftActiveAuctionState_TL_starGiftActiveAuctionState() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGiftActiveAuctionState.TL_starGiftActiveAuctionState::class,
          space.axolab.axogram.tgnet.tl.TL_stars.TL_StarGiftActiveAuctionState::TLdeserialize, null)

    }

    @Test
    public
        fun test_payments_StarGiftActiveAuctions_TL_payments_starGiftActiveAuctionsNotModified() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_StarGiftActiveAuctions.TL_payments_starGiftActiveAuctionsNotModified::class,
          space.axolab.axogram.tgnet.tl.TL_payments.StarGiftActiveAuctions::TLdeserialize, null)

    }

    @Test
    public fun test_InputStarGiftAuction_TL_inputStarGiftAuction() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputStarGiftAuction.TL_inputStarGiftAuction::class,
          space.axolab.axogram.tgnet.tl.TL_stars.InputStarGiftAuction::TLdeserialize, null)

    }

    @Test
    public fun test_InputStarGiftAuction_TL_inputStarGiftAuctionSlug() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputStarGiftAuction.TL_inputStarGiftAuctionSlug::class,
          space.axolab.axogram.tgnet.tl.TL_stars.InputStarGiftAuction::TLdeserialize, null)

    }

    @Test
    public fun test_Passkey_TL_passkey() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Passkey.TL_passkey::class,
          space.axolab.axogram.tgnet.tl.TL_account.Passkey::TLdeserialize, null)

    }

    @Test
    public fun test_account_Passkeys_TL_account_passkeys() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_Passkeys.TL_account_passkeys::class,
          space.axolab.axogram.tgnet.tl.TL_account.Passkeys::TLdeserialize, null)

    }

    @Test
    public fun test_account_PasskeyRegistrationOptions_TL_account_passkeyRegistrationOptions() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_account_PasskeyRegistrationOptions.TL_account_passkeyRegistrationOptions::class,
          space.axolab.axogram.tgnet.tl.TL_account.passkeyRegistrationOptions::TLdeserialize, null)

    }

    @Test
    public fun test_auth_PasskeyLoginOptions_TL_auth_passkeyLoginOptions() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_auth_PasskeyLoginOptions.TL_auth_passkeyLoginOptions::class,
          space.axolab.axogram.tgnet.tl.TL_account.passkeyLoginOptions::TLdeserialize, null)

    }

    @Test
    public fun test_InputPasskeyResponse_TL_inputPasskeyResponseRegister() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPasskeyResponse.TL_inputPasskeyResponseRegister::class,
          space.axolab.axogram.tgnet.tl.TL_account.InputPasskeyResponse::TLdeserialize, null)

    }

    @Test
    public fun test_InputPasskeyResponse_TL_inputPasskeyResponseLogin() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPasskeyResponse.TL_inputPasskeyResponseLogin::class,
          space.axolab.axogram.tgnet.tl.TL_account.InputPasskeyResponse::TLdeserialize, null)

    }

    @Test
    public fun test_InputPasskeyCredential_TL_inputPasskeyCredentialPublicKey() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPasskeyCredential.TL_inputPasskeyCredentialPublicKey::class,
          space.axolab.axogram.tgnet.tl.TL_account.inputPasskeyCredentialPublicKey::TLdeserialize,
          null)

    }

    @Test
    public fun test_StarGift_TL_starGift() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGift.TL_starGift::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGift::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionStarGift() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionStarGift::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_StarGiftAuctionState_TL_starGiftAuctionState() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGiftAuctionState.TL_starGiftAuctionState::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGiftAuctionState::TLdeserialize, null)

    }

    @Test
    public fun test_StarGiftAuctionState_TL_starGiftAuctionStateFinished() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGiftAuctionState.TL_starGiftAuctionStateFinished::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGiftAuctionState::TLdeserialize, null)

    }

    @Test
    public fun test_payments_StarGiftAuctionState_TL_payments_starGiftAuctionState() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_StarGiftAuctionState.TL_payments_starGiftAuctionState::class,
          space.axolab.axogram.tgnet.tl.TL_payments.TL_StarGiftAuctionState::TLdeserialize, null)

    }

    @Test
    public fun test_StarGiftAuctionAcquiredGift_TL_starGiftAuctionAcquiredGift() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGiftAuctionAcquiredGift.TL_starGiftAuctionAcquiredGift::class,
          space.axolab.axogram.tgnet.tl.TL_stars.TL_StarGiftAuctionAcquiredGift::TLdeserialize,
          null)

    }

    @Test
    public fun test_payments_StarGiftActiveAuctions_TL_payments_starGiftActiveAuctions() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_StarGiftActiveAuctions.TL_payments_starGiftActiveAuctions::class,
          space.axolab.axogram.tgnet.tl.TL_payments.StarGiftActiveAuctions::TLdeserialize, null)

    }

    @Test
    public fun test_WebPageAttribute_TL_webPageAttributeStarGiftAuction() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_WebPageAttribute.TL_webPageAttributeStarGiftAuction::class,
          space.axolab.axogram.tgnet.TLRPC.WebPageAttribute::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionStarGiftPurchaseOffer() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionStarGiftPurchaseOffer::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionStarGiftPurchaseOfferDeclined() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionStarGiftPurchaseOfferDeclined::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_StarGiftBackground_TL_starGiftBackground() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGiftBackground.TL_starGiftBackground::class,
          space.axolab.axogram.tgnet.tl.TL_stars.TL_starGiftBackground::TLdeserialize, null)

    }

    @Test
    public fun test_StarGiftAuctionRound_TL_starGiftAuctionRound() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGiftAuctionRound.TL_starGiftAuctionRound::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGiftAuctionRound::TLdeserialize, null)

    }

    @Test
    public fun test_StarGiftAuctionRound_TL_starGiftAuctionRoundExtendable() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGiftAuctionRound.TL_starGiftAuctionRoundExtendable::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGiftAuctionRound::TLdeserialize, null)

    }

    @Test
    public fun test_payments_StarGiftUpgradeAttributes_TL_payments_starGiftUpgradeAttributes() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_payments_StarGiftUpgradeAttributes.TL_payments_starGiftUpgradeAttributes::class,
          space.axolab.axogram.tgnet.tl.TL_stars.starGiftUpgradeAttributes::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionChatDeletePhoto() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionChatDeletePhoto::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_PrivacyKey_TL_privacyKeyStatusTimestamp() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PrivacyKey.TL_privacyKeyStatusTimestamp::class,
          space.axolab.axogram.tgnet.TLRPC.PrivacyKey::TLdeserialize, null)

    }

    @Test
    public fun test_help_TermsOfService_TL_help_termsOfService() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_help_TermsOfService.TL_help_termsOfService::class,
          space.axolab.axogram.tgnet.TLRPC.TL_help_termsOfService::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionParticipantToggleBan() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionParticipantToggleBan::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_MessageMedia_TL_messageMediaDice() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaDice::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_messages_EmojiGameOutcome_TL_messages_emojiGameOutcome() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_EmojiGameOutcome.TL_messages_emojiGameOutcome::class,
          space.axolab.axogram.tgnet.TLRPC.TL_messages_emojiGameOutcome::TLdeserialize, null)

    }

    @Test
    public fun test_InputMedia_TL_inputMediaStakeDice() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputMedia.TL_inputMediaStakeDice::class,
          space.axolab.axogram.tgnet.TLRPC.InputMedia::TLdeserialize, null)

    }

    @Test
    public fun test_messages_EmojiGameInfo_TL_messages_emojiGameUnavailable() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_EmojiGameInfo.TL_messages_emojiGameUnavailable::class,
          space.axolab.axogram.tgnet.TLRPC.EmojiGameInfo::TLdeserialize, null)

    }

    @Test
    public fun test_messages_EmojiGameInfo_TL_messages_emojiGameDiceInfo() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_EmojiGameInfo.TL_messages_emojiGameDiceInfo::class,
          space.axolab.axogram.tgnet.TLRPC.EmojiGameInfo::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateEmojiGameInfo() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateEmojiGameInfo::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_KeyboardButton_TL_keyboardButton() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButton::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, null)

    }

    @Test
    public fun test_KeyboardButton_TL_keyboardButtonUrl() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonUrl::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, null)

    }

    @Test
    public fun test_KeyboardButton_TL_keyboardButtonCallback() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonCallback::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, null)

    }

    @Test
    public fun test_KeyboardButton_TL_keyboardButtonRequestPhone() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonRequestPhone::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, null)

    }

    @Test
    public fun test_KeyboardButton_TL_keyboardButtonRequestGeoLocation() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonRequestGeoLocation::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, null)

    }

    @Test
    public fun test_KeyboardButton_TL_keyboardButtonSwitchInline() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonSwitchInline::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, null)

    }

    @Test
    public fun test_KeyboardButton_TL_keyboardButtonGame() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonGame::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, null)

    }

    @Test
    public fun test_KeyboardButton_TL_keyboardButtonBuy() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonBuy::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, null)

    }

    @Test
    public fun test_KeyboardButton_TL_keyboardButtonUrlAuth() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonUrlAuth::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, null)

    }

    @Test
    public fun test_KeyboardButton_TL_inputKeyboardButtonUrlAuth() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_inputKeyboardButtonUrlAuth::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, null)

    }

    @Test
    public fun test_UrlAuthResult_TL_urlAuthResultAccepted() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UrlAuthResult.TL_urlAuthResultAccepted::class,
          space.axolab.axogram.tgnet.TLRPC.UrlAuthResult::TLdeserialize, null)

    }

    @Test
    public fun test_KeyboardButton_TL_keyboardButtonRequestPoll() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonRequestPoll::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, null)

    }

    @Test
    public fun test_KeyboardButton_TL_inputKeyboardButtonUserProfile() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_inputKeyboardButtonUserProfile::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, null)

    }

    @Test
    public fun test_KeyboardButton_TL_keyboardButtonUserProfile() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonUserProfile::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, null)

    }

    @Test
    public fun test_KeyboardButton_TL_keyboardButtonWebView() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonWebView::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, null)

    }

    @Test
    public fun test_KeyboardButton_TL_keyboardButtonSimpleWebView() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonSimpleWebView::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, null)

    }

    @Test
    public fun test_KeyboardButton_TL_keyboardButtonRequestPeer() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonRequestPeer::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, null)

    }

    @Test
    public fun test_KeyboardButton_TL_keyboardButtonCopy() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonCopy::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, null)

    }

    @Test
    public fun test_StarGiftAttribute_TL_starGiftAttributeModel() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGiftAttribute.TL_starGiftAttributeModel::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGiftAttribute::TLdeserialize, null)

    }

    @Test
    public fun test_StarGiftAttribute_TL_starGiftAttributePattern() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGiftAttribute.TL_starGiftAttributePattern::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGiftAttribute::TLdeserialize, null)

    }

    @Test
    public fun test_StarGiftAttribute_TL_starGiftAttributeBackdrop() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGiftAttribute.TL_starGiftAttributeBackdrop::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGiftAttribute::TLdeserialize, null)

    }

    @Test
    public fun test_StarGift_TL_starGiftUnique() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGift.TL_starGiftUnique::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGift::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionStarGiftUnique() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionStarGiftUnique::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_SavedStarGift_TL_savedStarGift() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SavedStarGift.TL_savedStarGift::class,
          space.axolab.axogram.tgnet.tl.TL_stars.SavedStarGift::TLdeserialize, null)

    }

    @Test
    public fun test_StarGiftAttributeRarity_TL_starGiftAttributeRarity() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGiftAttributeRarity.TL_starGiftAttributeRarity::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGiftAttributeRarity::TLdeserialize, null)

    }

    @Test
    public fun test_StarGiftAttributeRarity_TL_starGiftAttributeRarityUncommon() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGiftAttributeRarity.TL_starGiftAttributeRarityUncommon::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGiftAttributeRarity::TLdeserialize, null)

    }

    @Test
    public fun test_StarGiftAttributeRarity_TL_starGiftAttributeRarityRare() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGiftAttributeRarity.TL_starGiftAttributeRarityRare::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGiftAttributeRarity::TLdeserialize, null)

    }

    @Test
    public fun test_StarGiftAttributeRarity_TL_starGiftAttributeRarityEpic() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGiftAttributeRarity.TL_starGiftAttributeRarityEpic::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGiftAttributeRarity::TLdeserialize, null)

    }

    @Test
    public fun test_StarGiftAttributeRarity_TL_starGiftAttributeRarityLegendary() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGiftAttributeRarity.TL_starGiftAttributeRarityLegendary::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGiftAttributeRarity::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateStarGiftCraftFail() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateStarGiftCraftFail::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_KeyboardButtonStyle_TL_keyboardButtonStyle() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButtonStyle.TL_keyboardButtonStyle::class,
          space.axolab.axogram.tgnet.TLRPC.TL_keyboardButtonStyle::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionNewCreatorPending() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionNewCreatorPending::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionChangeCreator() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionChangeCreator::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_ChatParticipant_TL_chatParticipant() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatParticipant.TL_chatParticipant::class,
          space.axolab.axogram.tgnet.TLRPC.ChatParticipant::TLdeserialize, null)

    }

    @Test
    public fun test_Message_TL_message() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_message::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelParticipant_TL_channelParticipant() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelParticipant.TL_channelParticipant::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelParticipant::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelParticipant_TL_channelParticipantSelf() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelParticipant.TL_channelParticipantSelf::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelParticipant::TLdeserialize, null)

    }

    @Test
    public fun test_ChatParticipant_TL_chatParticipantCreator() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatParticipant.TL_chatParticipantCreator::class,
          space.axolab.axogram.tgnet.TLRPC.ChatParticipant::TLdeserialize, null)

    }

    @Test
    public fun test_ChatParticipant_TL_chatParticipantAdmin() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatParticipant.TL_chatParticipantAdmin::class,
          space.axolab.axogram.tgnet.TLRPC.ChatParticipant::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelParticipant_TL_channelParticipantBanned() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelParticipant.TL_channelParticipantBanned::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelParticipant::TLdeserialize, null)

    }

    @Test
    public fun test_MessageEntity_TL_messageEntityFormattedDate() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageEntity.TL_messageEntityFormattedDate::class,
          space.axolab.axogram.tgnet.TLRPC.MessageEntity::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateChatParticipantRank() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateChatParticipantRank::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionNoForwardsToggle() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionNoForwardsToggle::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionNoForwardsRequest() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionNoForwardsRequest::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_ChannelAdminLogEventAction_TL_channelAdminLogEventActionParticipantEditRank() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminLogEventAction.TL_channelAdminLogEventActionParticipantEditRank::class,
          space.axolab.axogram.tgnet.TLRPC.ChannelAdminLogEventAction::TLdeserialize, null)

    }

    @Test
    public fun test_InputMedia_TL_inputMediaUploadedPhoto() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputMedia.TL_inputMediaUploadedPhoto::class,
          space.axolab.axogram.tgnet.TLRPC.InputMedia::TLdeserialize, null)

    }

    @Test
    public fun test_InputMedia_TL_inputMediaPhoto() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputMedia.TL_inputMediaPhoto::class,
          space.axolab.axogram.tgnet.TLRPC.InputMedia::TLdeserialize, null)

    }

    @Test
    public fun test_MessageMedia_TL_messageMediaPhoto() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaPhoto::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_Dialog_TL_dialog() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Dialog.TL_dialog::class,
          space.axolab.axogram.tgnet.TLRPC.Dialog::TLdeserialize, null)

    }

    @Test
    public fun test_UserFull_TL_userFull() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserFull.TL_userFull::class,
          space.axolab.axogram.tgnet.TLRPC.UserFull::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateMessagePoll() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateMessagePoll::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_PollAnswer_TL_pollAnswer() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PollAnswer.TL_pollAnswer::class,
          space.axolab.axogram.tgnet.TLRPC.PollAnswer::TLdeserialize, null)

    }

    @Test
    public fun test_Poll_TL_poll() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Poll.TL_poll::class,
          space.axolab.axogram.tgnet.TLRPC.Poll::TLdeserialize, null)

    }

    @Test
    public fun test_PollAnswerVoters_TL_pollAnswerVoters() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PollAnswerVoters.TL_pollAnswerVoters::class,
          space.axolab.axogram.tgnet.TLRPC.PollAnswerVoters::TLdeserialize, null)

    }

    @Test
    public fun test_PollResults_TL_pollResults() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PollResults.TL_pollResults::class,
          space.axolab.axogram.tgnet.TLRPC.PollResults::TLdeserialize, null)

    }

    @Test
    public fun test_InputMedia_TL_inputMediaPoll() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputMedia.TL_inputMediaPoll::class,
          space.axolab.axogram.tgnet.TLRPC.InputMedia::TLdeserialize, null)

    }

    @Test
    public fun test_MessageMedia_TL_messageMediaPoll() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaPoll::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_UrlAuthResult_TL_urlAuthResultRequest() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UrlAuthResult.TL_urlAuthResultRequest::class,
          space.axolab.axogram.tgnet.TLRPC.UrlAuthResult::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateMessagePollVote() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateMessagePollVote::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_MessageReplyHeader_TL_messageReplyHeader() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageReplyHeader.TL_messageReplyHeader::class,
          space.axolab.axogram.tgnet.TLRPC.MessageReplyHeader::TLdeserialize, null)

    }

    @Test
    public fun test_ForumTopic_TL_forumTopic() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ForumTopic.TL_forumTopic::class,
          space.axolab.axogram.tgnet.TLRPC.ForumTopic::TLdeserialize, null)

    }

    @Test
    public fun test_StoryItem_TL_storyItem() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StoryItem.TL_storyItem::class,
          space.axolab.axogram.tgnet.tl.TL_stories.StoryItem::TLdeserialize, null)

    }

    @Test
    public fun test_InputReplyTo_TL_inputReplyToMessage() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputReplyTo.TL_inputReplyToMessage::class,
          space.axolab.axogram.tgnet.TLRPC.InputReplyTo::TLdeserialize, null)

    }

    @Test
    public fun test_ReactionsNotifySettings_TL_reactionsNotifySettings() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ReactionsNotifySettings.TL_reactionsNotifySettings::class,
          space.axolab.axogram.tgnet.tl.TL_account.TL_reactionsNotifySettings::TLdeserialize, null)

    }

    @Test
    public fun test_InputMessageReadMetric_TL_inputMessageReadMetric() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputMessageReadMetric.TL_inputMessageReadMetric::class,
          space.axolab.axogram.tgnet.TLRPC.TL_inputMessageReadMetric::TLdeserialize, null)

    }

    @Test
    public fun test_PollAnswer_TL_inputPollAnswer() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PollAnswer.TL_inputPollAnswer::class,
          space.axolab.axogram.tgnet.TLRPC.PollAnswer::TLdeserialize, null)

    }

    @Test
    public fun test_MessagesFilter_TL_inputMessagesFilterPoll() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessagesFilter.TL_inputMessagesFilterPoll::class,
          space.axolab.axogram.tgnet.TLRPC.MessagesFilter::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionPollAppendAnswer() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionPollAppendAnswer::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionPollDeleteAnswer() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionPollDeleteAnswer::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_RequestPeerType_TL_requestPeerTypeCreateBot() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_RequestPeerType.TL_requestPeerTypeCreateBot::class,
          space.axolab.axogram.tgnet.TLRPC.RequestPeerType::TLdeserialize, null)

    }

    @Test
    public fun test_Update_TL_updateManagedBot() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Update.TL_updateManagedBot::class,
          space.axolab.axogram.tgnet.TLRPC.Update::TLdeserialize, null)

    }

    @Test
    public fun test_bots_ExportedBotToken_TL_bots_exportedBotToken() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_bots_ExportedBotToken.TL_bots_exportedBotToken::class,
          space.axolab.axogram.tgnet.tl.TL_bots.exportedBotToken::TLdeserialize, null)

    }

    @Test
    public fun test_bots_RequestedButton_TL_bots_requestedButton() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_bots_RequestedButton.TL_bots_requestedButton::class,
          space.axolab.axogram.tgnet.tl.TL_bots.requestedButton::TLdeserialize, null)

    }

    @Test
    public fun test_MessageAction_TL_messageActionManagedBotCreated() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionManagedBotCreated::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_MessageEntity_TL_messageEntityDiffInsert() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageEntity.TL_messageEntityDiffInsert::class,
          space.axolab.axogram.tgnet.TLRPC.MessageEntity::TLdeserialize, null)

    }

    @Test
    public fun test_MessageEntity_TL_messageEntityDiffReplace() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageEntity.TL_messageEntityDiffReplace::class,
          space.axolab.axogram.tgnet.TLRPC.MessageEntity::TLdeserialize, null)

    }

    @Test
    public fun test_MessageEntity_TL_messageEntityDiffDelete() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageEntity.TL_messageEntityDiffDelete::class,
          space.axolab.axogram.tgnet.TLRPC.MessageEntity::TLdeserialize, null)

    }

    @Test
    public fun test_messages_ComposedMessageWithAI_TL_messages_composedMessageWithAI() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_messages_ComposedMessageWithAI.TL_messages_composedMessageWithAI::class,
          space.axolab.axogram.tgnet.TLRPC.TL_composedMessageWithAI::TLdeserialize, null)

    }
  }

  public class Test_Encrypred : BaseSchemeTest() {
    @Test
    public fun test_DecryptedMessage_TL_decryptedMessage_layer8() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessage.TL_decryptedMessage_layer8::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessage::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessage_TL_decryptedMessage_layer17() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessage.TL_decryptedMessage_layer17::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessage::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessage_TL_decryptedMessage_layer45() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessage.TL_decryptedMessage_layer45::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessage::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessage_TL_decryptedMessage_layer73() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessage.TL_decryptedMessage_layer73::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessage::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessage_TL_decryptedMessageService_layer8() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessage.TL_decryptedMessageService_layer8::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessage::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessage_TL_decryptedMessageService_layer17() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessage.TL_decryptedMessageService_layer17::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessage::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessageMedia_TL_decryptedMessageMediaEmpty_layer8() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessageMedia.TL_decryptedMessageMediaEmpty_layer8::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessageMedia_TL_decryptedMessageMediaPhoto_layer8() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessageMedia.TL_decryptedMessageMediaPhoto_layer8::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessageMedia_TL_decryptedMessageMediaPhoto_layer45() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessageMedia.TL_decryptedMessageMediaPhoto_layer45::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessageMedia_TL_decryptedMessageMediaVideo_layer8() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessageMedia.TL_decryptedMessageMediaVideo_layer8::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessageMedia_TL_decryptedMessageMediaVideo_layer17() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessageMedia.TL_decryptedMessageMediaVideo_layer17::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessageMedia_TL_decryptedMessageMediaVideo_layer45() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessageMedia.TL_decryptedMessageMediaVideo_layer45::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessageMedia_TL_decryptedMessageMediaGeoPoint_layer8() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessageMedia.TL_decryptedMessageMediaGeoPoint_layer8::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessageMedia_TL_decryptedMessageMediaContact_layer8() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessageMedia.TL_decryptedMessageMediaContact_layer8::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessageAction_TL_decryptedMessageActionSetMessageTTL_layer8() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessageAction.TL_decryptedMessageActionSetMessageTTL_layer8::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessageMedia_TL_decryptedMessageMediaDocument_layer8() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessageMedia.TL_decryptedMessageMediaDocument_layer8::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessageMedia_TL_decryptedMessageMediaDocument_layer45() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessageMedia.TL_decryptedMessageMediaDocument_layer45::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessageMedia_TL_decryptedMessageMediaDocument_layer143() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessageMedia.TL_decryptedMessageMediaDocument_layer143::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessageMedia_TL_decryptedMessageMediaAudio_layer8() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessageMedia.TL_decryptedMessageMediaAudio_layer8::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessageMedia_TL_decryptedMessageMediaAudio_layer17() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessageMedia.TL_decryptedMessageMediaAudio_layer17::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessageAction_TL_decryptedMessageActionReadMessages_layer8() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessageAction.TL_decryptedMessageActionReadMessages_layer8::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessageAction_TL_decryptedMessageActionDeleteMessages_layer8() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessageAction.TL_decryptedMessageActionDeleteMessages_layer8::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessageAction_TL_decryptedMessageActionScreenshotMessages_layer8() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessageAction.TL_decryptedMessageActionScreenshotMessages_layer8::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessageAction_TL_decryptedMessageActionFlushHistory_layer8() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessageAction.TL_decryptedMessageActionFlushHistory_layer8::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessageLayer_TL_decryptedMessageLayer_layer17() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessageLayer.TL_decryptedMessageLayer_layer17::class,
          space.axolab.axogram.tgnet.TLRPC.TL_decryptedMessageLayer::TLdeserialize, null)

    }

    @Test
    public fun test_SendMessageAction_TL_sendMessageUploadVideoAction_layer17() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SendMessageAction.TL_sendMessageUploadVideoAction_layer17::class,
          space.axolab.axogram.tgnet.TLRPC.SendMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_SendMessageAction_TL_sendMessageUploadAudioAction_layer17() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SendMessageAction.TL_sendMessageUploadAudioAction_layer17::class,
          space.axolab.axogram.tgnet.TLRPC.SendMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_SendMessageAction_TL_sendMessageUploadPhotoAction_layer17() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SendMessageAction.TL_sendMessageUploadPhotoAction_layer17::class,
          space.axolab.axogram.tgnet.TLRPC.SendMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_SendMessageAction_TL_sendMessageUploadDocumentAction_layer17() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SendMessageAction.TL_sendMessageUploadDocumentAction_layer17::class,
          space.axolab.axogram.tgnet.TLRPC.SendMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessageAction_TL_decryptedMessageActionResend_layer17() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessageAction.TL_decryptedMessageActionResend_layer17::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessageAction_TL_decryptedMessageActionNotifyLayer_layer17() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessageAction.TL_decryptedMessageActionNotifyLayer_layer17::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessageAction_TL_decryptedMessageActionTyping_layer17() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessageAction.TL_decryptedMessageActionTyping_layer17::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessageAction_TL_decryptedMessageActionRequestKey_layer20() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessageAction.TL_decryptedMessageActionRequestKey_layer20::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessageAction_TL_decryptedMessageActionAcceptKey_layer20() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessageAction.TL_decryptedMessageActionAcceptKey_layer20::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessageAction_TL_decryptedMessageActionAbortKey_layer20() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessageAction.TL_decryptedMessageActionAbortKey_layer20::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessageAction_TL_decryptedMessageActionCommitKey_layer20() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessageAction.TL_decryptedMessageActionCommitKey_layer20::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessageAction_TL_decryptedMessageActionNoop_layer20() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessageAction.TL_decryptedMessageActionNoop_layer20::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessageAction::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessageMedia_TL_decryptedMessageMediaExternalDocument_layer23() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessageMedia.TL_decryptedMessageMediaExternalDocument_layer23::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessageMedia_TL_decryptedMessageMediaVenue_layer45() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessageMedia.TL_decryptedMessageMediaVenue_layer45::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_DecryptedMessageMedia_TL_decryptedMessageMediaWebPage_layer45() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DecryptedMessageMedia.TL_decryptedMessageMediaWebPage_layer45::class,
          space.axolab.axogram.tgnet.TLRPC.DecryptedMessageMedia::TLdeserialize, null)

    }

    @Test
    public fun test_SendMessageAction_TL_sendMessageUploadRoundAction_layer66() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SendMessageAction.TL_sendMessageUploadRoundAction_layer66::class,
          space.axolab.axogram.tgnet.TLRPC.SendMessageAction::TLdeserialize, null)

    }
  }

  public class Test_Legacy : BaseSchemeTest() {
    /**
     * Message-MessageEntity-InputUser-InputPeer
     * Chat-InputChannel-InputPeer
     */
    @Test
    public fun test_InputPeer_TL_inputPeerChat_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPeer.TL_inputPeerChat_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.InputPeer::TLdeserialize, 132)

    }

    /**
     * Message-Peer
     * ChatFull-Peer
     */
    @Test
    public fun test_Peer_TL_peerUser_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Peer.TL_peerUser_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.Peer::TLdeserialize, 132)

    }

    /**
     * Message-Peer
     * ChatFull-Peer
     */
    @Test
    public fun test_Peer_TL_peerChat_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Peer.TL_peerChat_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.Peer::TLdeserialize, 132)

    }

    /**
     * Message-MessageMedia-Photo-PhotoSize-FileLocation
     * Chat-ChatPhoto-FileLocation
     * User-UserProfilePhoto-FileLocation
     * UserFull-User-UserProfilePhoto-FileLocation
     * ChatFull-Photo-PhotoSize-FileLocation
     */
    @Test
    public fun test_FileLocation_TL_fileLocationUnavailable_layer97() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_FileLocation.TL_fileLocationUnavailable_layer97::class,
          space.axolab.axogram.tgnet.TLRPC.FileLocation::TLdeserialize, 97)

    }

    /**
     * Message-MessageMedia-Photo-PhotoSize-FileLocation
     * Chat-ChatPhoto-FileLocation
     * User-UserProfilePhoto-FileLocation
     * UserFull-User-UserProfilePhoto-FileLocation
     * ChatFull-Photo-PhotoSize-FileLocation
     */
    @Test
    public fun test_FileLocation_TL_fileLocation_layer85() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_FileLocation.TL_fileLocation_layer85::class,
          space.axolab.axogram.tgnet.TLRPC.FileLocation::TLdeserialize, 85)

    }

    /**
     * User
     * UserFull-User
     */
    @Test
    public fun test_User_TL_userEmpty_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_User.TL_userEmpty_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.User::TLdeserialize, 132)

    }

    /**
     * User
     * UserFull-User
     */
    @Test
    public fun test_User_TL_userSelf_layer17() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_User.TL_userSelf_layer17::class,
          space.axolab.axogram.tgnet.TLRPC.User::TLdeserialize, 17)

    }

    /**
     * User
     * UserFull-User
     */
    @Test
    public fun test_User_TL_userContact_layer17() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_User.TL_userContact_layer17::class,
          space.axolab.axogram.tgnet.TLRPC.User::TLdeserialize, 17)

    }

    /**
     * User
     * UserFull-User
     */
    @Test
    public fun test_User_TL_userRequest_layer17() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_User.TL_userRequest_layer17::class,
          space.axolab.axogram.tgnet.TLRPC.User::TLdeserialize, 17)

    }

    /**
     * User
     * UserFull-User
     */
    @Test
    public fun test_User_TL_userForeign_layer17() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_User.TL_userForeign_layer17::class,
          space.axolab.axogram.tgnet.TLRPC.User::TLdeserialize, 17)

    }

    /**
     * User
     * UserFull-User
     */
    @Test
    public fun test_User_TL_userDeleted_layer17() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_User.TL_userDeleted_layer17::class,
          space.axolab.axogram.tgnet.TLRPC.User::TLdeserialize, 17)

    }

    /**
     * User-UserProfilePhoto
     * UserFull-User-UserProfilePhoto
     */
    @Test
    public fun test_UserProfilePhoto_TL_userProfilePhoto_layer1() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserProfilePhoto.TL_userProfilePhoto_layer1::class,
          space.axolab.axogram.tgnet.TLRPC.UserProfilePhoto::TLdeserialize, 1)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat
     * Chat
     */
    @Test
    public fun test_Chat_TL_chatEmpty_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_chatEmpty_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, 132)

    }

    /**
     * Chat
     */
    @Test
    public fun test_Chat_TL_chat_layer37() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_chat_layer37::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, 37)

    }

    /**
     * Chat
     */
    @Test
    public fun test_Chat_TL_chatForbidden_layer37() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_chatForbidden_layer37::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, 37)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_chatFull_layer27() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_chatFull_layer27::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 27)

    }

    /**
     * ChatFull-ChatParticipants-ChatParticipant
     */
    @Test
    public fun test_ChatParticipant_TL_chatParticipant_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatParticipant.TL_chatParticipant_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.ChatParticipant::TLdeserialize, 132)

    }

    /**
     * ChatFull-ChatParticipants
     */
    @Test
    public fun test_ChatParticipants_TL_chatParticipantsForbidden_layer36() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatParticipants.TL_chatParticipantsForbidden_layer36::class,
          space.axolab.axogram.tgnet.TLRPC.ChatParticipants::TLdeserialize, 36)

    }

    /**
     * ChatFull-ChatParticipants
     */
    @Test
    public fun test_ChatParticipants_TL_chatParticipants_layer39() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatParticipants.TL_chatParticipants_layer39::class,
          space.axolab.axogram.tgnet.TLRPC.ChatParticipants::TLdeserialize, 39)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat-ChatPhoto
     * Chat-ChatPhoto
     */
    @Test
    public fun test_ChatPhoto_TL_chatPhoto_layer97() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatPhoto.TL_chatPhoto_layer97::class,
          space.axolab.axogram.tgnet.TLRPC.ChatPhoto::TLdeserialize, 97)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_messageEmpty_layer122() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_messageEmpty_layer122::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 122)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_message_layer16() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_message_layer16::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 16)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_messageForwarded_layer16() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_messageForwarded_layer16::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 16)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_messageService_layer16() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_messageService_layer16::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 16)

    }

    /**
     * Message-MessageMedia
     */
    @Test
    public fun test_MessageMedia_TL_messageMediaPhoto_layer27() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaPhoto_layer27::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, 27)

    }

    /**
     * Message-MessageMedia
     */
    @Test
    public fun test_MessageMedia_TL_messageMediaVideo_layer27() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaVideo_layer27::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, 27)

    }

    /**
     * Message-MessageMedia
     */
    @Test
    public fun test_MessageMedia_TL_messageMediaContact_layer81() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaContact_layer81::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, 81)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionChatCreate_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionChatCreate_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 132)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionChatDeletePhoto_layer220() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionChatDeletePhoto_layer220::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 220)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionChatAddUser_layer40() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionChatAddUser_layer40::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 40)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionChatDeleteUser_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionChatDeleteUser_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 132)

    }

    /**
     * Message-MessageMedia-Photo
     * UserFull-Photo
     * ChatFull-Photo
     */
    @Test
    public fun test_Photo_TL_photo_layer27() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Photo.TL_photo_layer27::class,
          space.axolab.axogram.tgnet.TLRPC.Photo::TLdeserialize, 27)

    }

    /**
     * Message-MessageMedia-Photo-PhotoSize
     * Theme-Document-PhotoSize
     * UserFull-Photo-PhotoSize
     * ChatFull-Photo-PhotoSize
     */
    @Test
    public fun test_PhotoSize_TL_photoSize_layer127() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PhotoSize.TL_photoSize_layer127::class,
          space.axolab.axogram.tgnet.TLRPC.PhotoSize::TLdeserialize, 127)

    }

    /**
     * Message-MessageMedia-Photo-PhotoSize
     * Theme-Document-PhotoSize
     * UserFull-Photo-PhotoSize
     * ChatFull-Photo-PhotoSize
     */
    @Test
    public fun test_PhotoSize_TL_photoCachedSize_layer127() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PhotoSize.TL_photoCachedSize_layer127::class,
          space.axolab.axogram.tgnet.TLRPC.PhotoSize::TLdeserialize, 127)

    }

    /**
     * Message-MessageMedia-Video
     */
    @Test
    public fun test_Video_TL_videoEmpty_layer46() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Video.TL_videoEmpty_layer46::class,
          space.axolab.axogram.tgnet.TLRPC.Video::TLdeserialize, 46)

    }

    /**
     * Message-MessageMedia-Video
     */
    @Test
    public fun test_Video_TL_video_layer12() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Video.TL_video_layer12::class,
          space.axolab.axogram.tgnet.TLRPC.Video::TLdeserialize, 12)

    }

    /**
     * Message-MessageMedia-GeoPoint
     */
    @Test
    public fun test_GeoPoint_TL_geoPoint_layer81() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_GeoPoint.TL_geoPoint_layer81::class,
          space.axolab.axogram.tgnet.TLRPC.GeoPoint::TLdeserialize, 81)

    }

    @Test
    public fun test_PeerNotifyEvents_TL_peerNotifyEventsEmpty_layer78() {
      assumeTrue("Test skipped, link error", false)

    }

    @Test
    public fun test_PeerNotifyEvents_TL_peerNotifyEventsAll_layer78() {
      assumeTrue("Test skipped, link error", false)

    }

    /**
     * UserFull-PeerNotifySettings
     * ChatFull-PeerNotifySettings
     */
    @Test
    public fun test_PeerNotifySettings_TL_peerNotifySettings_layer1() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PeerNotifySettings.TL_peerNotifySettings_layer1::class,
          space.axolab.axogram.tgnet.TLRPC.PeerNotifySettings::TLdeserialize, 1)

    }

    /**
     * UserFull-PeerSettings
     */
    @Test
    public fun test_PeerSettings_TL_peerSettings_layer115() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PeerSettings.TL_peerSettings_layer115::class,
          space.axolab.axogram.tgnet.TLRPC.PeerSettings::TLdeserialize, 115)

    }

    /**
     * UserFull
     */
    @Test
    public fun test_UserFull_TL_userFull_layer30() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserFull.TL_userFull_layer30::class,
          space.axolab.axogram.tgnet.TLRPC.UserFull::TLdeserialize, 30)

    }

    /**
     * UserFull-contacts.Link-contacts.ForeignLink
     */
    @Test
    public fun test_contacts_ForeignLink_TL_contacts_foreignLinkUnknown_layer23() {
      assumeTrue("Test skipped, link error", false)

    }

    /**
     * UserFull-contacts.Link-contacts.ForeignLink
     */
    @Test
    public fun test_contacts_ForeignLink_TL_contacts_foreignLinkRequested_layer23() {
      assumeTrue("Test skipped, link error", false)

    }

    /**
     * UserFull-contacts.Link-contacts.ForeignLink
     */
    @Test
    public fun test_contacts_ForeignLink_TL_contacts_foreignLinkMutual_layer23() {
      assumeTrue("Test skipped, link error", false)

    }

    /**
     * UserFull-contacts.Link-contacts.MyLink
     */
    @Test
    public fun test_contacts_MyLink_TL_contacts_myLinkEmpty_layer23() {
      assumeTrue("Test skipped, link error", false)

    }

    /**
     * UserFull-contacts.Link-contacts.MyLink
     */
    @Test
    public fun test_contacts_MyLink_TL_contacts_myLinkRequested_layer23() {
      assumeTrue("Test skipped, link error", false)

    }

    /**
     * UserFull-contacts.Link-contacts.MyLink
     */
    @Test
    public fun test_contacts_MyLink_TL_contacts_myLinkContact_layer23() {
      assumeTrue("Test skipped, link error", false)

    }

    /**
     * UserFull-contacts.Link
     */
    @Test
    public fun test_contacts_Link_TL_contacts_link_layer23() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_contacts_Link.TL_contacts_link_layer23::class,
          space.axolab.axogram.tgnet.TLRPC.TL_contacts_link_layer101::TLdeserialize, 23)

    }

    /**
     * User-UserProfilePhoto
     * UserFull-User-UserProfilePhoto
     */
    @Test
    public fun test_UserProfilePhoto_TL_userProfilePhoto_layer97() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserProfilePhoto.TL_userProfilePhoto_layer97::class,
          space.axolab.axogram.tgnet.TLRPC.UserProfilePhoto::TLdeserialize, 97)

    }

    /**
     * UserFull-PeerNotifySettings
     * ChatFull-PeerNotifySettings
     */
    @Test
    public fun test_PeerNotifySettings_TL_peerNotifySettings_layer47() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PeerNotifySettings.TL_peerNotifySettings_layer47::class,
          space.axolab.axogram.tgnet.TLRPC.PeerNotifySettings::TLdeserialize, 47)

    }

    /**
     * Message-MessageMedia
     */
    @Test
    public fun test_MessageMedia_TL_messageMediaDocument_layer44() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaDocument_layer44::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, 44)

    }

    /**
     * Message-MessageMedia
     */
    @Test
    public fun test_MessageMedia_TL_messageMediaAudio_layer45() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaAudio_layer45::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, 45)

    }

    /**
     * Message-MessageMedia-Audio
     */
    @Test
    public fun test_Audio_TL_audioEmpty_layer45() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Audio.TL_audioEmpty_layer45::class,
          space.axolab.axogram.tgnet.TLRPC.Audio::TLdeserialize, 45)

    }

    /**
     * Message-MessageMedia-Audio
     */
    @Test
    public fun test_Audio_TL_audio_layer12() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Audio.TL_audio_layer12::class,
          space.axolab.axogram.tgnet.TLRPC.Audio::TLdeserialize, 12)

    }

    /**
     * Message-MessageMedia-Document
     */
    @Test
    public fun test_Document_TL_document_layer21() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Document.TL_document_layer21::class,
          space.axolab.axogram.tgnet.TLRPC.Document::TLdeserialize, 21)

    }

    /**
     * Message-MessageMedia-Video
     */
    @Test
    public fun test_Video_TL_video_layer27() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Video.TL_video_layer27::class,
          space.axolab.axogram.tgnet.TLRPC.Video::TLdeserialize, 27)

    }

    /**
     * Message-MessageMedia-Audio
     */
    @Test
    public fun test_Audio_TL_audio_layer32() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Audio.TL_audio_layer32::class,
          space.axolab.axogram.tgnet.TLRPC.Audio::TLdeserialize, 32)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_message_layer24() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_message_layer24::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 24)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_messageForwarded_layer24() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_messageForwarded_layer24::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 24)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_messageService_layer37() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_messageService_layer37::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 37)

    }

    /**
     * User
     * UserFull-User
     */
    @Test
    public fun test_User_TL_userSelf_layer23() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_User.TL_userSelf_layer23::class,
          space.axolab.axogram.tgnet.TLRPC.User::TLdeserialize, 23)

    }

    /**
     * User
     * UserFull-User
     */
    @Test
    public fun test_User_TL_userContact_layer30() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_User.TL_userContact_layer30::class,
          space.axolab.axogram.tgnet.TLRPC.User::TLdeserialize, 30)

    }

    /**
     * User
     * UserFull-User
     */
    @Test
    public fun test_User_TL_userRequest_layer30() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_User.TL_userRequest_layer30::class,
          space.axolab.axogram.tgnet.TLRPC.User::TLdeserialize, 30)

    }

    /**
     * User
     * UserFull-User
     */
    @Test
    public fun test_User_TL_userForeign_layer30() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_User.TL_userForeign_layer30::class,
          space.axolab.axogram.tgnet.TLRPC.User::TLdeserialize, 30)

    }

    /**
     * User
     * UserFull-User
     */
    @Test
    public fun test_User_TL_userDeleted_layer30() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_User.TL_userDeleted_layer30::class,
          space.axolab.axogram.tgnet.TLRPC.User::TLdeserialize, 30)

    }

    /**
     * User-UserStatus
     */
    @Test
    public fun test_UserStatus_TL_userStatusRecently_layer171() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserStatus.TL_userStatusRecently_layer171::class,
          space.axolab.axogram.tgnet.TLRPC.UserStatus::TLdeserialize, 171)

    }

    /**
     * User-UserStatus
     */
    @Test
    public fun test_UserStatus_TL_userStatusLastWeek_layer171() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserStatus.TL_userStatusLastWeek_layer171::class,
          space.axolab.axogram.tgnet.TLRPC.UserStatus::TLdeserialize, 171)

    }

    /**
     * User-UserStatus
     */
    @Test
    public fun test_UserStatus_TL_userStatusLastMonth_layer171() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserStatus.TL_userStatusLastMonth_layer171::class,
          space.axolab.axogram.tgnet.TLRPC.UserStatus::TLdeserialize, 171)

    }

    /**
     * Message-MessageMedia-Document
     */
    @Test
    public fun test_Document_TL_document_layer53() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Document.TL_document_layer53::class,
          space.axolab.axogram.tgnet.TLRPC.Document::TLdeserialize, 53)

    }

    /**
     * Message-MessageMedia-Document-DocumentAttribute
     */
    @Test
    public fun test_DocumentAttribute_TL_documentAttributeSticker_layer24() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DocumentAttribute.TL_documentAttributeSticker_layer24::class,
          space.axolab.axogram.tgnet.TLRPC.DocumentAttribute::TLdeserialize, 24)

    }

    /**
     * Message-MessageMedia-Document-DocumentAttribute
     */
    @Test
    public fun test_DocumentAttribute_TL_documentAttributeVideo_layer65() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DocumentAttribute.TL_documentAttributeVideo_layer65::class,
          space.axolab.axogram.tgnet.TLRPC.DocumentAttribute::TLdeserialize, 65)

    }

    /**
     * Message-MessageMedia-Document-DocumentAttribute
     */
    @Test
    public fun test_DocumentAttribute_TL_documentAttributeAudio_layer31() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DocumentAttribute.TL_documentAttributeAudio_layer31::class,
          space.axolab.axogram.tgnet.TLRPC.DocumentAttribute::TLdeserialize, 31)

    }

    /**
     * User
     * UserFull-User
     */
    @Test
    public fun test_User_TL_userSelf_layer30() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_User.TL_userSelf_layer30::class,
          space.axolab.axogram.tgnet.TLRPC.User::TLdeserialize, 30)

    }

    /**
     * UserFull-contacts.Link
     */
    @Test
    public fun test_contacts_Link_TL_contacts_link_layer101() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_contacts_Link.TL_contacts_link_layer101::class,
          space.axolab.axogram.tgnet.TLRPC.TL_contacts_link_layer101::TLdeserialize, 101)

    }

    /**
     * UserFull-contacts.Link-ContactLink
     */
    @Test
    public fun test_ContactLink_TL_contactLinkUnknown_layer101() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ContactLink.TL_contactLinkUnknown_layer101::class,
          space.axolab.axogram.tgnet.TLRPC.ContactLink_layer101::TLdeserialize, 101)

    }

    /**
     * UserFull-contacts.Link-ContactLink
     */
    @Test
    public fun test_ContactLink_TL_contactLinkNone_layer101() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ContactLink.TL_contactLinkNone_layer101::class,
          space.axolab.axogram.tgnet.TLRPC.ContactLink_layer101::TLdeserialize, 101)

    }

    /**
     * UserFull-contacts.Link-ContactLink
     */
    @Test
    public fun test_ContactLink_TL_contactLinkHasPhone_layer99() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ContactLink.TL_contactLinkHasPhone_layer99::class,
          space.axolab.axogram.tgnet.TLRPC.ContactLink_layer101::TLdeserialize, 99)

    }

    /**
     * UserFull-contacts.Link-ContactLink
     */
    @Test
    public fun test_ContactLink_TL_contactLinkContact_layer101() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ContactLink.TL_contactLinkContact_layer101::class,
          space.axolab.axogram.tgnet.TLRPC.ContactLink_layer101::TLdeserialize, 101)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_message_layer30() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_message_layer30::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 30)

    }

    /**
     * Message-MessageMedia-Document-DocumentAttribute
     */
    @Test
    public fun test_DocumentAttribute_TL_documentAttributeSticker_layer28() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DocumentAttribute.TL_documentAttributeSticker_layer28::class,
          space.axolab.axogram.tgnet.TLRPC.DocumentAttribute::TLdeserialize, 28)

    }

    /**
     * Message-MessageMedia-WebPage
     * StoryItem-MessageMedia-WebPage
     * UserFull-PeerStories-StoryItem-MessageMedia-WebPage
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage
     */
    @Test
    public fun test_WebPage_TL_webPageEmpty_layer165() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_WebPage.TL_webPageEmpty_layer165::class,
          space.axolab.axogram.tgnet.TLRPC.WebPage::TLdeserialize, 165)

    }

    /**
     * Message-MessageMedia-WebPage
     * StoryItem-MessageMedia-WebPage
     * UserFull-PeerStories-StoryItem-MessageMedia-WebPage
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage
     */
    @Test
    public fun test_WebPage_TL_webPagePending_layer165() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_WebPage.TL_webPagePending_layer165::class,
          space.axolab.axogram.tgnet.TLRPC.WebPage::TLdeserialize, 165)

    }

    /**
     * Message-MessageMedia-WebPage
     */
    @Test
    public fun test_WebPage_TL_webPage_layer34() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_WebPage.TL_webPage_layer34::class,
          space.axolab.axogram.tgnet.TLRPC.WebPage::TLdeserialize, 34)

    }

    /**
     * Message-MessageMedia
     * StoryItem-MessageMedia
     * UserFull-PeerStories-StoryItem-MessageMedia
     * ChatFull-PeerStories-StoryItem-MessageMedia
     */
    @Test
    public fun test_MessageMedia_TL_messageMediaWebPage_layer165() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaWebPage_layer165::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, 165)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_chatFull_layer30() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_chatFull_layer30::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 30)

    }

    /**
     * Message-MessageMedia
     */
    @Test
    public fun test_MessageMedia_TL_messageMediaPhoto_layer69() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaPhoto_layer69::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, 69)

    }

    /**
     * Message-MessageMedia
     */
    @Test
    public fun test_MessageMedia_TL_messageMediaVideo_layer46() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaVideo_layer46::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, 46)

    }

    /**
     * Message-MessageMedia-Photo
     * UserFull-Photo
     * ChatFull-Photo
     */
    @Test
    public fun test_Photo_TL_photo_layer32() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Photo.TL_photo_layer32::class,
          space.axolab.axogram.tgnet.TLRPC.Photo::TLdeserialize, 32)

    }

    /**
     * Message-MessageMedia-Video
     */
    @Test
    public fun test_Video_TL_video_layer32() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Video.TL_video_layer32::class,
          space.axolab.axogram.tgnet.TLRPC.Video::TLdeserialize, 32)

    }

    /**
     * Message-MessageMedia
     */
    @Test
    public fun test_MessageMedia_TL_messageMediaVenue_layer71() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaVenue_layer71::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, 71)

    }

    /**
     * ChatFull-ExportedChatInvite
     */
    @Test
    public fun test_ExportedChatInvite_TL_chatInviteEmpty_layer122() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ExportedChatInvite.TL_chatInviteEmpty_layer122::class,
          space.axolab.axogram.tgnet.TLRPC.ExportedChatInvite::TLdeserialize, 122)

    }

    /**
     * ChatFull-ExportedChatInvite
     */
    @Test
    public fun test_ExportedChatInvite_TL_chatInviteExported_layer122() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ExportedChatInvite.TL_chatInviteExported_layer122::class,
          space.axolab.axogram.tgnet.TLRPC.ExportedChatInvite::TLdeserialize, 122)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionChatJoinedByLink_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionChatJoinedByLink_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 132)

    }

    /**
     * Message-MessageMedia-Document-DocumentAttribute
     */
    @Test
    public fun test_DocumentAttribute_TL_documentAttributeSticker_layer55() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DocumentAttribute.TL_documentAttributeSticker_layer55::class,
          space.axolab.axogram.tgnet.TLRPC.DocumentAttribute::TLdeserialize, 55)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_chatFull_layer86() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_chatFull_layer86::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 86)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_message_layer33() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_message_layer33::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 33)

    }

    /**
     * UserFull
     */
    @Test
    public fun test_UserFull_TL_userFull_layer48() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserFull.TL_userFull_layer48::class,
          space.axolab.axogram.tgnet.TLRPC.UserFull::TLdeserialize, 48)

    }

    /**
     * User
     * UserFull-User
     */
    @Test
    public fun test_User_TL_user_layer43() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_User.TL_user_layer43::class,
          space.axolab.axogram.tgnet.TLRPC.User::TLdeserialize, 43)

    }

    /**
     * UserFull-BotInfo
     * ChatFull-BotInfo
     */
    @Test
    public fun test_BotInfo_TL_botInfoEmpty_layer48() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BotInfo.TL_botInfoEmpty_layer48::class,
          space.axolab.axogram.tgnet.tl.TL_bots.BotInfo::TLdeserialize, 48)

    }

    /**
     * UserFull-BotInfo
     * ChatFull-BotInfo
     */
    @Test
    public fun test_BotInfo_TL_botInfo_layer48() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BotInfo.TL_botInfo_layer48::class,
          space.axolab.axogram.tgnet.tl.TL_bots.BotInfo::TLdeserialize, 48)

    }

    /**
     * Message-ReplyMarkup-KeyboardButtonRow-KeyboardButton
     */
    @Test
    public fun test_KeyboardButton_TL_keyboardButton_layer221() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButton_layer221::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, 221)

    }

    /**
     * Message-ReplyMarkup
     */
    @Test
    public fun test_ReplyMarkup_TL_replyKeyboardForceReply_layer129() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ReplyMarkup.TL_replyKeyboardForceReply_layer129::class,
          space.axolab.axogram.tgnet.TLRPC.ReplyMarkup::TLdeserialize, 129)

    }

    /**
     * Message-ReplyMarkup
     */
    @Test
    public fun test_ReplyMarkup_TL_replyKeyboardMarkup_layer129() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ReplyMarkup.TL_replyKeyboardMarkup_layer129::class,
          space.axolab.axogram.tgnet.TLRPC.ReplyMarkup::TLdeserialize, 129)

    }

    /**
     * Message-MessageMedia-Document-DocumentAttribute
     */
    @Test
    public fun test_DocumentAttribute_TL_documentAttributeAudio_layer45() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DocumentAttribute.TL_documentAttributeAudio_layer45::class,
          space.axolab.axogram.tgnet.TLRPC.DocumentAttribute::TLdeserialize, 45)

    }

    /**
     * ChatFull-StickerSet
     */
    @Test
    public fun test_StickerSet_TL_stickerSet_layer75() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StickerSet.TL_stickerSet_layer75::class,
          space.axolab.axogram.tgnet.TLRPC.StickerSet::TLdeserialize, 75)

    }

    /**
     * Message-MessageMedia-Photo
     * UserFull-Photo
     * ChatFull-Photo
     */
    @Test
    public fun test_Photo_TL_photo_layer55() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Photo.TL_photo_layer55::class,
          space.axolab.axogram.tgnet.TLRPC.Photo::TLdeserialize, 55)

    }

    /**
     * Message-MessageMedia-Video
     */
    @Test
    public fun test_Video_TL_video_layer46() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Video.TL_video_layer46::class,
          space.axolab.axogram.tgnet.TLRPC.Video::TLdeserialize, 46)

    }

    /**
     * Message-MessageMedia-Audio
     */
    @Test
    public fun test_Audio_TL_audio_layer45() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Audio.TL_audio_layer45::class,
          space.axolab.axogram.tgnet.TLRPC.Audio::TLdeserialize, 45)

    }

    /**
     * Message-MessageEntity-InputUser-InputPeer
     * Chat-InputChannel-InputPeer
     */
    @Test
    public fun test_InputPeer_TL_inputPeerUser_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPeer.TL_inputPeerUser_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.InputPeer::TLdeserialize, 132)

    }

    /**
     * Message-MessageEntity-InputUser
     */
    @Test
    public fun test_InputUser_TL_inputUser_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputUser.TL_inputUser_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.InputUser::TLdeserialize, 132)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_message_layer35() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_message_layer35::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 35)

    }

    /**
     * Message-MessageMedia-WebPage
     */
    @Test
    public fun test_WebPage_TL_webPage_layer58() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_WebPage.TL_webPage_layer58::class,
          space.axolab.axogram.tgnet.TLRPC.WebPage::TLdeserialize, 58)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_message_layer37() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_message_layer37::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 37)

    }

    /**
     * ChatFull-ChatParticipants
     */
    @Test
    public fun test_ChatParticipants_TL_chatParticipantsForbidden_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatParticipants.TL_chatParticipantsForbidden_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.ChatParticipants::TLdeserialize, 132)

    }

    /**
     * Chat
     */
    @Test
    public fun test_Chat_TL_chat_layer40() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_chat_layer40::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, 40)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat
     * Chat
     */
    @Test
    public fun test_Chat_TL_chatForbidden_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_chatForbidden_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, 132)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_message_layer44() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_message_layer44::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 44)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_messageService_layer48() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_messageService_layer48::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 48)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat-InputChannel
     * Chat-InputChannel
     */
    @Test
    public fun test_InputChannel_TL_inputChannel_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputChannel.TL_inputChannel_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.InputChannel::TLdeserialize, 132)

    }

    /**
     * Message-Peer
     * ChatFull-Peer
     */
    @Test
    public fun test_Peer_TL_peerChannel_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Peer.TL_peerChannel_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.Peer::TLdeserialize, 132)

    }

    /**
     * Message-MessageEntity-InputUser-InputPeer
     * Chat-InputChannel-InputPeer
     */
    @Test
    public fun test_InputPeer_TL_inputPeerChannel_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPeer.TL_inputPeerChannel_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.InputPeer::TLdeserialize, 132)

    }

    /**
     * Chat
     */
    @Test
    public fun test_Chat_TL_channel_layer43() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_channel_layer43::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, 43)

    }

    /**
     * Chat
     */
    @Test
    public fun test_Chat_TL_channelForbidden_layer52() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_channelForbidden_layer52::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, 52)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_channelFull_layer40() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull_layer40::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 40)

    }

    /**
     * ChatFull-ChatParticipants
     */
    @Test
    public fun test_ChatParticipants_TL_chatParticipants_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatParticipants.TL_chatParticipants_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.ChatParticipants::TLdeserialize, 132)

    }

    /**
     * ChatFull-ChatParticipants-ChatParticipant
     */
    @Test
    public fun test_ChatParticipant_TL_chatParticipantCreator_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatParticipant.TL_chatParticipantCreator_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.ChatParticipant::TLdeserialize, 132)

    }

    /**
     * ChatFull-ChatParticipants-ChatParticipant
     */
    @Test
    public fun test_ChatParticipant_TL_chatParticipantAdmin_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatParticipant.TL_chatParticipantAdmin_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.ChatParticipant::TLdeserialize, 132)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat
     * Chat
     */
    @Test
    public fun test_Chat_TL_chat_layer92() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_chat_layer92::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, 92)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionChatAddUser_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionChatAddUser_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 132)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_channelFull_layer48() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull_layer48::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 48)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionChatMigrateTo_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionChatMigrateTo_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 132)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionChannelMigrateFrom_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionChannelMigrateFrom_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 132)

    }

    /**
     * User
     * UserFull-User
     */
    @Test
    public fun test_User_TL_user_layer44() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_User.TL_user_layer44::class,
          space.axolab.axogram.tgnet.TLRPC.User::TLdeserialize, 44)

    }

    /**
     * Chat
     */
    @Test
    public fun test_Chat_TL_channel_layer48() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_channel_layer48::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, 48)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_message_layer47() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_message_layer47::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 47)

    }

    /**
     * Message-MessageMedia
     */
    @Test
    public fun test_MessageMedia_TL_messageMediaDocument_layer69() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaDocument_layer69::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, 69)

    }

    /**
     * User
     * UserFull-User
     */
    @Test
    public fun test_User_TL_user_layer65() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_User.TL_user_layer65::class,
          space.axolab.axogram.tgnet.TLRPC.User::TLdeserialize, 65)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_message_layer69() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_message_layer69::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 69)

    }

    /**
     * UserFull-PeerNotifySettings
     * ChatFull-PeerNotifySettings
     */
    @Test
    public fun test_PeerNotifySettings_TL_peerNotifySettings_layer78() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PeerNotifySettings.TL_peerNotifySettings_layer78::class,
          space.axolab.axogram.tgnet.TLRPC.PeerNotifySettings::TLdeserialize, 78)

    }

    /**
     * Message-MessageFwdHeader
     */
    @Test
    public fun test_MessageFwdHeader_TL_messageFwdHeader_layer69() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageFwdHeader.TL_messageFwdHeader_layer69::class,
          space.axolab.axogram.tgnet.TLRPC.MessageFwdHeader::TLdeserialize, 69)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_messageService_layer118() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_messageService_layer118::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 118)

    }

    /**
     * UserFull
     */
    @Test
    public fun test_UserFull_TL_userFull_layer57() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserFull.TL_userFull_layer57::class,
          space.axolab.axogram.tgnet.TLRPC.UserFull::TLdeserialize, 57)

    }

    /**
     * UserFull-BotInfo
     * ChatFull-BotInfo
     */
    @Test
    public fun test_BotInfo_TL_botInfo_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BotInfo.TL_botInfo_layer132::class,
          space.axolab.axogram.tgnet.tl.TL_bots.BotInfo::TLdeserialize, 132)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat
     * Chat
     */
    @Test
    public fun test_Chat_TL_channel_layer67() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_channel_layer67::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, 67)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_channelFull_layer52() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull_layer52::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 52)

    }

    /**
     * Message-ReplyMarkup-KeyboardButtonRow-KeyboardButton
     */
    @Test
    public fun test_KeyboardButton_TL_keyboardButtonUrl_layer221() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonUrl_layer221::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, 221)

    }

    /**
     * Message-ReplyMarkup-KeyboardButtonRow-KeyboardButton
     */
    @Test
    public fun test_KeyboardButton_TL_keyboardButtonCallback_layer117() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonCallback_layer117::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, 117)

    }

    /**
     * Message-ReplyMarkup-KeyboardButtonRow-KeyboardButton
     */
    @Test
    public fun test_KeyboardButton_TL_keyboardButtonRequestPhone_layer221() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonRequestPhone_layer221::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, 221)

    }

    /**
     * Message-ReplyMarkup-KeyboardButtonRow-KeyboardButton
     */
    @Test
    public fun test_KeyboardButton_TL_keyboardButtonRequestGeoLocation_layer221() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonRequestGeoLocation_layer221::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, 221)

    }

    /**
     * Message-ReplyMarkup-KeyboardButtonRow-KeyboardButton
     */
    @Test
    public fun test_KeyboardButton_TL_keyboardButtonSwitchInline_layer54() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonSwitchInline_layer54::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, 54)

    }

    /**
     * Message-MessageEntity
     */
    @Test
    public fun test_MessageEntity_TL_messageEntityMentionName_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageEntity.TL_messageEntityMentionName_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.MessageEntity::TLdeserialize, 132)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat
     * Chat
     */
    @Test
    public fun test_Chat_TL_channelForbidden_layer67() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_channelForbidden_layer67::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, 67)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_channelFull_layer67() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull_layer67::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 67)

    }

    /**
     * ForumTopic-DraftMessage
     */
    @Test
    public fun test_DraftMessage_TL_draftMessage_layer165() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DraftMessage.TL_draftMessage_layer165::class,
          space.axolab.axogram.tgnet.TLRPC.DraftMessage::TLdeserialize, 165)

    }

    /**
     * Message-MessageMedia-Document
     */
    @Test
    public fun test_Document_TL_document_layer85() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Document.TL_document_layer85::class,
          space.axolab.axogram.tgnet.TLRPC.Document::TLdeserialize, 85)

    }

    /**
     * Message-ReplyMarkup-KeyboardButtonRow-KeyboardButton
     */
    @Test
    public fun test_KeyboardButton_TL_keyboardButtonSwitchInline_layer157() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonSwitchInline_layer157::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, 157)

    }

    /**
     * Message-MessageMedia-Photo
     * UserFull-Photo
     * ChatFull-Photo
     */
    @Test
    public fun test_Photo_TL_photo_layer85() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Photo.TL_photo_layer85::class,
          space.axolab.axogram.tgnet.TLRPC.Photo::TLdeserialize, 85)

    }

    /**
     * Message-ReplyMarkup-KeyboardButtonRow-KeyboardButton
     */
    @Test
    public fun test_KeyboardButton_TL_keyboardButtonGame_layer221() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonGame_layer221::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, 221)

    }

    /**
     * UserFull
     */
    @Test
    public fun test_UserFull_TL_userFull_layer86() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserFull.TL_userFull_layer86::class,
          space.axolab.axogram.tgnet.TLRPC.UserFull::TLdeserialize, 86)

    }

    /**
     * Message-MessageMedia-WebPage
     */
    @Test
    public fun test_WebPage_TL_webPage_layer104() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_WebPage.TL_webPage_layer104::class,
          space.axolab.axogram.tgnet.TLRPC.WebPage::TLdeserialize, 104)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock
     */
    @Test
    public fun test_PageBlock_TL_pageBlockAuthorDate_layer60() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockAuthorDate_layer60::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, 60)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock
     */
    @Test
    public fun test_PageBlock_TL_pageBlockList_layer87() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockList_layer87::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, 87)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock
     */
    @Test
    public fun test_PageBlock_TL_pageBlockPhoto_layer87() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockPhoto_layer87::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, 87)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock
     */
    @Test
    public fun test_PageBlock_TL_pageBlockVideo_layer87() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockVideo_layer87::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, 87)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock
     */
    @Test
    public fun test_PageBlock_TL_pageBlockEmbed_layer60() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockEmbed_layer60::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, 60)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock
     */
    @Test
    public fun test_PageBlock_TL_pageBlockEmbedPost_layer87() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockEmbedPost_layer87::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, 87)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock
     */
    @Test
    public fun test_PageBlock_TL_pageBlockCollage_layer87() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockCollage_layer87::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, 87)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock
     */
    @Test
    public fun test_PageBlock_TL_pageBlockSlideshow_layer87() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockSlideshow_layer87::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, 87)

    }

    /**
     * Message-MessageMedia-WebPage-Page
     */
    @Test
    public fun test_Page_TL_pagePart_layer67() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Page.TL_pagePart_layer67::class,
          space.axolab.axogram.tgnet.TLRPC.Page::TLdeserialize, 67)

    }

    /**
     * Message-MessageMedia-WebPage-Page
     */
    @Test
    public fun test_Page_TL_pageFull_layer67() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Page.TL_pageFull_layer67::class,
          space.axolab.axogram.tgnet.TLRPC.Page::TLdeserialize, 67)

    }

    /**
     * Message-MessageMedia-WebPage
     */
    @Test
    public fun test_WebPage_TL_webPageNotModified_layer110() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_WebPage.TL_webPageNotModified_layer110::class,
          space.axolab.axogram.tgnet.TLRPC.WebPage::TLdeserialize, 110)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock
     */
    @Test
    public fun test_PageBlock_TL_pageBlockEmbed_layer87() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockEmbed_layer87::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, 87)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionPaymentSentMe_layer193() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionPaymentSentMe_layer193::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 193)

    }

    /**
     * Message-MessageMedia
     */
    @Test
    public fun test_MessageMedia_TL_messageMediaInvoice_layer145() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaInvoice_layer145::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, 145)

    }

    /**
     * Message-ReplyMarkup-KeyboardButtonRow-KeyboardButton
     */
    @Test
    public fun test_KeyboardButton_TL_keyboardButtonBuy_layer221() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonBuy_layer221::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, 221)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionPaymentSent_layer142() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionPaymentSent_layer142::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 142)

    }

    /**
     * Message-MessageMedia-WebDocument
     */
    @Test
    public fun test_WebDocument_TL_webDocument_layer81() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_WebDocument.TL_webDocument_layer81::class,
          space.axolab.axogram.tgnet.TLRPC.WebDocument::TLdeserialize, 81)

    }

    /**
     * Message-MessageMedia-Document-DocumentAttribute
     * Theme-Document-DocumentAttribute
     * UserFull-BotInfo-Document-DocumentAttribute
     * ChatFull-BotInfo-Document-DocumentAttribute
     */
    @Test
    public fun test_DocumentAttribute_TL_documentAttributeVideo_layer159() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DocumentAttribute.TL_documentAttributeVideo_layer159::class,
          space.axolab.axogram.tgnet.TLRPC.DocumentAttribute::TLdeserialize, 159)

    }

    /**
     * User
     * UserFull-User
     */
    @Test
    public fun test_User_TL_user_layer104() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_User.TL_user_layer104::class,
          space.axolab.axogram.tgnet.TLRPC.User::TLdeserialize, 104)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat
     * Chat
     */
    @Test
    public fun test_Chat_TL_channel_layer72() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_channel_layer72::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, 72)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat
     * Chat
     */
    @Test
    public fun test_Chat_TL_channelForbidden_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_channelForbidden_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, 132)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_channelFull_layer70() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull_layer70::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 70)

    }

    /**
     * Message-MessageMedia-WebPage-Page
     */
    @Test
    public fun test_Page_TL_pagePart_layer87() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Page.TL_pagePart_layer87::class,
          space.axolab.axogram.tgnet.TLRPC.Page::TLdeserialize, 87)

    }

    /**
     * Message-MessageMedia-WebPage-Page
     */
    @Test
    public fun test_Page_TL_pageFull_layer87() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Page.TL_pageFull_layer87::class,
          space.axolab.axogram.tgnet.TLRPC.Page::TLdeserialize, 87)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat-ChannelAdminRights
     * Chat-ChannelAdminRights
     */
    @Test
    public fun test_ChannelAdminRights_TL_channelAdminRights_layer92() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelAdminRights.TL_channelAdminRights_layer92::class,
          space.axolab.axogram.tgnet.TLRPC.TL_channelAdminRights_layer92::TLdeserialize, 92)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat-ChannelBannedRights
     * Chat-ChannelBannedRights
     */
    @Test
    public fun test_ChannelBannedRights_TL_channelBannedRights_layer92() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChannelBannedRights.TL_channelBannedRights_layer92::class,
          space.axolab.axogram.tgnet.TLRPC.TL_channelBannedRights_layer92::TLdeserialize, 92)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock
     */
    @Test
    public fun test_PageBlock_TL_pageBlockAudio_layer87() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageBlock.TL_pageBlockAudio_layer87::class,
          space.axolab.axogram.tgnet.TLRPC.PageBlock::TLdeserialize, 87)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_message_layer72() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_message_layer72::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 72)

    }

    /**
     * Message-MessageMedia
     */
    @Test
    public fun test_MessageMedia_TL_messageMediaPhoto_layer74() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaPhoto_layer74::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, 74)

    }

    /**
     * Message-MessageMedia
     */
    @Test
    public fun test_MessageMedia_TL_messageMediaDocument_layer74() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaDocument_layer74::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, 74)

    }

    /**
     * Message-MessageFwdHeader
     */
    @Test
    public fun test_MessageFwdHeader_TL_messageFwdHeader_layer72() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageFwdHeader.TL_messageFwdHeader_layer72::class,
          space.axolab.axogram.tgnet.TLRPC.MessageFwdHeader::TLdeserialize, 72)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_channelFull_layer71() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull_layer71::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 71)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_channelFull_layer90() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull_layer90::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 90)

    }

    /**
     * Message-MessageMedia
     */
    @Test
    public fun test_MessageMedia_TL_messageMediaGeoLive_layer119() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaGeoLive_layer119::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, 119)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_message_layer104() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_message_layer104::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 104)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat
     * Chat
     */
    @Test
    public fun test_Chat_TL_channel_layer76() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_channel_layer76::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, 76)

    }

    /**
     * Message-MessageFwdHeader
     */
    @Test
    public fun test_MessageFwdHeader_TL_messageFwdHeader_layer96() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageFwdHeader.TL_messageFwdHeader_layer96::class,
          space.axolab.axogram.tgnet.TLRPC.MessageFwdHeader::TLdeserialize, 96)

    }

    /**
     * ForumTopic-DraftMessage-InputMedia
     */
    @Test
    public fun test_InputMedia_TL_inputMediaUploadedPhoto_layer223() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputMedia.TL_inputMediaUploadedPhoto_layer223::class,
          space.axolab.axogram.tgnet.TLRPC.InputMedia::TLdeserialize, 223)

    }

    /**
     * ForumTopic-DraftMessage-InputMedia
     */
    @Test
    public fun test_InputMedia_TL_inputMediaPhoto_layer223() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputMedia.TL_inputMediaPhoto_layer223::class,
          space.axolab.axogram.tgnet.TLRPC.InputMedia::TLdeserialize, 223)

    }

    /**
     * Message-MessageMedia
     * StoryItem-MessageMedia
     * UserFull-PeerStories-StoryItem-MessageMedia
     * ChatFull-PeerStories-StoryItem-MessageMedia
     * StarsTransaction-MessageMedia
     */
    @Test
    public fun test_MessageMedia_TL_messageMediaPhoto_layer223() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaPhoto_layer223::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, 223)

    }

    /**
     * ForumTopic-DraftMessage-InputMedia
     */
    @Test
    public fun test_InputMedia_TL_inputMediaUploadedDocument_layer197() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputMedia.TL_inputMediaUploadedDocument_layer197::class,
          space.axolab.axogram.tgnet.TLRPC.InputMedia::TLdeserialize, 197)

    }

    /**
     * Message-MessageMedia
     */
    @Test
    public fun test_MessageMedia_TL_messageMediaDocument_layer159() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaDocument_layer159::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, 159)

    }

    /**
     * ForumTopic-DraftMessage-InputMedia
     */
    @Test
    public fun test_InputMedia_TL_inputMediaDocumentExternal_layer197() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputMedia.TL_inputMediaDocumentExternal_layer197::class,
          space.axolab.axogram.tgnet.TLRPC.InputMedia::TLdeserialize, 197)

    }

    /**
     * ChatFull-StickerSet
     */
    @Test
    public fun test_StickerSet_TL_stickerSet_layer96() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StickerSet.TL_stickerSet_layer96::class,
          space.axolab.axogram.tgnet.TLRPC.StickerSet::TLdeserialize, 96)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionBotAllowed_layer153() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionBotAllowed_layer153::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 153)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat
     * Chat
     */
    @Test
    public fun test_Chat_TL_channel_layer92() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_channel_layer92::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, 92)

    }

    /**
     * UserFull-PeerNotifySettings
     * ChatFull-PeerNotifySettings
     */
    @Test
    public fun test_PeerNotifySettings_TL_peerNotifySettings_layer139() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PeerNotifySettings.TL_peerNotifySettings_layer139::class,
          space.axolab.axogram.tgnet.TLRPC.PeerNotifySettings::TLdeserialize, 139)

    }

    /**
     * Message-MessageAction-SecureValue-SecureFile
     */
    @Test
    public fun test_SecureFile_TL_secureFile_layer142() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureFile.TL_secureFile_layer142::class,
          space.axolab.axogram.tgnet.TLRPC.SecureFile::TLdeserialize, 142)

    }

    /**
     * Message-MessageAction-SecureValue
     */
    @Test
    public fun test_SecureValue_TL_secureValue_layer84() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SecureValue.TL_secureValue_layer84::class,
          space.axolab.axogram.tgnet.TLRPC.TL_secureValue::TLdeserialize, 84)

    }

    /**
     * Message-MessageMedia
     */
    @Test
    public fun test_MessageMedia_TL_messageMediaContact_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaContact_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, 132)

    }

    /**
     * Message-MessageMedia-GeoPoint
     * ChatFull-ChannelLocation-GeoPoint
     */
    @Test
    public fun test_GeoPoint_TL_geoPoint_layer119() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_GeoPoint.TL_geoPoint_layer119::class,
          space.axolab.axogram.tgnet.TLRPC.GeoPoint::TLdeserialize, 119)

    }

    /**
     * Message-MessageMedia-Photo-PhotoSize-FileLocation
     * Chat-ChatPhoto-FileLocation
     * User-UserProfilePhoto-FileLocation
     * UserFull-User-UserProfilePhoto-FileLocation
     * ChatFull-Photo-PhotoSize-FileLocation
     */
    @Test
    public fun test_FileLocation_TL_fileLocation_layer97() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_FileLocation.TL_fileLocation_layer97::class,
          space.axolab.axogram.tgnet.TLRPC.FileLocation::TLdeserialize, 97)

    }

    /**
     * Message-MessageMedia-Photo
     * UserFull-Photo
     * ChatFull-Photo
     */
    @Test
    public fun test_Photo_TL_photo_layer97() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Photo.TL_photo_layer97::class,
          space.axolab.axogram.tgnet.TLRPC.Photo::TLdeserialize, 97)

    }

    /**
     * Message-MessageMedia-Document
     */
    @Test
    public fun test_Document_TL_document_layer92() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Document.TL_document_layer92::class,
          space.axolab.axogram.tgnet.TLRPC.Document::TLdeserialize, 92)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_chatFull_layer92() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_chatFull_layer92::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 92)

    }

    /**
     * UserFull
     */
    @Test
    public fun test_UserFull_TL_userFull_layer98() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserFull.TL_userFull_layer98::class,
          space.axolab.axogram.tgnet.TLRPC.UserFull::TLdeserialize, 98)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-PageRelatedArticle
     */
    @Test
    public fun test_PageRelatedArticle_TL_pageRelatedArticle_layer88() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PageRelatedArticle.TL_pageRelatedArticle_layer88::class,
          space.axolab.axogram.tgnet.TLRPC.TL_pageRelatedArticle::TLdeserialize, 88)

    }

    /**
     * Message-MessageMedia-WebPage-Page
     */
    @Test
    public fun test_Page_TL_page_layer88() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Page.TL_page_layer88::class,
          space.axolab.axogram.tgnet.TLRPC.Page::TLdeserialize, 88)

    }

    /**
     * Message-MessageMedia-WebPage-Page
     */
    @Test
    public fun test_Page_TL_page_layer110() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Page.TL_page_layer110::class,
          space.axolab.axogram.tgnet.TLRPC.Page::TLdeserialize, 110)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionContactSignUp_layer90() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionContactSignUp_layer90::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 90)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_channelFull_layer98() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull_layer98::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 98)

    }

    /**
     * Message-MessageMedia-Poll-PollAnswer
     * StoryItem-MessageMedia-Poll-PollAnswer
     * UserFull-PeerStories-StoryItem-MessageMedia-Poll-PollAnswer
     * ChatFull-PeerStories-StoryItem-MessageMedia-Poll-PollAnswer
     * ForumTopic-DraftMessage-InputMedia-Poll-PollAnswer
     */
    @Test
    public fun test_PollAnswer_TL_pollAnswer_layer178() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PollAnswer.TL_pollAnswer_layer178::class,
          space.axolab.axogram.tgnet.TLRPC.PollAnswer::TLdeserialize, 178)

    }

    /**
     * Message-MessageMedia-Poll
     */
    @Test
    public fun test_Poll_TL_poll_layer111() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Poll.TL_poll_layer111::class,
          space.axolab.axogram.tgnet.TLRPC.Poll::TLdeserialize, 111)

    }

    /**
     * Message-MessageMedia-PollResults-PollAnswerVoters
     * StoryItem-MessageMedia-PollResults-PollAnswerVoters
     * UserFull-PeerStories-StoryItem-MessageMedia-PollResults-PollAnswerVoters
     * ChatFull-PeerStories-StoryItem-MessageMedia-PollResults-PollAnswerVoters
     * StarsTransaction-MessageMedia-PollResults-PollAnswerVoters
     */
    @Test
    public fun test_PollAnswerVoters_TL_pollAnswerVoters_layer223() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PollAnswerVoters.TL_pollAnswerVoters_layer223::class,
          space.axolab.axogram.tgnet.TLRPC.PollAnswerVoters::TLdeserialize, 223)

    }

    /**
     * Message-MessageMedia-PollResults
     */
    @Test
    public fun test_PollResults_TL_pollResults_layer108() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PollResults.TL_pollResults_layer108::class,
          space.axolab.axogram.tgnet.TLRPC.PollResults::TLdeserialize, 108)

    }

    /**
     * Message-MessageMedia
     * StoryItem-MessageMedia
     * UserFull-PeerStories-StoryItem-MessageMedia
     * ChatFull-PeerStories-StoryItem-MessageMedia
     * StarsTransaction-MessageMedia
     */
    @Test
    public fun test_MessageMedia_TL_messageMediaPoll_layer223() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaPoll_layer223::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, 223)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat
     * Chat
     */
    @Test
    public fun test_Chat_TL_chat_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_chat_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, 132)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_chatFull_layer98() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_chatFull_layer98::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 98)

    }

    /**
     * Message-MessageMedia-Document
     * Theme-Document
     */
    @Test
    public fun test_Document_TL_document_layer113() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Document.TL_document_layer113::class,
          space.axolab.axogram.tgnet.TLRPC.Document::TLdeserialize, 113)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat
     * Chat
     */
    @Test
    public fun test_Chat_TL_channel_layer104() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_channel_layer104::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, 104)

    }

    /**
     * ChatFull-StickerSet
     */
    @Test
    public fun test_StickerSet_TL_stickerSet_layer97() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StickerSet.TL_stickerSet_layer97::class,
          space.axolab.axogram.tgnet.TLRPC.StickerSet::TLdeserialize, 97)

    }

    /**
     * Message-MessageFwdHeader
     */
    @Test
    public fun test_MessageFwdHeader_TL_messageFwdHeader_layer112() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageFwdHeader.TL_messageFwdHeader_layer112::class,
          space.axolab.axogram.tgnet.TLRPC.MessageFwdHeader::TLdeserialize, 112)

    }

    /**
     * User-UserProfilePhoto
     * UserFull-User-UserProfilePhoto
     */
    @Test
    public fun test_UserProfilePhoto_TL_userProfilePhoto_layer115() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserProfilePhoto.TL_userProfilePhoto_layer115::class,
          space.axolab.axogram.tgnet.TLRPC.UserProfilePhoto::TLdeserialize, 115)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat-ChatPhoto
     * Chat-ChatPhoto
     */
    @Test
    public fun test_ChatPhoto_TL_chatPhoto_layer115() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatPhoto.TL_chatPhoto_layer115::class,
          space.axolab.axogram.tgnet.TLRPC.ChatPhoto::TLdeserialize, 115)

    }

    /**
     * Message-MessageMedia-Photo
     * UserFull-Photo
     * ChatFull-Photo
     */
    @Test
    public fun test_Photo_TL_photo_layer115() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Photo.TL_photo_layer115::class,
          space.axolab.axogram.tgnet.TLRPC.Photo::TLdeserialize, 115)

    }

    /**
     * ChatFull-StickerSet
     */
    @Test
    public fun test_StickerSet_TL_stickerSet_layer121() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StickerSet.TL_stickerSet_layer121::class,
          space.axolab.axogram.tgnet.TLRPC.StickerSet::TLdeserialize, 121)

    }

    /**
     * Message-MessageMedia-Photo-PhotoSize-FileLocation
     * Theme-Document-PhotoSize-FileLocation
     * Chat-ChatPhoto-FileLocation
     * User-UserProfilePhoto-FileLocation
     * UserFull-User-UserProfilePhoto-FileLocation
     * ChatFull-Photo-PhotoSize-FileLocation
     */
    @Test
    public fun test_FileLocation_TL_fileLocationToBeDeprecated_layer127() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_FileLocation.TL_fileLocationToBeDeprecated_layer127::class,
          space.axolab.axogram.tgnet.TLRPC.FileLocation::TLdeserialize, 127)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_chatFull_layer121() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_chatFull_layer121::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 121)

    }

    /**
     * UserFull
     */
    @Test
    public fun test_UserFull_TL_userFull_layer101() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserFull.TL_userFull_layer101::class,
          space.axolab.axogram.tgnet.TLRPC.UserFull::TLdeserialize, 101)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_channelFull_layer99() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull_layer99::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 99)

    }

    /**
     * Message-MessageEntity-InputUser
     */
    @Test
    public fun test_InputUser_TL_inputUserFromMessage_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputUser.TL_inputUserFromMessage_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.InputUser::TLdeserialize, 132)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat-InputChannel
     * Chat-InputChannel
     */
    @Test
    public fun test_InputChannel_TL_inputChannelFromMessage_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputChannel.TL_inputChannelFromMessage_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.InputChannel::TLdeserialize, 132)

    }

    /**
     * Message-MessageEntity-InputUser-InputPeer
     * Chat-InputChannel-InputPeer
     */
    @Test
    public fun test_InputPeer_TL_inputPeerUserFromMessage_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPeer.TL_inputPeerUserFromMessage_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.InputPeer::TLdeserialize, 132)

    }

    /**
     * Message-MessageEntity-InputUser-InputPeer
     * Chat-InputChannel-InputPeer
     */
    @Test
    public fun test_InputPeer_TL_inputPeerChannelFromMessage_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputPeer.TL_inputPeerChannelFromMessage_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.InputPeer::TLdeserialize, 132)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_channelFull_layer101() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull_layer101::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 101)

    }

    /**
     * Message-ReplyMarkup-KeyboardButtonRow-KeyboardButton
     */
    @Test
    public fun test_KeyboardButton_TL_keyboardButtonUrlAuth_layer221() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonUrlAuth_layer221::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, 221)

    }

    /**
     * Message-ReplyMarkup-KeyboardButtonRow-KeyboardButton
     */
    @Test
    public fun test_KeyboardButton_TL_inputKeyboardButtonUrlAuth_layer221() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_inputKeyboardButtonUrlAuth_layer221::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, 221)

    }

    /**
     * UserFull
     */
    @Test
    public fun test_UserFull_TL_userFull_layer123() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserFull.TL_userFull_layer123::class,
          space.axolab.axogram.tgnet.TLRPC.UserFull::TLdeserialize, 123)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_channelFull_layer103() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull_layer103::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 103)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_channelFull_layer110() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull_layer110::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 110)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_message_layer118() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_message_layer118::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 118)

    }

    /**
     * Message-MessageMedia-WebPage
     */
    @Test
    public fun test_WebPage_TL_webPage_layer107() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_WebPage.TL_webPage_layer107::class,
          space.axolab.axogram.tgnet.TLRPC.WebPage::TLdeserialize, 107)

    }

    /**
     * User
     * UserFull-User
     */
    @Test
    public fun test_User_TL_user_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_User.TL_user_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.User::TLdeserialize, 132)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat
     * Chat
     */
    @Test
    public fun test_Chat_TL_channel_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_channel_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, 132)

    }

    /**
     * Theme
     */
    @Test
    public fun test_Theme_TL_themeDocumentNotModified_layer106() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Theme.TL_themeDocumentNotModified_layer106::class,
          space.axolab.axogram.tgnet.TLRPC.Theme::TLdeserialize, 106)

    }

    /**
     * Theme
     */
    @Test
    public fun test_Theme_TL_theme_layer106() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Theme.TL_theme_layer106::class,
          space.axolab.axogram.tgnet.TLRPC.Theme::TLdeserialize, 106)

    }

    /**
     * Message-MessageMedia-WebPage-WebPageAttribute-ThemeSettings-WallPaper-WallPaperSettings
     * Theme-ThemeSettings-WallPaper-WallPaperSettings
     */
    @Test
    public fun test_WallPaperSettings_TL_wallPaperSettings_layer128() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_WallPaperSettings.TL_wallPaperSettings_layer128::class,
          space.axolab.axogram.tgnet.TLRPC.WallPaperSettings::TLdeserialize, 128)

    }

    /**
     * Theme
     */
    @Test
    public fun test_Theme_TL_theme_layer131() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Theme.TL_theme_layer131::class,
          space.axolab.axogram.tgnet.TLRPC.Theme::TLdeserialize, 131)

    }

    /**
     * Message-MessageMedia-WebPage-WebPageAttribute-ThemeSettings-WallPaper
     * Theme-ThemeSettings-WallPaper
     */
    @Test
    public fun test_WallPaper_TL_wallPaperNoFile_layer128() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_WallPaper.TL_wallPaperNoFile_layer128::class,
          space.axolab.axogram.tgnet.TLRPC.WallPaper::TLdeserialize, 128)

    }

    /**
     * Message-MessageMedia-WebPage-WebPageAttribute-ThemeSettings
     * Theme-ThemeSettings
     */
    @Test
    public fun test_ThemeSettings_TL_themeSettings_layer131() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ThemeSettings.TL_themeSettings_layer131::class,
          space.axolab.axogram.tgnet.TLRPC.ThemeSettings::TLdeserialize, 131)
          test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ThemeSettings.TL_themeSettings_layer131::class,
              space.axolab.axogram.tgnet.TLRPC.TL_themeSettings::TLdeserialize, 131)

    }

    /**
     * Message-MessageMedia-PollResults
     */
    @Test
    public fun test_PollResults_TL_pollResults_layer111() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PollResults.TL_pollResults_layer111::class,
          space.axolab.axogram.tgnet.TLRPC.PollResults::TLdeserialize, 111)

    }

    /**
     * Message-ReplyMarkup-KeyboardButtonRow-KeyboardButton
     */
    @Test
    public fun test_KeyboardButton_TL_keyboardButtonRequestPoll_layer221() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonRequestPoll_layer221::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, 221)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_channelFull_layer121() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull_layer121::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 121)

    }

    /**
     * Message-MessageMedia
     */
    @Test
    public fun test_MessageMedia_TL_messageMediaDice_layer111() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaDice_layer111::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, 111)

    }

    /**
     * Message-MessageMedia-Document-DocumentAttribute-InputStickerSet
     * Theme-Document-DocumentAttribute-InputStickerSet
     */
    @Test
    public fun test_InputStickerSet_TL_inputStickerSetDice_layer111() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputStickerSet.TL_inputStickerSetDice_layer111::class,
          space.axolab.axogram.tgnet.TLRPC.InputStickerSet::TLdeserialize, 111)

    }

    /**
     * Message-MessageMedia-Poll
     * StoryItem-MessageMedia-Poll
     * UserFull-PeerStories-StoryItem-MessageMedia-Poll
     * ChatFull-PeerStories-StoryItem-MessageMedia-Poll
     * ForumTopic-DraftMessage-InputMedia-Poll
     */
    @Test
    public fun test_Poll_TL_poll_layer178() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Poll.TL_poll_layer178::class,
          space.axolab.axogram.tgnet.TLRPC.Poll::TLdeserialize, 178)

    }

    /**
     * Message-MessageMedia-PollResults
     */
    @Test
    public fun test_PollResults_TL_pollResults_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PollResults.TL_pollResults_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.PollResults::TLdeserialize, 132)

    }

    /**
     * ForumTopic-DraftMessage-InputMedia
     */
    @Test
    public fun test_InputMedia_TL_inputMediaPoll_layer223() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputMedia.TL_inputMediaPoll_layer223::class,
          space.axolab.axogram.tgnet.TLRPC.InputMedia::TLdeserialize, 223)

    }

    /**
     * Message-MessageMedia
     * StoryItem-MessageMedia
     * UserFull-PeerStories-StoryItem-MessageMedia
     * ChatFull-PeerStories-StoryItem-MessageMedia
     * StarsTransaction-MessageMedia
     */
    @Test
    public fun test_MessageMedia_TL_messageMediaDice_layer220() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaDice_layer220::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, 220)

    }

    /**
     * Message-MessageFwdHeader
     */
    @Test
    public fun test_MessageFwdHeader_TL_messageFwdHeader_layer118() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageFwdHeader.TL_messageFwdHeader_layer118::class,
          space.axolab.axogram.tgnet.TLRPC.MessageFwdHeader::TLdeserialize, 118)

    }

    /**
     * Message-MessageMedia-Document
     * Theme-Document
     */
    @Test
    public fun test_Document_TL_document_layer142() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Document.TL_document_layer142::class,
          space.axolab.axogram.tgnet.TLRPC.Document::TLdeserialize, 142)

    }

    /**
     * Message-MessageMedia-Document-VideoSize
     * Theme-Document-VideoSize
     */
    @Test
    public fun test_VideoSize_TL_videoSize_layer115() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_VideoSize.TL_videoSize_layer115::class,
          space.axolab.axogram.tgnet.TLRPC.VideoSize::TLdeserialize, 115)

    }

    /**
     * User-UserProfilePhoto
     * UserFull-User-UserProfilePhoto
     */
    @Test
    public fun test_UserProfilePhoto_TL_userProfilePhoto_layer126() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserProfilePhoto.TL_userProfilePhoto_layer126::class,
          space.axolab.axogram.tgnet.TLRPC.UserProfilePhoto::TLdeserialize, 126)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat-ChatPhoto
     * Chat-ChatPhoto
     */
    @Test
    public fun test_ChatPhoto_TL_chatPhoto_layer126() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatPhoto.TL_chatPhoto_layer126::class,
          space.axolab.axogram.tgnet.TLRPC.ChatPhoto::TLdeserialize, 126)

    }

    /**
     * UserFull-PeerSettings
     */
    @Test
    public fun test_PeerSettings_TL_peerSettings_layer134() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PeerSettings.TL_peerSettings_layer134::class,
          space.axolab.axogram.tgnet.TLRPC.PeerSettings::TLdeserialize, 134)

    }

    /**
     * Message-MessageMedia-Photo-VideoSize
     * Theme-Document-VideoSize
     * UserFull-Photo-VideoSize
     * ChatFull-Photo-VideoSize
     */
    @Test
    public fun test_VideoSize_TL_videoSize_layer127() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_VideoSize.TL_videoSize_layer127::class,
          space.axolab.axogram.tgnet.TLRPC.VideoSize::TLdeserialize, 127)

    }

    /**
     * Message-ReplyMarkup-KeyboardButtonRow-KeyboardButton
     */
    @Test
    public fun test_KeyboardButton_TL_keyboardButtonCallback_layer221() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonCallback_layer221::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, 221)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_message_layer123() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_message_layer123::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 123)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_messageService_layer123() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_messageService_layer123::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 123)

    }

    /**
     * Message-MessageFwdHeader
     */
    @Test
    public fun test_MessageFwdHeader_TL_messageFwdHeader_layer169() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageFwdHeader.TL_messageFwdHeader_layer169::class,
          space.axolab.axogram.tgnet.TLRPC.MessageFwdHeader::TLdeserialize, 169)

    }

    /**
     * Message-MessageMedia-Photo-PhotoSize
     * Theme-Document-PhotoSize
     * UserFull-Photo-PhotoSize
     * ChatFull-Photo-PhotoSize
     */
    @Test
    public fun test_PhotoSize_TL_photoSizeProgressive_layer127() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PhotoSize.TL_photoSizeProgressive_layer127::class,
          space.axolab.axogram.tgnet.TLRPC.PhotoSize::TLdeserialize, 127)

    }

    /**
     * Message-MessageReplyHeader
     */
    @Test
    public fun test_MessageReplyHeader_TL_messageReplyHeader_layer165() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageReplyHeader.TL_messageReplyHeader_layer165::class,
          space.axolab.axogram.tgnet.TLRPC.MessageReplyHeader::TLdeserialize, 165)

    }

    /**
     * Message-MessageReplies
     */
    @Test
    public fun test_MessageReplies_TL_messageReplies_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageReplies.TL_messageReplies_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.MessageReplies::TLdeserialize, 132)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_chatFull_layer122() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_chatFull_layer122::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 122)

    }

    /**
     * ForumTopic-DraftMessage-InputMedia
     */
    @Test
    public fun test_InputMedia_TL_inputMediaDocument_layer197() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputMedia.TL_inputMediaDocument_layer197::class,
          space.axolab.axogram.tgnet.TLRPC.InputMedia::TLdeserialize, 197)

    }

    /**
     * ChatFull-StickerSet
     */
    @Test
    public fun test_StickerSet_TL_stickerSet_layer126() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StickerSet.TL_stickerSet_layer126::class,
          space.axolab.axogram.tgnet.TLRPC.StickerSet::TLdeserialize, 126)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_channelFull_layer122() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull_layer122::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 122)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionInviteToGroupCall_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionInviteToGroupCall_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 132)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_chatFull_layer123() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_chatFull_layer123::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 123)

    }

    /**
     * ChatFull-ExportedChatInvite
     */
    @Test
    public fun test_ExportedChatInvite_TL_chatInviteExported_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ExportedChatInvite.TL_chatInviteExported_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.ExportedChatInvite::TLdeserialize, 132)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_channelFull_layer123() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull_layer123::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 123)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_chatFull_layer124() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_chatFull_layer124::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 124)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_message_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_message_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 132)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_messageService_layer195() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_messageService_layer195::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 195)

    }

    /**
     * UserFull
     */
    @Test
    public fun test_UserFull_TL_userFull_layer131() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserFull.TL_userFull_layer131::class,
          space.axolab.axogram.tgnet.TLRPC.UserFull::TLdeserialize, 131)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_channelFull_layer124() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull_layer124::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 124)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionSetMessagesTTL_layer149() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionSetMessagesTTL_layer149::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 149)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_chatFull_layer131() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_chatFull_layer131::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 131)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_channelFull_layer131() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull_layer131::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 131)

    }

    /**
     * User-UserProfilePhoto
     * UserFull-User-UserProfilePhoto
     */
    @Test
    public fun test_UserProfilePhoto_TL_userProfilePhoto_layer127() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserProfilePhoto.TL_userProfilePhoto_layer127::class,
          space.axolab.axogram.tgnet.TLRPC.UserProfilePhoto::TLdeserialize, 127)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat-ChatPhoto
     * Chat-ChatPhoto
     */
    @Test
    public fun test_ChatPhoto_TL_chatPhoto_layer127() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatPhoto.TL_chatPhoto_layer127::class,
          space.axolab.axogram.tgnet.TLRPC.ChatPhoto::TLdeserialize, 127)

    }

    /**
     * ChatFull-StickerSet
     */
    @Test
    public fun test_StickerSet_TL_stickerSet_layer143() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StickerSet.TL_stickerSet_layer143::class,
          space.axolab.axogram.tgnet.TLRPC.StickerSet::TLdeserialize, 143)

    }

    /**
     * Message-MessageAction-WallPaper-WallPaperSettings
     * StoryItem-MessageMedia-WebPage-WebPageAttribute-ThemeSettings-WallPaper-WallPaperSettings
     * Theme-ThemeSettings-WallPaper-WallPaperSettings
     * UserFull-WallPaper-WallPaperSettings
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-ThemeSettings-WallPaper-WallPaperSettings
     */
    @Test
    public fun test_WallPaperSettings_TL_wallPaperSettings_layer167() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_WallPaperSettings.TL_wallPaperSettings_layer167::class,
          space.axolab.axogram.tgnet.TLRPC.WallPaperSettings::TLdeserialize, 167)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_chatFull_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_chatFull_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 132)

    }

    /**
     * UserFull
     */
    @Test
    public fun test_UserFull_TL_userFull_layer134() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserFull.TL_userFull_layer134::class,
          space.axolab.axogram.tgnet.TLRPC.UserFull::TLdeserialize, 134)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_channelFull_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 132)

    }

    /**
     * Theme
     */
    @Test
    public fun test_Theme_TL_theme_layer133() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Theme.TL_theme_layer133::class,
          space.axolab.axogram.tgnet.TLRPC.Theme::TLdeserialize, 133)

    }

    /**
     * Message-MessageMedia-WebPage-WebPageAttribute-ThemeSettings
     * Theme-ThemeSettings
     */
    @Test
    public fun test_ThemeSettings_TL_themeSettings_layer132() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ThemeSettings.TL_themeSettings_layer132::class,
          space.axolab.axogram.tgnet.TLRPC.ThemeSettings::TLdeserialize, 132)
          test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ThemeSettings.TL_themeSettings_layer132::class,
              space.axolab.axogram.tgnet.TLRPC.TL_themeSettings::TLdeserialize, 132)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionSetChatTheme_layer213() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionSetChatTheme_layer213::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 213)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_chatFull_layer133() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_chatFull_layer133::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 133)

    }

    /**
     * ChatFull-ChatParticipants-ChatParticipant
     */
    @Test
    public fun test_ChatParticipant_TL_chatParticipant_layer222() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatParticipant.TL_chatParticipant_layer222::class,
          space.axolab.axogram.tgnet.TLRPC.ChatParticipant::TLdeserialize, 222)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_message_layer135() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_message_layer135::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 135)

    }

    /**
     * ChatFull-ExportedChatInvite
     */
    @Test
    public fun test_ExportedChatInvite_TL_chatInviteExported_layer133() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ExportedChatInvite.TL_chatInviteExported_layer133::class,
          space.axolab.axogram.tgnet.TLRPC.ExportedChatInvite::TLdeserialize, 133)

    }

    /**
     * User
     */
    @Test
    public fun test_User_TL_user_layer144() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_User.TL_user_layer144::class,
          space.axolab.axogram.tgnet.TLRPC.User::TLdeserialize, 144)

    }

    /**
     * UserFull-BotInfo
     * ChatFull-BotInfo
     */
    @Test
    public fun test_BotInfo_TL_botInfo_layer139() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BotInfo.TL_botInfo_layer139::class,
          space.axolab.axogram.tgnet.tl.TL_bots.BotInfo::TLdeserialize, 139)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat
     * Chat
     */
    @Test
    public fun test_Chat_TL_channel_layer147() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_channel_layer147::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, 147)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_channelFull_layer133() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull_layer133::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 133)

    }

    /**
     * ChatFull-ChatParticipants-ChatParticipant
     */
    @Test
    public fun test_ChatParticipant_TL_chatParticipantCreator_layer222() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatParticipant.TL_chatParticipantCreator_layer222::class,
          space.axolab.axogram.tgnet.TLRPC.ChatParticipant::TLdeserialize, 222)

    }

    /**
     * ChatFull-ChatParticipants-ChatParticipant
     */
    @Test
    public fun test_ChatParticipant_TL_chatParticipantAdmin_layer222() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatParticipant.TL_chatParticipantAdmin_layer222::class,
          space.axolab.axogram.tgnet.TLRPC.ChatParticipant::TLdeserialize, 222)

    }

    /**
     * Message-MessageMedia-PollResults
     */
    @Test
    public fun test_PollResults_TL_pollResults_layer158() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PollResults.TL_pollResults_layer158::class,
          space.axolab.axogram.tgnet.TLRPC.PollResults::TLdeserialize, 158)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_chatFull_layer135() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_chatFull_layer135::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 135)

    }

    /**
     * ChatFull-ExportedChatInvite
     */
    @Test
    public fun test_ExportedChatInvite_TL_chatInviteExported_layer185() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ExportedChatInvite.TL_chatInviteExported_layer185::class,
          space.axolab.axogram.tgnet.TLRPC.ExportedChatInvite::TLdeserialize, 185)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_channelFull_layer134() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull_layer134::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 134)

    }

    /**
     * UserFull-PeerSettings
     */
    @Test
    public fun test_PeerSettings_TL_peerSettings_layer176() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PeerSettings.TL_peerSettings_layer176::class,
          space.axolab.axogram.tgnet.TLRPC.PeerSettings::TLdeserialize, 176)

    }

    /**
     * UserFull
     */
    @Test
    public fun test_UserFull_TL_userFull_layer139() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserFull.TL_userFull_layer139::class,
          space.axolab.axogram.tgnet.TLRPC.UserFull::TLdeserialize, 139)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_channelFull_layer135() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull_layer135::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 135)

    }

    /**
     * Message-ReplyMarkup-KeyboardButtonRow-KeyboardButton
     */
    @Test
    public fun test_KeyboardButton_TL_inputKeyboardButtonUserProfile_layer221() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_inputKeyboardButtonUserProfile_layer221::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, 221)

    }

    /**
     * Message-ReplyMarkup-KeyboardButtonRow-KeyboardButton
     */
    @Test
    public fun test_KeyboardButton_TL_keyboardButtonUserProfile_layer221() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonUserProfile_layer221::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, 221)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_chatFull_layer144() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_chatFull_layer144::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 144)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_message_layer169() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_message_layer169::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 169)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_channelFull_layer139() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull_layer139::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 139)

    }

    /**
     * Message-MessageReactions-ReactionCount
     */
    @Test
    public fun test_ReactionCount_TL_reactionCount_layer144() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ReactionCount.TL_reactionCount_layer144::class,
          space.axolab.axogram.tgnet.TLRPC.ReactionCount::TLdeserialize, 144)

    }

    /**
     * Message-MessageReactions
     */
    @Test
    public fun test_MessageReactions_TL_messageReactions_layer137() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageReactions.TL_messageReactions_layer137::class,
          space.axolab.axogram.tgnet.TLRPC.MessageReactions::TLdeserialize, 137)

    }

    /**
     * Message-MessageReactions-MessageUserReaction
     */
    @Test
    public fun test_MessageUserReaction_TL_messageUserReaction_layer137() {
      assumeTrue("Test skipped, link error", false)

    }

    /**
     * Message-MessageReactions
     */
    @Test
    public fun test_MessageReactions_TL_messageReactions_layer185() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageReactions.TL_messageReactions_layer185::class,
          space.axolab.axogram.tgnet.TLRPC.MessageReactions::TLdeserialize, 185)

    }

    /**
     * Message-MessageReactions-MessagePeerReaction
     */
    @Test
    public fun test_MessagePeerReaction_TL_messagePeerReaction_layer144() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessagePeerReaction.TL_messagePeerReaction_layer144::class,
          space.axolab.axogram.tgnet.TLRPC.MessagePeerReaction::TLdeserialize, 144)

    }

    /**
     * UserFull-PeerNotifySettings
     * ChatFull-PeerNotifySettings
     * ForumTopic-PeerNotifySettings
     */
    @Test
    public fun test_PeerNotifySettings_TL_peerNotifySettings_layer159() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PeerNotifySettings.TL_peerNotifySettings_layer159::class,
          space.axolab.axogram.tgnet.TLRPC.PeerNotifySettings::TLdeserialize, 159)

    }

    /**
     * UserFull
     */
    @Test
    public fun test_UserFull_TL_userFull_layer143() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserFull.TL_userFull_layer143::class,
          space.axolab.axogram.tgnet.TLRPC.UserFull::TLdeserialize, 143)

    }

    /**
     * UserFull-BotInfo
     * ChatFull-BotInfo
     */
    @Test
    public fun test_BotInfo_TL_botInfo_layer142() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BotInfo.TL_botInfo_layer142::class,
          space.axolab.axogram.tgnet.tl.TL_bots.BotInfo::TLdeserialize, 142)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_channelFull_layer144() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull_layer144::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 144)

    }

    /**
     * Message-ReplyMarkup-KeyboardButtonRow-KeyboardButton
     */
    @Test
    public fun test_KeyboardButton_TL_keyboardButtonWebView_layer221() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonWebView_layer221::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, 221)

    }

    /**
     * Message-ReplyMarkup-KeyboardButtonRow-KeyboardButton
     */
    @Test
    public fun test_KeyboardButton_TL_keyboardButtonSimpleWebView_layer221() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonSimpleWebView_layer221::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, 221)

    }

    /**
     * UserFull-BotInfo
     * ChatFull-BotInfo
     */
    @Test
    public fun test_BotInfo_TL_botInfo_layer185() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BotInfo.TL_botInfo_layer185::class,
          space.axolab.axogram.tgnet.tl.TL_bots.BotInfo::TLdeserialize, 185)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionPaymentSent_layer193() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionPaymentSent_layer193::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 193)

    }

    /**
     * UserFull
     */
    @Test
    public fun test_UserFull_TL_userFull_layer150() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserFull.TL_userFull_layer150::class,
          space.axolab.axogram.tgnet.TLRPC.UserFull::TLdeserialize, 150)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionGiftPremium_layer156() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionGiftPremium_layer156::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 156)

    }

    /**
     * UserFull-PremiumGiftOption
     */
    @Test
    public fun test_PremiumGiftOption_TL_premiumGiftOption_layer199() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PremiumGiftOption.TL_premiumGiftOption_layer199::class,
          space.axolab.axogram.tgnet.TLRPC.TL_premiumGiftOption::TLdeserialize, 199)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_chatFull_layer177() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_chatFull_layer177::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 177)

    }

    /**
     * User
     */
    @Test
    public fun test_User_TL_user_layer147() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_User.TL_user_layer147::class,
          space.axolab.axogram.tgnet.TLRPC.User::TLdeserialize, 147)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_channelFull_layer163() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull_layer163::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 163)

    }

    /**
     * Message-MessageReactions-MessagePeerReaction
     */
    @Test
    public fun test_MessagePeerReaction_TL_messagePeerReaction_layer154() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessagePeerReaction.TL_messagePeerReaction_layer154::class,
          space.axolab.axogram.tgnet.TLRPC.MessagePeerReaction::TLdeserialize, 154)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat-EmojiStatus
     * StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat-EmojiStatus
     * Chat-EmojiStatus
     * User-EmojiStatus
     * UserFull-PeerStories-StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat-EmojiStatus
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat-EmojiStatus
     * StarsTransaction-MessageMedia-WebPage-Page-PageBlock-Chat-EmojiStatus
     */
    @Test
    public fun test_EmojiStatus_TL_emojiStatus_layer197() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_EmojiStatus.TL_emojiStatus_layer197::class,
          space.axolab.axogram.tgnet.TLRPC.EmojiStatus::TLdeserialize, 197)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat-EmojiStatus
     * StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat-EmojiStatus
     * Chat-EmojiStatus
     * User-EmojiStatus
     * UserFull-PeerStories-StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat-EmojiStatus
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat-EmojiStatus
     * StarsTransaction-MessageMedia-WebPage-Page-PageBlock-Chat-EmojiStatus
     */
    @Test
    public fun test_EmojiStatus_TL_emojiStatusUntil_layer197() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_EmojiStatus.TL_emojiStatusUntil_layer197::class,
          space.axolab.axogram.tgnet.TLRPC.EmojiStatus::TLdeserialize, 197)

    }

    /**
     * ForumTopic-DraftMessage-InputMedia
     */
    @Test
    public fun test_InputMedia_TL_inputMediaInvoice_layer180() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputMedia.TL_inputMediaInvoice_layer180::class,
          space.axolab.axogram.tgnet.TLRPC.InputMedia::TLdeserialize, 180)

    }

    /**
     * User
     */
    @Test
    public fun test_User_TL_user_layer159() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_User.TL_user_layer159::class,
          space.axolab.axogram.tgnet.TLRPC.User::TLdeserialize, 159)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat
     * StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat
     * Chat
     * UserFull-UserStories-StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat
     */
    @Test
    public fun test_Chat_TL_channel_layer163() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_channel_layer163::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, 163)

    }

    /**
     * ForumTopic
     */
    @Test
    public fun test_ForumTopic_TL_forumTopic_layer215() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ForumTopic.TL_forumTopic_layer215::class,
          space.axolab.axogram.tgnet.TLRPC.ForumTopic::TLdeserialize, 215)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionTopicEdit_layer149() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionTopicEdit_layer149::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 149)

    }

    /**
     * UserFull
     */
    @Test
    public fun test_UserFull_TL_userFull_layer157() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserFull.TL_userFull_layer157::class,
          space.axolab.axogram.tgnet.TLRPC.UserFull::TLdeserialize, 157)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionAttachMenuBotAllowed_layer153() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionAttachMenuBotAllowed_layer153::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 153)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionRequestedPeer_layer168() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionRequestedPeer_layer168::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 168)

    }

    /**
     * Message-ReplyMarkup-KeyboardButtonRow-KeyboardButton
     */
    @Test
    public fun test_KeyboardButton_TL_keyboardButtonRequestPeer_layer168() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonRequestPeer_layer168::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, 168)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionGiftPremium_layer189() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionGiftPremium_layer189::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 189)

    }

    /**
     * UserFull
     */
    @Test
    public fun test_UserFull_TL_userFull_layer159() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserFull.TL_userFull_layer159::class,
          space.axolab.axogram.tgnet.TLRPC.UserFull::TLdeserialize, 159)

    }

    /**
     * Message-ReplyMarkup-KeyboardButtonRow-KeyboardButton
     */
    @Test
    public fun test_KeyboardButton_TL_keyboardButtonSwitchInline_layer221() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonSwitchInline_layer221::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, 221)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionSetChatWallPaper_layer166() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionSetChatWallPaper_layer166::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 166)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionSetSameChatWallPaper_layer166() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionSetSameChatWallPaper_layer166::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 166)

    }

    /**
     * Message-MessageMedia-PollResults
     * StoryItem-MessageMedia-PollResults
     * UserFull-PeerStories-StoryItem-MessageMedia-PollResults
     * ChatFull-PeerStories-StoryItem-MessageMedia-PollResults
     * StarsTransaction-MessageMedia-PollResults
     */
    @Test
    public fun test_PollResults_TL_pollResults_layer223() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PollResults.TL_pollResults_layer223::class,
          space.axolab.axogram.tgnet.TLRPC.PollResults::TLdeserialize, 223)

    }

    /**
     * UserFull
     */
    @Test
    public fun test_UserFull_TL_userFull_layer163() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserFull.TL_userFull_layer163::class,
          space.axolab.axogram.tgnet.TLRPC.UserFull::TLdeserialize, 163)

    }

    /**
     * Message-MessageMedia
     * StoryItem-MessageMedia
     * UserFull-PeerStories-StoryItem-MessageMedia
     * ChatFull-PeerStories-StoryItem-MessageMedia
     * StarsTransaction-MessageMedia
     */
    @Test
    public fun test_MessageMedia_TL_messageMediaDocument_layer187() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaDocument_layer187::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, 187)

    }

    /**
     * Message-MessageMedia-Document-DocumentAttribute
     * StoryItem-MessageMedia-Document-DocumentAttribute
     * Theme-Document-DocumentAttribute
     * UserFull-BotInfo-Document-DocumentAttribute
     * ChatFull-BotInfo-Document-DocumentAttribute
     * StarsTransaction-WebDocument-DocumentAttribute
     * ForumTopic-DraftMessage-InputMedia-DocumentAttribute
     */
    @Test
    public fun test_DocumentAttribute_TL_documentAttributeVideo_layer184() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DocumentAttribute.TL_documentAttributeVideo_layer184::class,
          space.axolab.axogram.tgnet.TLRPC.DocumentAttribute::TLdeserialize, 184)

    }

    /**
     * User
     */
    @Test
    public fun test_User_TL_user_layer165() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_User.TL_user_layer165::class,
          space.axolab.axogram.tgnet.TLRPC.User::TLdeserialize, 165)

    }

    /**
     * Message-MessageMedia-StoryItem-StoryViews
     * StoryItem-StoryViews
     * UserFull-UserStories-StoryItem-StoryViews
     */
    @Test
    public fun test_StoryViews_TL_storyViews_layer160() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StoryViews.TL_storyViews_layer160::class,
          space.axolab.axogram.tgnet.tl.TL_stories.StoryViews::TLdeserialize, 160)

    }

    /**
     * Message-MessageMedia-StoryItem
     * StoryItem
     * UserFull-UserStories-StoryItem
     */
    @Test
    public fun test_StoryItem_TL_storyItem_layer160() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StoryItem.TL_storyItem_layer160::class,
          space.axolab.axogram.tgnet.tl.TL_stories.StoryItem::TLdeserialize, 160)

    }

    /**
     * UserFull-UserStories
     */
    @Test
    public fun test_UserStories_TL_userStories_layer163() {
      assumeTrue("Test skipped, link error", false)

    }

    /**
     * ForumTopic-DraftMessage-InputReplyTo
     */
    @Test
    public fun test_InputReplyTo_TL_inputReplyToStory_layer173() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputReplyTo.TL_inputReplyToStory_layer173::class,
          space.axolab.axogram.tgnet.TLRPC.InputReplyTo::TLdeserialize, 173)

    }

    /**
     * Message-MessageReplyHeader
     */
    @Test
    public fun test_MessageReplyHeader_TL_messageReplyStoryHeader_layer173() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageReplyHeader.TL_messageReplyStoryHeader_layer173::class,
          space.axolab.axogram.tgnet.TLRPC.MessageReplyHeader::TLdeserialize, 173)

    }

    /**
     * Message-MessageMedia
     * StoryItem-MessageMedia
     * UserFull-UserStories-StoryItem-MessageMedia
     */
    @Test
    public fun test_MessageMedia_TL_messageMediaStory_layer163() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaStory_layer163::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, 163)

    }

    /**
     * Message-MessageMedia-WebPage-WebPageAttribute
     * StoryItem-MessageMedia-WebPage-WebPageAttribute
     * UserFull-UserStories-StoryItem-MessageMedia-WebPage-WebPageAttribute
     */
    @Test
    public fun test_WebPageAttribute_TL_webPageAttributeStory_layer163() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_WebPageAttribute.TL_webPageAttributeStory_layer163::class,
          space.axolab.axogram.tgnet.TLRPC.WebPageAttribute::TLdeserialize, 163)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_message_layer173() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_message_layer173::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 173)

    }

    /**
     * UserFull
     */
    @Test
    public fun test_UserFull_TL_userFull_layer175() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserFull.TL_userFull_layer175::class,
          space.axolab.axogram.tgnet.TLRPC.UserFull::TLdeserialize, 175)

    }

    /**
     * User
     */
    @Test
    public fun test_User_TL_user_layer184() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_User.TL_user_layer184::class,
          space.axolab.axogram.tgnet.TLRPC.User::TLdeserialize, 184)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat
     * StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat
     * Chat
     * UserFull-PeerStories-StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat
     * StarsTransaction-MessageMedia-WebPage-Page-PageBlock-Chat
     */
    @Test
    public fun test_Chat_TL_channel_layer185() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_channel_layer185::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, 185)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_channelFull_layer173() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull_layer173::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 173)

    }

    /**
     * ForumTopic-DraftMessage
     */
    @Test
    public fun test_DraftMessage_TL_draftMessage_layer181() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DraftMessage.TL_draftMessage_layer181::class,
          space.axolab.axogram.tgnet.TLRPC.DraftMessage::TLdeserialize, 181)

    }

    /**
     * ForumTopic-DraftMessage-InputMedia-Invoice
     */
    @Test
    public fun test_Invoice_TL_invoice_layer192() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Invoice.TL_invoice_layer192::class,
          space.axolab.axogram.tgnet.TLRPC.TL_invoice::TLdeserialize, 192)

    }

    /**
     * Message-MessageReplyHeader
     */
    @Test
    public fun test_MessageReplyHeader_TL_messageReplyHeader_layer207() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageReplyHeader.TL_messageReplyHeader_layer207::class,
          space.axolab.axogram.tgnet.TLRPC.MessageReplyHeader::TLdeserialize, 207)

    }

    /**
     * Message-ReplyMarkup-KeyboardButtonRow-KeyboardButton
     */
    @Test
    public fun test_KeyboardButton_TL_keyboardButtonRequestPeer_layer221() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonRequestPeer_layer221::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, 221)

    }

    /**
     * Message-MessageMedia-StoryItem
     * StoryItem
     * UserFull-PeerStories-StoryItem
     * ChatFull-PeerStories-StoryItem
     */
    @Test
    public fun test_StoryItem_TL_storyItem_layer173() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StoryItem.TL_storyItem_layer173::class,
          space.axolab.axogram.tgnet.tl.TL_stories.StoryItem::TLdeserialize, 173)

    }

    /**
     * ForumTopic-DraftMessage-InputReplyTo
     */
    @Test
    public fun test_InputReplyTo_TL_inputReplyToMessage_layer203() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputReplyTo.TL_inputReplyToMessage_layer203::class,
          space.axolab.axogram.tgnet.TLRPC.InputReplyTo::TLdeserialize, 203)

    }

    /**
     * Message-MessageMedia-StoryItem-MediaArea-MediaAreaCoordinates
     * StoryItem-MediaArea-MediaAreaCoordinates
     * UserFull-PeerStories-StoryItem-MediaArea-MediaAreaCoordinates
     * ChatFull-PeerStories-StoryItem-MediaArea-MediaAreaCoordinates
     */
    @Test
    public fun test_MediaAreaCoordinates_TL_mediaAreaCoordinates_layer181() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MediaAreaCoordinates.TL_mediaAreaCoordinates_layer181::class,
          space.axolab.axogram.tgnet.tl.TL_stories.MediaAreaCoordinates::TLdeserialize, 181)

    }

    /**
     * Message-MessageMedia-StoryItem-MediaArea
     * StoryItem-MediaArea
     * UserFull-PeerStories-StoryItem-MediaArea
     * ChatFull-PeerStories-StoryItem-MediaArea
     */
    @Test
    public fun test_MediaArea_TL_mediaAreaGeoPoint_layer181() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MediaArea.TL_mediaAreaGeoPoint_layer181::class,
          space.axolab.axogram.tgnet.tl.TL_stories.MediaArea::TLdeserialize, 181)

    }

    /**
     * InputStorePaymentPurpose
     */
    @Test
    public fun test_InputStorePaymentPurpose_TL_inputStorePaymentPremiumGiftCode_layer189() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputStorePaymentPurpose.TL_inputStorePaymentPremiumGiftCode_layer189::class,
          space.axolab.axogram.tgnet.TLRPC.InputStorePaymentPurpose::TLdeserialize, 189)

    }

    /**
     * Message-MessageMedia
     * StoryItem-MessageMedia
     * UserFull-PeerStories-StoryItem-MessageMedia
     * ChatFull-PeerStories-StoryItem-MessageMedia
     * StarsTransaction-MessageMedia
     */
    @Test
    public fun test_MessageMedia_TL_messageMediaGiveaway_layer186() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaGiveaway_layer186::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, 186)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionGiftCode_layer189() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionGiftCode_layer189::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 189)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionGiveawayLaunch_layer186() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionGiveawayLaunch_layer186::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 186)

    }

    /**
     * Message-MessageEntity
     * StoryItem-MessageEntity
     * UserFull-PeerStories-StoryItem-MessageEntity
     * ChatFull-PeerStories-StoryItem-MessageEntity
     * ForumTopic-DraftMessage-MessageEntity
     */
    @Test
    public fun test_MessageEntity_TL_messageEntityBlockquote_layer180() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageEntity.TL_messageEntityBlockquote_layer180::class,
          space.axolab.axogram.tgnet.TLRPC.MessageEntity::TLdeserialize, 180)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionGiveawayResults_layer186() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionGiveawayResults_layer186::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 186)

    }

    /**
     * Message-MessageMedia
     * StoryItem-MessageMedia
     * UserFull-PeerStories-StoryItem-MessageMedia
     * ChatFull-PeerStories-StoryItem-MessageMedia
     * StarsTransaction-MessageMedia
     */
    @Test
    public fun test_MessageMedia_TL_messageMediaGiveawayResults_layer186() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaGiveawayResults_layer186::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, 186)

    }

    /**
     * Message-MessageMedia-StoryItem-StoryViews
     * StoryItem-StoryViews
     * UserFull-UserStories-StoryItem-StoryViews
     */
    @Test
    public fun test_StoryViews_TL_storyViews_layer163() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StoryViews.TL_storyViews_layer163::class,
          space.axolab.axogram.tgnet.tl.TL_stories.StoryViews::TLdeserialize, 163)

    }

    /**
     * Message-MessageMedia-StoryItem
     * StoryItem
     * UserFull-PeerStories-StoryItem
     * ChatFull-PeerStories-StoryItem
     */
    @Test
    public fun test_StoryItem_TL_storyItem_layer166() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StoryItem.TL_storyItem_layer166::class,
          space.axolab.axogram.tgnet.tl.TL_stories.StoryItem::TLdeserialize, 166)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat
     * StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat
     * Chat
     * UserFull-PeerStories-StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat
     */
    @Test
    public fun test_Chat_TL_channel_layer165() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_channel_layer165::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, 165)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_channelFull_layer167() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull_layer167::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 167)

    }

    /**
     * User
     */
    @Test
    public fun test_User_TL_user_layer166() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_User.TL_user_layer166::class,
          space.axolab.axogram.tgnet.TLRPC.User::TLdeserialize, 166)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat
     * StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat
     * Chat
     * UserFull-PeerStories-StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat
     */
    @Test
    public fun test_Chat_TL_channel_layer166() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_channel_layer166::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, 166)

    }

    /**
     * Message-MessageReplyHeader
     */
    @Test
    public fun test_MessageReplyHeader_TL_messageReplyHeader_layer166() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageReplyHeader.TL_messageReplyHeader_layer166::class,
          space.axolab.axogram.tgnet.TLRPC.MessageReplyHeader::TLdeserialize, 166)

    }

    /**
     * ForumTopic-DraftMessage-InputReplyTo
     */
    @Test
    public fun test_InputReplyTo_TL_inputReplyToMessage_layer166() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputReplyTo.TL_inputReplyToMessage_layer166::class,
          space.axolab.axogram.tgnet.TLRPC.InputReplyTo::TLdeserialize, 166)

    }

    /**
     * InputStorePaymentPurpose
     */
    @Test
    public fun test_InputStorePaymentPurpose_TL_inputStorePaymentPremiumGiveaway_layer167() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputStorePaymentPurpose.TL_inputStorePaymentPremiumGiveaway_layer167::class,
          space.axolab.axogram.tgnet.TLRPC.InputStorePaymentPurpose::TLdeserialize, 167)

    }

    /**
     * Message-MessageMedia
     * StoryItem-MessageMedia
     * UserFull-PeerStories-StoryItem-MessageMedia
     * ChatFull-PeerStories-StoryItem-MessageMedia
     */
    @Test
    public fun test_MessageMedia_TL_messageMediaGiveaway_layer167() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaGiveaway_layer167::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, 167)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionGiftCode_layer167() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionGiftCode_layer167::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 167)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat
     * StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat
     * Chat
     * UserFull-PeerStories-StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat
     */
    @Test
    public fun test_Chat_TL_channel_layer167() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_channel_layer167::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, 167)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_message_layer175() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_message_layer175::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 175)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_channelFull_layer177() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull_layer177::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 177)

    }

    /**
     * Message-MessageMedia-StoryItem
     * StoryItem
     * UserFull-PeerStories-StoryItem
     * ChatFull-PeerStories-StoryItem
     * StarsTransaction-MessageMedia-StoryItem
     */
    @Test
    public fun test_StoryItem_TL_storyItem_layer210() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StoryItem.TL_storyItem_layer210::class,
          space.axolab.axogram.tgnet.tl.TL_stories.StoryItem::TLdeserialize, 210)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_message_layer176() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_message_layer176::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 176)

    }

    /**
     * UserFull
     */
    @Test
    public fun test_UserFull_TL_userFull_layer176() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserFull.TL_userFull_layer176::class,
          space.axolab.axogram.tgnet.TLRPC.UserFull::TLdeserialize, 176)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_message_layer179() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_message_layer179::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 179)

    }

    /**
     * UserFull-PeerSettings
     */
    @Test
    public fun test_PeerSettings_TL_peerSettings_layer199() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PeerSettings.TL_peerSettings_layer199::class,
          space.axolab.axogram.tgnet.TLRPC.PeerSettings::TLdeserialize, 199)

    }

    /**
     * UserFull
     */
    @Test
    public fun test_UserFull_TL_userFull_layer188() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserFull.TL_userFull_layer188::class,
          space.axolab.axogram.tgnet.TLRPC.UserFull::TLdeserialize, 188)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_channelFull_layer195() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull_layer195::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 195)

    }

    /**
     * Message-MessageMedia-Poll-PollAnswer
     * StoryItem-MessageMedia-Poll-PollAnswer
     * UserFull-PeerStories-StoryItem-MessageMedia-Poll-PollAnswer
     * ChatFull-PeerStories-StoryItem-MessageMedia-Poll-PollAnswer
     * StarsTransaction-MessageMedia-Poll-PollAnswer
     * ForumTopic-DraftMessage-InputMedia-Poll-PollAnswer
     */
    @Test
    public fun test_PollAnswer_TL_pollAnswer_layer223() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_PollAnswer.TL_pollAnswer_layer223::class,
          space.axolab.axogram.tgnet.TLRPC.PollAnswer::TLdeserialize, 223)

    }

    /**
     * Message-MessageMedia-Poll
     * StoryItem-MessageMedia-Poll
     * UserFull-PeerStories-StoryItem-MessageMedia-Poll
     * ChatFull-PeerStories-StoryItem-MessageMedia-Poll
     * StarsTransaction-MessageMedia-Poll
     * ForumTopic-DraftMessage-InputMedia-Poll
     */
    @Test
    public fun test_Poll_TL_poll_layer223() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Poll.TL_poll_layer223::class,
          space.axolab.axogram.tgnet.TLRPC.Poll::TLdeserialize, 223)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_message_layer180() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_message_layer180::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 180)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_message_layer195() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_message_layer195::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 195)

    }

    /**
     * InputStorePaymentPurpose
     */
    @Test
    public fun test_InputStorePaymentPurpose_TL_inputStorePaymentStars_layer184() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputStorePaymentPurpose.TL_inputStorePaymentStars_layer184::class,
          space.axolab.axogram.tgnet.TLRPC.InputStorePaymentPurpose::TLdeserialize, 184)

    }

    /**
     * StarsTransaction
     */
    @Test
    public fun test_StarsTransaction_TL_starsTransaction_layer181() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarsTransaction.TL_starsTransaction_layer181::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarsTransaction::TLdeserialize, 181)

    }

    /**
     * ForumTopic-DraftMessage
     */
    @Test
    public fun test_DraftMessage_TL_draftMessage_layer205() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DraftMessage.TL_draftMessage_layer205::class,
          space.axolab.axogram.tgnet.TLRPC.DraftMessage::TLdeserialize, 205)

    }

    /**
     * StarsTransaction
     */
    @Test
    public fun test_StarsTransaction_TL_starsTransaction_layer182() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarsTransaction.TL_starsTransaction_layer182::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarsTransaction::TLdeserialize, 182)

    }

    /**
     * StarsTransaction
     */
    @Test
    public fun test_StarsTransaction_TL_starsTransaction_layer185() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarsTransaction.TL_starsTransaction_layer185::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarsTransaction::TLdeserialize, 185)

    }

    /**
     * ForumTopic-DraftMessage-InputMedia
     */
    @Test
    public fun test_InputMedia_TL_inputMediaPaidMedia_layer186() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputMedia.TL_inputMediaPaidMedia_layer186::class,
          space.axolab.axogram.tgnet.TLRPC.InputMedia::TLdeserialize, 186)

    }

    /**
     * Message-MessageMedia-Document-DocumentAttribute
     * StoryItem-MessageMedia-Document-DocumentAttribute
     * Theme-Document-DocumentAttribute
     * UserFull-BotInfo-Document-DocumentAttribute
     * ChatFull-BotInfo-Document-DocumentAttribute
     * StarsTransaction-WebDocument-DocumentAttribute
     * ForumTopic-DraftMessage-InputMedia-DocumentAttribute
     */
    @Test
    public fun test_DocumentAttribute_TL_documentAttributeVideo_layer187() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_DocumentAttribute.TL_documentAttributeVideo_layer187::class,
          space.axolab.axogram.tgnet.TLRPC.DocumentAttribute::TLdeserialize, 187)

    }

    /**
     * User
     */
    @Test
    public fun test_User_TL_user_layer195() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_User.TL_user_layer195::class,
          space.axolab.axogram.tgnet.TLRPC.User::TLdeserialize, 195)

    }

    /**
     * InputStorePaymentPurpose
     */
    @Test
    public fun test_InputStorePaymentPurpose_TL_inputStorePaymentStarsTopup_layer212() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputStorePaymentPurpose.TL_inputStorePaymentStarsTopup_layer212::class,
          space.axolab.axogram.tgnet.TLRPC.InputStorePaymentPurpose::TLdeserialize, 212)

    }

    /**
     * UserFull-BotInfo
     * ChatFull-BotInfo
     */
    @Test
    public fun test_BotInfo_TL_botInfo_layer192() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BotInfo.TL_botInfo_layer192::class,
          space.axolab.axogram.tgnet.tl.TL_bots.BotInfo::TLdeserialize, 192)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat
     * StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat
     * Chat
     * UserFull-PeerStories-StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat
     * StarsTransaction-MessageMedia-WebPage-Page-PageBlock-Chat
     */
    @Test
    public fun test_Chat_TL_channel_layer195() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_channel_layer195::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, 195)

    }

    /**
     * StarsTransaction
     */
    @Test
    public fun test_StarsTransaction_TL_starsTransaction_layer186() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarsTransaction.TL_starsTransaction_layer186::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarsTransaction::TLdeserialize, 186)

    }

    /**
     * StarsTransaction
     */
    @Test
    public fun test_StarsTransaction_TL_starsTransaction_layer188() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarsTransaction.TL_starsTransaction_layer188::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarsTransaction::TLdeserialize, 188)

    }

    /**
     * Message-MessageMedia
     * StoryItem-MessageMedia
     * UserFull-PeerStories-StoryItem-MessageMedia
     * ChatFull-PeerStories-StoryItem-MessageMedia
     * StarsTransaction-MessageMedia
     */
    @Test
    public fun test_MessageMedia_TL_messageMediaDocument_layer197() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageMedia.TL_messageMediaDocument_layer197::class,
          space.axolab.axogram.tgnet.TLRPC.MessageMedia::TLdeserialize, 197)

    }

    /**
     * Message-ReplyMarkup-KeyboardButtonRow-KeyboardButton
     */
    @Test
    public fun test_KeyboardButton_TL_keyboardButtonCopy_layer221() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_KeyboardButton.TL_keyboardButtonCopy_layer221::class,
          space.axolab.axogram.tgnet.TLRPC.KeyboardButton::TLdeserialize, 221)

    }

    /**
     * UserFull
     */
    @Test
    public fun test_UserFull_TL_userFull_layer194() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserFull.TL_userFull_layer194::class,
          space.axolab.axogram.tgnet.TLRPC.UserFull::TLdeserialize, 194)

    }

    /**
     * StarsTransaction
     */
    @Test
    public fun test_StarsTransaction_TL_starsTransaction_layer191() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarsTransaction.TL_starsTransaction_layer191::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarsTransaction::TLdeserialize, 191)

    }

    /**
     * Message-MessageAction-StarGift
     * StarsTransaction-StarGift
     * StarGift
     */
    @Test
    public fun test_StarGift_TL_starGift_layer190() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGift.TL_starGift_layer190::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGift::TLdeserialize, 190)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionStarGift_layer192() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionStarGift_layer192::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 192)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionGiftPremium_layer216() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionGiftPremium_layer216::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 216)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionGiftCode_layer216() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionGiftCode_layer216::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 216)

    }

    /**
     * Message-MessageAction-StarGift
     * StarsTransaction-StarGift
     * StarGift
     */
    @Test
    public fun test_StarGift_TL_starGift_layer195() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGift.TL_starGift_layer195::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGift::TLdeserialize, 195)

    }

    /**
     * StarsTransaction
     */
    @Test
    public fun test_StarsTransaction_TL_starsTransaction_layer194() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarsTransaction.TL_starsTransaction_layer194::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarsTransaction::TLdeserialize, 194)

    }

    /**
     * UserFull-BotInfo
     * ChatFull-BotInfo
     */
    @Test
    public fun test_BotInfo_TL_botInfo_layer195() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_BotInfo.TL_botInfo_layer195::class,
          space.axolab.axogram.tgnet.tl.TL_bots.BotInfo::TLdeserialize, 195)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionStarGift_layer195() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionStarGift_layer195::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 195)

    }

    /**
     * UserFull
     */
    @Test
    public fun test_UserFull_TL_userFull_layer195() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserFull.TL_userFull_layer195::class,
          space.axolab.axogram.tgnet.TLRPC.UserFull::TLdeserialize, 195)

    }

    /**
     * StarsTransaction
     */
    @Test
    public fun test_StarsTransaction_TL_starsTransaction_layer199() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarsTransaction.TL_starsTransaction_layer199::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarsTransaction::TLdeserialize, 199)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_message_layer199() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_message_layer199::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 199)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_messageService_layer204() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_messageService_layer204::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 204)

    }

    /**
     * UserFull
     */
    @Test
    public fun test_UserFull_TL_userFull_layer199() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserFull.TL_userFull_layer199::class,
          space.axolab.axogram.tgnet.TLRPC.UserFull::TLdeserialize, 199)

    }

    /**
     * User
     */
    @Test
    public fun test_User_TL_user_layer199() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_User.TL_user_layer199::class,
          space.axolab.axogram.tgnet.TLRPC.User::TLdeserialize, 199)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat
     * StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat
     * Chat
     * UserFull-PeerStories-StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat
     * StarsTransaction-MessageMedia-WebPage-Page-PageBlock-Chat
     */
    @Test
    public fun test_Chat_TL_channel_layer199() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_channel_layer199::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, 199)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_channelFull_layer197() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull_layer197::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 197)

    }

    /**
     * Message-MessageAction-StarGift
     * StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * UserFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * StarsTransaction-StarGift
     * StarGift
     * SavedStarGift-StarGift
     */
    @Test
    public fun test_StarGift_TL_starGift_layer202() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGift.TL_starGift_layer202::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGift::TLdeserialize, 202)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionStarGift_layer197() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionStarGift_layer197::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 197)

    }

    /**
     * Message-MessageAction-StarGift-StarGiftAttribute
     * StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift-StarGiftAttribute
     * UserFull-ChatTheme-StarGift-StarGiftAttribute
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift-StarGiftAttribute
     * StarsTransaction-StarGift-StarGiftAttribute
     * StarGift-StarGiftAttribute
     * SavedStarGift-StarGift-StarGiftAttribute
     */
    @Test
    public fun test_StarGiftAttribute_TL_starGiftAttributeModel_layer221() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGiftAttribute.TL_starGiftAttributeModel_layer221::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGiftAttribute::TLdeserialize, 221)

    }

    /**
     * Message-MessageAction-StarGift-StarGiftAttribute
     * StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift-StarGiftAttribute
     * UserFull-ChatTheme-StarGift-StarGiftAttribute
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift-StarGiftAttribute
     * StarsTransaction-StarGift-StarGiftAttribute
     * StarGift-StarGiftAttribute
     * SavedStarGift-StarGift-StarGiftAttribute
     */
    @Test
    public fun test_StarGiftAttribute_TL_starGiftAttributePattern_layer221() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGiftAttribute.TL_starGiftAttributePattern_layer221::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGiftAttribute::TLdeserialize, 221)

    }

    /**
     * Message-MessageAction-StarGift-StarGiftAttribute
     * StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift-StarGiftAttribute
     * UserFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift-StarGiftAttribute
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift-StarGiftAttribute
     * StarsTransaction-StarGift-StarGiftAttribute
     * StarGift-StarGiftAttribute
     * SavedStarGift-StarGift-StarGiftAttribute
     */
    @Test
    public fun test_StarGiftAttribute_TL_starGiftAttributeBackdrop_layer202() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGiftAttribute.TL_starGiftAttributeBackdrop_layer202::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGiftAttribute::TLdeserialize, 202)

    }

    /**
     * Message-MessageAction-StarGift-StarGiftAttribute
     * StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift-StarGiftAttribute
     * UserFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift-StarGiftAttribute
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift-StarGiftAttribute
     * StarsTransaction-StarGift-StarGiftAttribute
     * StarGift-StarGiftAttribute
     */
    @Test
    public fun test_StarGiftAttribute_TL_starGiftAttributeOriginalDetails_layer197() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGiftAttribute.TL_starGiftAttributeOriginalDetails_layer197::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGiftAttribute::TLdeserialize, 197)

    }

    /**
     * Message-MessageAction-StarGift
     * StarsTransaction-StarGift
     * StarGift
     */
    @Test
    public fun test_StarGift_TL_starGiftUnique_layer196() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGift.TL_starGiftUnique_layer196::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGift::TLdeserialize, 196)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionStarGiftUnique_layer197() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionStarGiftUnique_layer197::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 197)

    }

    /**
     * Message-MessageAction-StarGift
     * StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * UserFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * StarsTransaction-StarGift
     * StarGift
     */
    @Test
    public fun test_StarGift_TL_starGiftUnique_layer197() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGift.TL_starGiftUnique_layer197::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGift::TLdeserialize, 197)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_channelFull_layer204() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull_layer204::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 204)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionStarGift_layer211() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionStarGift_layer211::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 211)

    }

    /**
     * Message-MessageAction-StarGift
     * StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * UserFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * StarsTransaction-StarGift
     * StarGift
     * SavedStarGift-StarGift
     */
    @Test
    public fun test_StarGift_TL_starGiftUnique_layer198() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGift.TL_starGiftUnique_layer198::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGift::TLdeserialize, 198)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionStarGiftUnique_layer202() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionStarGiftUnique_layer202::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 202)

    }

    /**
     * SavedStarGift
     */
    @Test
    public fun test_SavedStarGift_TL_savedStarGift_layer202() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SavedStarGift.TL_savedStarGift_layer202::class,
          space.axolab.axogram.tgnet.tl.TL_stars.SavedStarGift::TLdeserialize, 202)

    }

    /**
     * Message-MessageAction-StarGift
     * StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * UserFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * StarsTransaction-StarGift
     * StarGift
     * SavedStarGift-StarGift
     */
    @Test
    public fun test_StarGift_TL_starGiftUnique_layer202() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGift.TL_starGiftUnique_layer202::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGift::TLdeserialize, 202)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_message_layer205() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_message_layer205::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 205)

    }

    /**
     * UserFull
     */
    @Test
    public fun test_UserFull_TL_userFull_layer200() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserFull.TL_userFull_layer200::class,
          space.axolab.axogram.tgnet.TLRPC.UserFull::TLdeserialize, 200)

    }

    /**
     * User
     */
    @Test
    public fun test_User_TL_user_layer216() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_User.TL_user_layer216::class,
          space.axolab.axogram.tgnet.TLRPC.User::TLdeserialize, 216)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat
     * StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat
     * Chat
     * UserFull-PeerStories-StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat
     * StarsTransaction-MessageMedia-WebPage-Page-PageBlock-Chat
     */
    @Test
    public fun test_Chat_TL_channel_layer203() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_channel_layer203::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, 203)

    }

    /**
     * StarsTransaction
     */
    @Test
    public fun test_StarsTransaction_TL_starsTransaction_layer205() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarsTransaction.TL_starsTransaction_layer205::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarsTransaction::TLdeserialize, 205)

    }

    /**
     * UserFull
     */
    @Test
    public fun test_UserFull_TL_userFull_layer209() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserFull.TL_userFull_layer209::class,
          space.axolab.axogram.tgnet.TLRPC.UserFull::TLdeserialize, 209)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionPaidMessagesPrice_layer203() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionPaidMessagesPrice_layer203::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 203)

    }

    /**
     * Message-MessageAction-StarGift
     * StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * UserFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * StarsTransaction-StarGift
     * StarGift
     * SavedStarGift-StarGift
     */
    @Test
    public fun test_StarGift_TL_starGift_layer206() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGift.TL_starGift_layer206::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGift::TLdeserialize, 206)

    }

    /**
     * Message-MessageAction-StarGift-StarGiftAttribute
     * StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift-StarGiftAttribute
     * UserFull-ChatTheme-StarGift-StarGiftAttribute
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift-StarGiftAttribute
     * StarsTransaction-StarGift-StarGiftAttribute
     * StarGift-StarGiftAttribute
     * SavedStarGift-StarGift-StarGiftAttribute
     */
    @Test
    public fun test_StarGiftAttribute_TL_starGiftAttributeBackdrop_layer221() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGiftAttribute.TL_starGiftAttributeBackdrop_layer221::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGiftAttribute::TLdeserialize, 221)

    }

    /**
     * Message-MessageAction-StarGift
     * StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * UserFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * StarsTransaction-StarGift
     * StarGift
     * SavedStarGift-StarGift
     */
    @Test
    public fun test_StarGift_TL_starGiftUnique_layer206() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGift.TL_starGiftUnique_layer206::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGift::TLdeserialize, 206)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionStarGiftUnique_layer210() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionStarGiftUnique_layer210::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 210)

    }

    /**
     * SavedStarGift
     */
    @Test
    public fun test_SavedStarGift_TL_savedStarGift_layer209() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SavedStarGift.TL_savedStarGift_layer209::class,
          space.axolab.axogram.tgnet.tl.TL_stars.SavedStarGift::TLdeserialize, 209)

    }

    /**
     * Message-MessageMedia-WebPage-Page-PageBlock-Chat
     * StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat
     * Chat
     * UserFull-PeerStories-StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-Page-PageBlock-Chat
     * StarsTransaction-MessageMedia-WebPage-Page-PageBlock-Chat
     */
    @Test
    public fun test_Chat_TL_channel_layer216() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Chat.TL_channel_layer216::class,
          space.axolab.axogram.tgnet.TLRPC.Chat::TLdeserialize, 216)

    }

    /**
     * ForumTopic-DraftMessage-InputReplyTo
     */
    @Test
    public fun test_InputReplyTo_TL_inputReplyToMessage_layer207() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputReplyTo.TL_inputReplyToMessage_layer207::class,
          space.axolab.axogram.tgnet.TLRPC.InputReplyTo::TLdeserialize, 207)

    }

    /**
     * ChatFull
     */
    @Test
    public fun test_ChatFull_TL_channelFull_layer212() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ChatFull.TL_channelFull_layer212::class,
          space.axolab.axogram.tgnet.TLRPC.ChatFull::TLdeserialize, 212)

    }

    /**
     * Message-MessageMedia-TodoCompletion
     * StoryItem-MessageMedia-TodoCompletion
     * UserFull-PeerStories-StoryItem-MessageMedia-TodoCompletion
     * ChatFull-PeerStories-StoryItem-MessageMedia-TodoCompletion
     * StarsTransaction-MessageMedia-TodoCompletion
     */
    @Test
    public fun test_TodoCompletion_TL_todoCompletion_layer216() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_TodoCompletion.TL_todoCompletion_layer216::class,
          space.axolab.axogram.tgnet.TLRPC.TodoCompletion::TLdeserialize, 216)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_message_layer216() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_message_layer216::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 216)

    }

    /**
     * Message-MessageAction-StarGift
     * StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * UserFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * StarsTransaction-StarGift
     * StarGift
     * SavedStarGift-StarGift
     */
    @Test
    public fun test_StarGift_TL_starGift_layer209() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGift.TL_starGift_layer209::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGift::TLdeserialize, 209)

    }

    /**
     * Message-MessageAction-StarGift
     * StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * UserFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * StarsTransaction-StarGift
     * StarGift
     * SavedStarGift-StarGift
     */
    @Test
    public fun test_StarGift_TL_starGiftUnique_layer210() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGift.TL_starGiftUnique_layer210::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGift::TLdeserialize, 210)

    }

    /**
     * Message-MessageReplyHeader
     */
    @Test
    public fun test_MessageReplyHeader_TL_messageReplyHeader_layer223() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageReplyHeader.TL_messageReplyHeader_layer223::class,
          space.axolab.axogram.tgnet.TLRPC.MessageReplyHeader::TLdeserialize, 223)

    }

    /**
     * ForumTopic-DraftMessage-InputReplyTo
     */
    @Test
    public fun test_InputReplyTo_TL_inputReplyToMessage_layer223() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_InputReplyTo.TL_inputReplyToMessage_layer223::class,
          space.axolab.axogram.tgnet.TLRPC.InputReplyTo::TLdeserialize, 223)

    }

    /**
     * UserFull
     */
    @Test
    public fun test_UserFull_TL_userFull_layer210() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserFull.TL_userFull_layer210::class,
          space.axolab.axogram.tgnet.TLRPC.UserFull::TLdeserialize, 210)

    }

    /**
     * Message-MessageAction-StarGift
     * StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * UserFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * StarsTransaction-StarGift
     * StarGift
     * SavedStarGift-StarGift
     */
    @Test
    public fun test_StarGift_TL_starGift_layer212() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGift.TL_starGift_layer212::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGift::TLdeserialize, 212)

    }

    /**
     * SavedStarGift
     */
    @Test
    public fun test_SavedStarGift_TL_savedStarGift_layer211() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SavedStarGift.TL_savedStarGift_layer211::class,
          space.axolab.axogram.tgnet.tl.TL_stars.SavedStarGift::TLdeserialize, 211)

    }

    /**
     * UserFull
     */
    @Test
    public fun test_UserFull_TL_userFull_layer212() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserFull.TL_userFull_layer212::class,
          space.axolab.axogram.tgnet.TLRPC.UserFull::TLdeserialize, 212)

    }

    /**
     * Message-MessageMedia-StoryItem
     * StoryItem
     * UserFull-PeerStories-StoryItem
     * ChatFull-PeerStories-StoryItem
     * StarsTransaction-MessageMedia-StoryItem
     */
    @Test
    public fun test_StoryItem_TL_storyItem_layer223() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StoryItem.TL_storyItem_layer223::class,
          space.axolab.axogram.tgnet.tl.TL_stories.StoryItem::TLdeserialize, 223)

    }

    /**
     * Message-MessageAction-StarGift
     * StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * UserFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * StarsTransaction-StarGift
     * StarGift
     * SavedStarGift-StarGift
     */
    @Test
    public fun test_StarGift_TL_starGiftUnique_layer211() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGift.TL_starGiftUnique_layer211::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGift::TLdeserialize, 211)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionStarGiftUnique_layer214() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionStarGiftUnique_layer214::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 214)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionStarGift_layer217() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionStarGift_layer217::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 217)

    }

    /**
     * Message-MessageAction-StarGift
     * StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * UserFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * StarsTransaction-StarGift
     * StarGift
     * SavedStarGift-StarGift
     */
    @Test
    public fun test_StarGift_TL_starGiftUnique_layer213() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGift.TL_starGiftUnique_layer213::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGift::TLdeserialize, 213)

    }

    /**
     * SavedStarGift
     */
    @Test
    public fun test_SavedStarGift_TL_savedStarGift_layer214() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SavedStarGift.TL_savedStarGift_layer214::class,
          space.axolab.axogram.tgnet.tl.TL_stars.SavedStarGift::TLdeserialize, 214)

    }

    /**
     * UserFull
     */
    @Test
    public fun test_UserFull_TL_userFull_layer213() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserFull.TL_userFull_layer213::class,
          space.axolab.axogram.tgnet.TLRPC.UserFull::TLdeserialize, 213)

    }

    /**
     * Message-MessageAction-StarGift
     * StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * UserFull-ChatTheme-StarGift
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * StarsTransaction-StarGift
     * StarGift
     * SavedStarGift-StarGift
     */
    @Test
    public fun test_StarGift_TL_starGift_layer217() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGift.TL_starGift_layer217::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGift::TLdeserialize, 217)

    }

    /**
     * UserFull
     */
    @Test
    public fun test_UserFull_TL_userFull_layer215() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserFull.TL_userFull_layer215::class,
          space.axolab.axogram.tgnet.TLRPC.UserFull::TLdeserialize, 215)

    }

    /**
     * Message-MessageAction-StarGift
     * StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * UserFull-ChatTheme-StarGift
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * StarsTransaction-StarGift
     * StarGift
     * SavedStarGift-StarGift
     */
    @Test
    public fun test_StarGift_TL_starGiftUnique_layer215() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGift.TL_starGiftUnique_layer215::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGift::TLdeserialize, 215)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionStarGiftUnique_layer221() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionStarGiftUnique_layer221::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 221)

    }

    /**
     * SavedStarGift
     */
    @Test
    public fun test_SavedStarGift_TL_savedStarGift_layer219() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SavedStarGift.TL_savedStarGift_layer219::class,
          space.axolab.axogram.tgnet.tl.TL_stars.SavedStarGift::TLdeserialize, 219)

    }

    /**
     * UserFull
     */
    @Test
    public fun test_UserFull_TL_userFull_layer223() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_UserFull.TL_userFull_layer223::class,
          space.axolab.axogram.tgnet.TLRPC.UserFull::TLdeserialize, 223)

    }

    /**
     * ForumTopic
     */
    @Test
    public fun test_ForumTopic_TL_forumTopic_layer223() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_ForumTopic.TL_forumTopic_layer223::class,
          space.axolab.axogram.tgnet.TLRPC.ForumTopic::TLdeserialize, 223)

    }

    /**
     * Message-MessageAction-StarGift
     * StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * UserFull-ChatTheme-StarGift
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * StarsTransaction-StarGift
     * StarGift
     * SavedStarGift-StarGift
     */
    @Test
    public fun test_StarGift_TL_starGiftUnique_layer219() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGift.TL_starGiftUnique_layer219::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGift::TLdeserialize, 219)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_message_layer220() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_message_layer220::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 220)

    }

    /**
     * Message-MessageAction-StarGift
     * StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * UserFull-ChatTheme-StarGift
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * StarsTransaction-StarGift
     * StarGift
     * SavedStarGift-StarGift
     */
    @Test
    public fun test_StarGift_TL_starGift_layer219() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGift.TL_starGift_layer219::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGift::TLdeserialize, 219)

    }

    /**
     * Message-MessageAction
     */
    @Test
    public fun test_MessageAction_TL_messageActionStarGift_layer219() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_MessageAction.TL_messageActionStarGift_layer219::class,
          space.axolab.axogram.tgnet.TLRPC.MessageAction::TLdeserialize, 219)

    }

    /**
     * Message-MessageMedia-WebPage-WebPageAttribute
     * StoryItem-MessageMedia-WebPage-WebPageAttribute
     * UserFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute
     * StarsTransaction-MessageMedia-WebPage-WebPageAttribute
     */
    @Test
    public fun test_WebPageAttribute_TL_webPageAttributeStarGiftAuction_layer219() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_WebPageAttribute.TL_webPageAttributeStarGiftAuction_layer219::class,
          space.axolab.axogram.tgnet.TLRPC.WebPageAttribute::TLdeserialize, 219)

    }

    /**
     * Message-MessageAction-StarGift
     * StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * UserFull-ChatTheme-StarGift
     * ChatFull-PeerStories-StoryItem-MessageMedia-WebPage-WebPageAttribute-StarGift
     * StarsTransaction-StarGift
     * StarGift
     * SavedStarGift-StarGift
     */
    @Test
    public fun test_StarGift_TL_starGiftUnique_layer221() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_StarGift.TL_starGiftUnique_layer221::class,
          space.axolab.axogram.tgnet.tl.TL_stars.StarGift::TLdeserialize, 221)

    }

    /**
     * SavedStarGift
     */
    @Test
    public fun test_SavedStarGift_TL_savedStarGift_layer221() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_SavedStarGift.TL_savedStarGift_layer221::class,
          space.axolab.axogram.tgnet.tl.TL_stars.SavedStarGift::TLdeserialize, 221)

    }

    /**
     * Message
     */
    @Test
    public fun test_Message_TL_message_layer222() {
      test_TLdeserialize(space.axolab.axogram.tgnet.model.generated.TlGen_Message.TL_message_layer222::class,
          space.axolab.axogram.tgnet.TLRPC.Message::TLdeserialize, 222)

    }
  }
}
