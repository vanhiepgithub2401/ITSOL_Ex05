package com.example.demo.rest;

import com.example.demo.dto.NhaCungCapDTO;
import com.example.demo.entity.NhaCungCapBO;
import com.example.demo.service.NhaCungCapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/employee")
public class NhaCungCapRest {
    @Autowired
    private NhaCungCapService nhaCungCapService;

//    @GetMapping("/employees-not-sales")
//    public ResponseEntity<List<NhaCungCapDTO>> getEmpNotSales(){
//        List<NhaCungCapDTO> empNotSales = NhaCungCapService.getEmpNotSales();
//        return  ResponseEntity.ok(empNotSales);
//    }
    @GetMapping("/employees")
    public ResponseEntity<List<NhaCungCapDTO>> getEmployees(){
        List<NhaCungCapDTO> data=  nhaCungCapService.getEmp();
        return ResponseEntity.ok(data);
    }

    @GetMapping("/emp/{maNhaCungCap}")
    public ResponseEntity<NhaCungCapDTO> getEmpByMa(@PathVariable String maNhaCungCap){
        NhaCungCapDTO emp = nhaCungCapService.getEmpByString(maNhaCungCap);
        return  ResponseEntity.status(HttpStatus.CREATED).body(emp);
    }
    @PostMapping("/insertEmp")
    public ResponseEntity<NhaCungCapDTO> addEmployee(@RequestBody NhaCungCapBO NhaCungCapBO){
        NhaCungCapDTO NhaCungCapDTO = nhaCungCapService.insertEmp(NhaCungCapBO);
        return ResponseEntity.ok(NhaCungCapDTO);
    }
    @PutMapping("/updateEmp")
    public ResponseEntity<NhaCungCapDTO> update(@RequestBody NhaCungCapBO NhaCungCapBO,@PathVariable String maNhaCungCap){
        NhaCungCapDTO NhaCungCapDTO = nhaCungCapService.updateEmp(NhaCungCapBO, maNhaCungCap);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(NhaCungCapDTO);
    }
    @DeleteMapping("/{maNhaCungCap}")
    public ResponseEntity delete(@PathVariable String maNhaCungCap){
        nhaCungCapService.deleteEmp(maNhaCungCap);
      return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
