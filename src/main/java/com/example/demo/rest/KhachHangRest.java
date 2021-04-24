package com.example.demo.rest;

import com.example.demo.dto.KhachHangDTO;
import com.example.demo.entity.KhachHangBO;
import com.example.demo.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/employee")
public class KhachHangRest {
    @Autowired
    private KhachHangService KhachHangService;

//    @GetMapping("/employees-not-sales")
//    public ResponseEntity<List<KhachHangDTO>> getEmpNotSales(){
//        List<KhachHangDTO> empNotSales = KhachHangService.getEmpNotSales();
//        return  ResponseEntity.ok(empNotSales);
//    }
    @GetMapping("/employees")
    public ResponseEntity<List<KhachHangDTO>> getEmployees(){
        List<KhachHangDTO> data=  KhachHangService.getEmp();
        return ResponseEntity.ok(data);
    }

    @GetMapping("/emp/{maKhachHang}")
    public ResponseEntity<KhachHangDTO> getEmpByMa(@PathVariable String maKhachHang){
        KhachHangDTO emp = KhachHangService.getEmpByString(maKhachHang);
        return  ResponseEntity.status(HttpStatus.CREATED).body(emp);
    }
    @PostMapping("/insertEmp")
    public ResponseEntity<KhachHangDTO> addEmployee(@RequestBody KhachHangBO KhachHangBO){
        KhachHangDTO KhachHangDTO = KhachHangService.insertEmp(KhachHangBO);
        return ResponseEntity.ok(KhachHangDTO);
    }
    @PutMapping("/updateEmp")
    public ResponseEntity<KhachHangDTO> update(@RequestBody KhachHangBO KhachHangBO,@PathVariable String maKhachHang){
        KhachHangDTO KhachHangDTO = KhachHangService.updateEmp(KhachHangBO, maKhachHang);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(KhachHangDTO);
    }
    @DeleteMapping("/{maKhachHang}")
    public ResponseEntity delete(@PathVariable String maKhachHang){
        KhachHangService.deleteEmp(maKhachHang);
      return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
