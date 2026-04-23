package space.axolab.axogram.tgnet.model.generated

import kotlin.UInt
import space.axolab.axogram.tgnet.OutputSerializedData
import space.axolab.axogram.tgnet.model.TlGen_Object
import space.axolab.axogram.tgnet.model.TlGen_Vector

public sealed class TlGen_FoundStory : TlGen_Object {
  public data class TL_foundStory(
    public val peer: TlGen_Peer,
    public val story: TlGen_StoryItem,
  ) : TlGen_FoundStory() {
    public override fun serializeToStream(stream: OutputSerializedData) {
      stream.writeInt32(MAGIC.toInt())
      peer.serializeToStream(stream)
      story.serializeToStream(stream)
    }

    public companion object {
      public const val MAGIC: UInt = 0xE87ACBC0U
    }
  }
}
