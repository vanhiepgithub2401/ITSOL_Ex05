package com.example.demo.rest;

import com.example.demo.dto.NhanVienDTO;
import com.example.demo.entity.NhanVienBOO;
import com.example.demo.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/employee")
public class NhanVienRest {
    @Autowired
    private NhanVienService nhanVienService;

    @GetMapping("/employees-not-sales")
    public ResponseEntity<List<NhanVienDTO>> getEmpNotSales(){
        List<NhanVienDTO> empNotSales = nhanVienService.getEmpNotSales();
        return  ResponseEntity.ok(empNotSales);
    }
    @GetMapping("/employees")
    public ResponseEntity<List<NhanVienDTO>> getEmployees(){
        List<NhanVienDTO> data=  nhanVienService.getEmp();
        return ResponseEntity.ok(data);
    }

    @GetMapping("/emp/{manhanvien}")
    public ResponseEntity<NhanVienDTO> getEmpByMa(@PathVariable String manhanvien){
        NhanVienDTO emp = nhanVienService.getEmpByString(manhanvien);
        return  ResponseEntity.status(HttpStatus.CREATED).body(emp);
    }
    @PostMapping("/insertEmp")
    public ResponseEntity<NhanVienDTO> addEmployee(@RequestBody NhanVienBOO nhanVienBOO){
        NhanVienDTO nhanVienDTO = nhanVienService.insertEmp(nhanVienBOO);
        return ResponseEntity.ok(nhanVienDTO);
    }
    @PutMapping("/updateEmp")
    public ResponseEntity<NhanVienDTO> update(@RequestBody NhanVienBOO nhanVienBOO,@PathVariable String manhanvien){
        NhanVienDTO nhanVienDTO = nhanVienService.updateEmp(nhanVienBOO, manhanvien);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(nhanVienDTO);
    }
    @DeleteMapping("/{manhanvien}")
    public ResponseEntity delete(@PathVariable String manhanvien){
        nhanVienService.deleteEmp(manhanvien);
      return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
