package space.axolab.axogram.tgnet.model.generated

import kotlin.String
import kotlin.UInt
import space.axolab.axogram.tgnet.OutputSerializedData
import space.axolab.axogram.tgnet.model.TlGen_Object
import space.axolab.axogram.tgnet.model.TlGen_Vector

public sealed class TlGen_payments_ExportedInvoice : TlGen_Object {
  public data class TL_payments_exportedInvoice(
    public val url: String,
  ) : TlGen_payments_ExportedInvoice() {
    public override fun serializeToStream(stream: OutputSerializedData) {
      stream.writeInt32(MAGIC.toInt())
      stream.writeString(url)
    }

    public companion object {
      public const val MAGIC: UInt = 0xAED0CBD9U
    }
  }
}
