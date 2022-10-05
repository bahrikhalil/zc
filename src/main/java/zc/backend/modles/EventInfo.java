package zc.backend.modles;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long  infoId ;
    @NonNull
    private Double attitude ;
    @NonNull
    private  Double longitude;
    private  String eventLogo ;
    @JsonFormat( pattern= "dd-MM-yyyy")
    private Date  eventDate ;
}
